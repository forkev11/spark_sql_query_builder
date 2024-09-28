# Spark SQL query builder

## Overview
This project aims to address this challenge by providing a fluent, type-safe query builder for Spark SQL. Using this library, you can construct SQL queries in pure Scala code, without the need for string manipulation or manual query construction.

## Getting Started

To get a local copy up and running follow these simple example steps.

### Prerequisites

To compile, run, test, and package this project: [OpenJDK](https://openjdk.org/install/)/[JDK](https://docs.oracle.com/en/java/javase/11/install/overview-jdk-installation.html) 8, 11 or 17, and [sbt](https://www.scala-sbt.org/1.x/docs/Setup.html) >= 1.0.0 are required.


### Run this project

1. Clone the repo:
   ```sh
   $ git clone https://github.com/0zymandia5/spark_sql_query_builder.git
   ```
2. Navigate to the project directory:
   ```sh
   $ cd ./spark_sql_query_builder
   ```
3. Start the sbt interactive shell:
   ```sh
   $ sbt
   ```
   - A message like this will show up:
     ```console
      [info] started sbt server
     ```

4. Compile the project:
   ```sh
   sbt:spark_sql_query_builder> compile
   ```
   - An output like this will show up:
     ```console
      [success] Total time: 4 s, completed Sep 28, 2024, 1:46:22 PM
     ```
5. Run the compiled project:
   ```sh
   sbt:spark_sql_query_builder> run
   ```
   - An output like this will show up:
     ```console
      [info] running com.spark.main.main
      SELECT geo AS GEO_NAME, mkt AS MARKET_NAME, COUNTRY_NAME FROM Hierarchy h
      [success] Total time: 0 s, completed Sep 28, 2024, 1:48:07 PM
6. To exit the sbt interactive shell:
   ```sh
   sbt:spark_sql_query_builder> exit
   ```


## License

Distributed under the MIT License. See `LICENSE` for more information.
