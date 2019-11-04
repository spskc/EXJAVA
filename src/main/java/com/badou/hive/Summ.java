package com.badou.hive;


import org.apache.hadoop.hive.ql.exec.UDF;

public class Summ extends UDF {

    public String evaluate(String str){


        return  "Hello134" + str;
    }

}
