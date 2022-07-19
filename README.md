# AirisDataProject

- Sales table with columns order_id, order_category, order_date, region_id and amount
- Names table with columns region_id and region_name

Sales table contains records of various orders in multiple regions from the year 2010 to 2017. Names table contains region id and corresponding region name

## Project Outline

- Importing the data from SQL to HDFS using Sqoop
- Loading data from HDFS to Hive
- Processing the data using HiveQL and Spark
- Saving data in the files and exporting to the MySQL

## Results Obtained

1. Total number of sales(amount) from 2010 to 2017 for each Region Id 
2. Region Name and total numbers of sales in the Category Cosmetics from 2010 to 2017 
3. Region Id,Name and total sales in the each year
4. Region Name with Highest Order in Each Category in year 2010
