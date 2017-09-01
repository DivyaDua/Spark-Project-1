import java.io.{File, PrintWriter}

import SparkConfigObject._
import org.apache.spark.rdd.RDD

class RddOperations {

  def getRDD(filePathString: String): RDD[String] = sparkContext.textFile(filePathString)

  def tenRecordsOfRDD(rDD: RDD[String]): List[String] = rDD.take(10).toList

  def writeRecordsToFile(list: List[String]): PrintWriter = {
    new PrintWriter(new File("src/main/resources/output.txt" )) {
      write(list.mkString("\n"))
      close()
    }
  }

  def countOfRecords(rDD: RDD[String]): Long = rDD.count()

  def englishPages(rDD: RDD[String]): RDD[String] = {
    rDD.filter(record => record.split(" ")(0) == "en")
  }

  def mostRequestedPages(rDD: RDD[String]): List[(String, Int)] = {
    rDD.map(record => (record.split(" ")(1), record.split(" ")(2).toInt)).reduceByKey(_ + _).filter(_._2 > 200000).collect().toList
  }

}

