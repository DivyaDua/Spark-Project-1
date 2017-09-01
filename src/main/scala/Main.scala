import org.apache.log4j.Logger
import org.apache.spark.rdd.RDD

object Main extends App {

  val logger = Logger.getLogger("spark")
  val filePath = "src/main/resources/pagecounts-20151201-220000"

  val rddOperations: RddOperations = new RddOperations
  val pagecounts =  rddOperations.getRDD(filePath)

  rddOperations.writeRecordsToFile(rddOperations.tenRecordsOfRDD(pagecounts))

  logger.info("Total number of records: "+ rddOperations.countOfRecords(pagecounts))

  val englishPages: RDD[String] = rddOperations.englishPages(pagecounts)
  logger.info("Count of English Pages: " + rddOperations.countOfRecords(englishPages))

  logger.info("Pages requested more than 200000 times are: " + rddOperations.mostRequestedPages(pagecounts))

}


