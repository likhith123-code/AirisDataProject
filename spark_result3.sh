#! /bin/bash

# Region Id, Name and Total Sales in each year 

spark-shell <<EOF
val hive = new org.apache.spark.sql.hive.HiveContext(sc);
hive.sql("use practice");
val sales = hive.sql("select * from sales");
val names = hive.sql("select * from IdAndNames");
val joinedTable = sales.join(names,"regionid").select("amount","order_date","regionname","regionid");
val yearColumn = joinedTable.withColumn("order_year",split(joinedTable("order_date"),"-")(0).cast("Int"));
yearColumn.createOrReplaceTempView("Sales_Table")
val result = spark.sql("select sum(amount) as total_sales,regionid,regionname,order_year from Sales_Table group by order_year,regionid, regionname,order_year sort by order_year asc");
result.show(result.collect().length,false);
result.write.mode("overwrite").format("csv").save("/home/hduser/Project/question3_output");
:quit
