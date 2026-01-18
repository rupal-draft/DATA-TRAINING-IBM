ep4 = LOAD '/root/inputs/episodeIV_dialogues.txt' USING PigStorage('\t') AS (Character:chararray, dialogue:chararray);

ep5 = LOAD '/root/inputs/episodeV_dialogues.txt' USING PigStorage('\t') AS (Character:chararray, dialogue:chararray);

ep6 = LOAD '/root/inputs/episodeVI_dialogues.txt' USING PigStorage('\t') AS (Character:chararray, dialogue:chararray);

combined_data = UNION ep4, ep5, ep6;

interrupted_lines = FILTER combined_data BY dialogue MATCHES '.*\\.\\.\\.$';

grp_intrpted_lines = GROUP interrupted_lines BY Character;

max_interrupted = FOREACH grp_intrpted_lines GENERATE
    group AS Characters,
    COUNT(interrupted_lines) AS number_of_interrupted_lines;

ordered_result = ORDER max_interrupted BY number_of_interrupted_lines DESC;

rmf root/sc4_output_pig;

STORE ordered_result
INTO 'root/sc4_output_pig'
USING PigStorage('\t');
