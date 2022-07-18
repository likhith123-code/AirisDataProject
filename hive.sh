#! /bin/bash

source /home/hduser/Project/properties.config
source /home/hduser/Project/hive_properties.config

hive <<EOF
use practice;
create external table if not exists ${sales_base_table}(regionid int,itemtype string,order_date date,order_id bigint,amount int) row format delimited fields terminated by ',' location '${output_path}/${sales_base_table}/';
create external table if not exists ${names_base_table}(regionid int,regionname string) row format delimited fields terminated by ',' location '${output_path}/${names_base_table}/';
create external table if not exists ${partition_table}(regionid int,amount int) partitioned by(itemtype string);
insert into ${partition_table} partition(itemtype) select regionid,amount,itemtype from ${sales_base_table};
