-- Scenario 1


data = LOAD '/root/inputs/episodeIV_dialogues.txt'
       USING PigStorage('\t')
       AS (character:chararray, dialogue:chararray);

ranked = RANK data;


ranked_proj = FOREACH ranked GENERATE
                rank_data       AS rn,
                character AS character,
                dialogue  AS dialogue;

clean_headless = FILTER ranked_proj BY rn > 1;

clean = FILTER clean_headless BY
          character IS NOT NULL AND TRIM(character) != ''
       AND dialogue  IS NOT NULL AND TRIM(dialogue)  != '';

chars = FOREACH clean GENERATE UPPER(TRIM(character)) AS character;

grp = GROUP chars BY character;
counts = FOREACH grp GENERATE
           group AS character,
           COUNT(chars) AS number_of_dialogues;

ordered = ORDER counts BY number_of_dialogues DESC;

STORE ordered INTO '/root/sc1_result_pig_simple' USING PigStorage('\t');