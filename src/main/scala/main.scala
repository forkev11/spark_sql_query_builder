package com.spark.main

import  constants.constants
import controllers.queryBuilderCntrol

object main {
    def main(args: Array[String]): Unit = {
        try {
            val query_builder_cntrol = new queryBuilderCntrol();
            val mapQueries : Map[String, List[Any]] = constants.queryMap("query_sample_1");
            val selectString : String = query_builder_cntrol.create_Select_Section(mapQueries("select"));
            println(selectString)
            
        } catch {
            case ex: Exception => {println("Exception Occurred [main]: "+ex.printStackTrace());}
        }// catch closure
    }// main closure
} // object main closure