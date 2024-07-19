package com.spark.main

object main {
    def main(args: Array[String]): Unit = {
        try {
            println("Hola mundo");
        } catch {
            case ex: Exception => {println("Exception Occurred [main]: "+ex.printStackTrace());}
        }// catch closure
    }// main closure
} // object main closure