-- Scenario 2



CREATE TABLE sc2_ep5 (
    character STRING,
    dialogue  STRING
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY '\t'
TBLPROPERTIES ("skip.header.line.count"="1");

CREATE TABLE sc2_ep6 (
    character STRING,
    dialogue  STRING
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY '\t'
TBLPROPERTIES ("skip.header.line.count"="1");

LOAD DATA LOCAL INPATH '/root/inputs/episodeV_dialogues.txt'
INTO TABLE sc2_ep5;

LOAD DATA LOCAL INPATH '/root/inputs/episodeVI_dialogues.txt'
INTO TABLE sc2_ep6;

INSERT OVERWRITE LOCAL DIRECTORY '/root/sc2_result'
ROW FORMAT DELIMITED
FIELDS TERMINATED BY '\t'
SELECT DISTINCT UPPER(TRIM(ep5.character)) AS recurring_character
FROM sc2_ep5 ep5
JOIN sc2_ep6 ep6
  ON UPPER(TRIM(ep5.character)) = UPPER(TRIM(ep6.character))
WHERE ep5.character IS NOT NULL
  AND ep6.character IS NOT NULL 
ORDER BY recurring_character;

