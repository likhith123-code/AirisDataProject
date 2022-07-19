#! /bin/bash

source /home/hduser/Project/properties.config
source /home/hduser/Project/hive_properties.config

hive <<EOF

use practice;
insert overwrite local directory  './question1_output' row format delimited fields terminated by '\t' select regionid,sum(amount) from ${sales_base_table} group by regionid;
insert overwrite local directory './question2_output' row format delimited fields terminated by '\t' select c.itemtype,sum(c.amount) as totalsales, i.regionname from ${partition_table} c join ${namestable} i on (c.regionid=i.regionid) where c.itemtype = 'Cosmetics' group by c.itemtype,i.regionname order by totalsales desc;



