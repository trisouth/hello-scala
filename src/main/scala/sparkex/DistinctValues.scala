package sparkex

import org.apache.spark.sql.SparkSession
object DistinctValues {

    def main(args: Array[String]): Unit = {

        val spark = SparkSession
          .builder
          .appName("Distinct Values")
          .getOrCreate()

        // force the application to run with a single executor
        // below configs are static. can not be set during runtime
        //spark.conf.set("spark.executor.instances", "1")
        //spark.conf.set("spark.executor.cores", "1")

        // read from local parquet file
        val df = spark.read.parquet("/opt/rawdata/yellow_tripdata_2025-01.parquet")

        // display the schema
        df.printSchema()

        // for each column, get the distinct values
        val columns = df.columns
        for (col <- columns) {
            //val distinctValues = df.select(col).distinct().collect().map(_.get(0))
            //println(s"Distinct values for column $col: ${distinctValues.mkString(", ")}")

            val count = df.select(col).distinct().count()
            println(s"Distinct count for column $col: $count")
        
        }

        spark.stop()
    }
  
}
