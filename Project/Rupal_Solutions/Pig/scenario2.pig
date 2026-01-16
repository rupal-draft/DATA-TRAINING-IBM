-- Scenario 2

ep5_raw = LOAD '/root/inputs/episodeV_dialogues.txt'
          USING PigStorage('\t')
          AS (character:chararray, dialogue:chararray);

ep5_ranked = RANK ep5_raw;
ep5_proj   = FOREACH ep5_ranked GENERATE
               rank_ep5_raw AS rn, 
               character    AS character,
               dialogue     AS dialogue;
ep5_clean  = FILTER ep5_proj BY rn > 1
                           AND character IS NOT NULL AND TRIM(character) != '';
ep5_chars  = FOREACH ep5_clean GENERATE UPPER(TRIM(character)) AS character;
ep5_dist   = DISTINCT ep5_chars;


ep6_raw = LOAD '/root/inputs/episodeVI_dialogues.txt'
          USING PigStorage('\t')
          AS (character:chararray, dialogue:chararray);

ep6_ranked = RANK ep6_raw;
ep6_proj   = FOREACH ep6_ranked GENERATE
               rank_ep6_raw AS rn,
               character    AS character,
               dialogue     AS dialogue;
ep6_clean  = FILTER ep6_proj BY rn > 1
                           AND character IS NOT NULL AND TRIM(character) != '';
ep6_chars  = FOREACH ep6_clean GENERATE UPPER(TRIM(character)) AS character;
ep6_dist   = DISTINCT ep6_chars;


both = JOIN ep5_dist BY character, ep6_dist BY character;

recurring = FOREACH both GENERATE ep5_dist::character AS character;

recurring_dist = DISTINCT recurring;

ordered = ORDER recurring_dist BY character ASC;

rmf /root/sc2_result_pig_simple;

STORE ordered INTO '/root/sc2_result_pig_simple' USING PigStorage('\t');
