-- Scenario 1(Hive solution)

CREATE TABLE sc1 (
    character STRING,
    dialogue  STRING
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY '\t'
TBLPROPERTIES ("skip.header.line.count"="1");

LOAD DATA LOCAL INPATH '/root/inputs/episodeIV_dialogues.txt'
INTO TABLE sc1;

INSERT OVERWRITE LOCAL DIRECTORY '/root/sc1_result'
ROW FORMAT DELIMITED
FIELDS TERMINATED BY '\t'
SELECT
    UPPER(TRIM(character)) AS Characters,
    COUNT(*) AS number_of_dialogues
FROM sc1
WHERE character IS NOT NULL
  AND dialogue IS NOT NULL
GROUP BY UPPER(TRIM(character))
ORDER BY number_of_dialogues DESC;


