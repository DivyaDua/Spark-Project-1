import org.apache.log4j.{Level, Logger}
import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.sql.SparkSession

object SparkConfigObject {

  Logger.getLogger("org").setLevel(Level.OFF)

  val sparkConf: SparkConf = new SparkConf().setAppName("Spark-Assignment-1")
    .setMaster("local[4]")

  val sparkSession: SparkSession = SparkSession.builder().config(sparkConf).getOrCreate()
  val sparkContext: SparkContext = sparkSession.sparkContext

}



