package com.spark.main

import  constants.constants
import controllers.queryBuilderCntrol

object main {
    def main(args: Array[String]): Unit = {
        try {
            val query_builder_cntrol = new queryBuilderCntrol();
            val mapQueries : Map[String, List[Any]] = constants.queryMap("query_sample_1");
            query_builder_cntrol.build_query(mapQueries);
        } catch {
            case ex: Exception => {println("Exception Occurred [main]: "+ex.printStackTrace());}
        }// catch closure
    }// main closure
} // object main closure