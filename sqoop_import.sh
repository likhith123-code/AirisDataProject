#! /bin/bash

source /home/hduser/Project/properties.config

hdfs dfs -rm -r ${output_path}

sqoop import --connect "jdbc:mysql://localhost/project" --username ${username} --password ${password} --table ${salestable} --columns 'regionid,itemtype,order_date,order_id,amount' --target-dir ${output_path}/${salestable} --delete-target-dir

sqoop import --connect "jdbc:mysql://localhost/project" --username ${username} --password ${password} --table ${namestable} --columns 'regionId,regionName' --target-dir ${output_path}/${namestable} --delete-target-dir


