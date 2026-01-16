
ep4 = LOAD '/root/inputs/episodeIV_dialogues.txt'
      USING PigStorage('\t')
      AS (character:chararray, dialogue:chararray);

ep5 = LOAD '/root/inputs/episodeV_dialogues.txt'
      USING PigStorage('\t')
      AS (character:chararray, dialogue:chararray);

ep6 = LOAD '/root/inputs/episodeVI_dialogues.txt'
      USING PigStorage('\t')
      AS (character:chararray, dialogue:chararray);

ep4_rank = RANK ep4;
ep5_rank = RANK ep5;
ep6_rank = RANK ep6;

v4 = FILTER ep4_rank BY UPPER(TRIM(character)) == 'VADER'
             AND dialogue IS NOT NULL AND TRIM(dialogue) != '' AND rank_ep4>1;
v5 = FILTER ep5_rank BY UPPER(TRIM(character)) == 'VADER'
             AND dialogue IS NOT NULL AND TRIM(dialogue) != '' AND rank_ep5>1;
v6 = FILTER ep6_rank BY UPPER(TRIM(character)) == 'VADER'
             AND dialogue IS NOT NULL AND TRIM(dialogue) != '' AND rank_ep6>1;

w4 = FOREACH v4 GENERATE FLATTEN(TOKENIZE(LOWER(dialogue))) AS word;
w5 = FOREACH v5 GENERATE FLATTEN(TOKENIZE(LOWER(dialogue))) AS word;
w6 = FOREACH v6 GENERATE FLATTEN(TOKENIZE(LOWER(dialogue))) AS word;

allw = UNION w4, w5, w6;

clean = FILTER allw BY word IS NOT NULL AND TRIM(word) != '';

g = GROUP clean BY word;
counts = FOREACH g GENERATE
           group AS word,
           COUNT(clean) AS count_words;

ordered = ORDER counts BY count_words DESC;
top10 = LIMIT ordered 10;

STORE top10 INTO '/root/sc3_vader_top_words' USING PigStorage('\t');
