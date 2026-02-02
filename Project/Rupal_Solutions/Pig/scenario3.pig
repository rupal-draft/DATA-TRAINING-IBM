
ep4 = LOAD '/root/inputs/episodeIV_dialogues.txt'
      USING PigStorage('\t')
      AS (character:chararray, dialogue:chararray);

ep5 = LOAD '/root/inputs/episodeV_dialogues.txt'
      USING PigStorage('\t')
      AS (character:chararray, dialogue:chararray);

ep6 = LOAD '/root/inputs/episodeVI_dialogues.txt'
      USING PigStorage('\t')
      AS (character:chararray, dialogue:chararray);

v4 = FILTER ep4 BY UPPER(TRIM(character)) == 'VADER'
             AND dialogue IS NOT NULL AND TRIM(dialogue) != '';
v5 = FILTER ep5 BY UPPER(TRIM(character)) == 'VADER'
             AND dialogue IS NOT NULL AND TRIM(dialogue) != '';
v6 = FILTER ep6 BY UPPER(TRIM(character)) == 'VADER'
             AND dialogue IS NOT NULL AND TRIM(dialogue) != '';

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
