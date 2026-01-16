-- Scenario 3


CREATE TABLE sc3_ep4 (character STRING, dialogue STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '\t'
TBLPROPERTIES ("skip.header.line.count"="1");

CREATE TABLE sc3_ep5 (character STRING, dialogue STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '\t'
TBLPROPERTIES ("skip.header.line.count"="1");

CREATE TABLE sc3_ep6 (character STRING, dialogue STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '\t'
TBLPROPERTIES ("skip.header.line.count"="1");

LOAD DATA LOCAL INPATH '/root/inputs/episodeIV_dialogues.txt' INTO TABLE sc3_ep4;
LOAD DATA LOCAL INPATH '/root/inputs/episodeV_dialogues.txt' INTO TABLE sc3_ep5;
LOAD DATA LOCAL INPATH '/root/inputs/episodeVI_dialogues.txt' INTO TABLE sc3_ep6;


INSERT OVERWRITE LOCAL DIRECTORY '/root/sc3_vader_top_words'
ROW FORMAT DELIMITED FIELDS TERMINATED BY '\t'
SELECT
  w AS word,
  COUNT(*) AS count_words
FROM (
  SELECT
    explode(
      split(
        lower(dialogue),
        '\\s+'
      )
    ) AS w
  FROM (
    SELECT dialogue FROM sc3_ep4 WHERE UPPER(TRIM(character)) = 'VADER'
    UNION ALL
    SELECT dialogue FROM sc3_ep5 WHERE UPPER(TRIM(character)) = 'VADER'
    UNION ALL
    SELECT dialogue FROM sc3_ep6 WHERE UPPER(TRIM(character)) = 'VADER'
  ) v
) x
WHERE w IS NOT NULL
GROUP BY w
ORDER BY count_words DESC
LIMIT 10;

