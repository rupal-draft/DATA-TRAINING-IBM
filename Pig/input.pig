inputFile = load '/root/input.csv' using PigStorage(',') as (id:int,category:chararray,amount:int);
groupedData = group inputFile by category;
categorySum = foreach groupedData generate group as category,sum(group.amount) as total_sales;
rmf /root/output_dir/output_sum;
store category_total into '/root/output_dir/output_sum' using pigstorage(',');










