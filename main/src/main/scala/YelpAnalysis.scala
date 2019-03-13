import org.apache.spark.sql.SparkSession
import org.neo4j.spark._

object YelpAnalysis {
  def main(args: Array[String]): Unit = {
    // Initializing Spark Session and Neo4j Driver
    val spark = SparkSession.builder.appName("Yelp Analysis").getOrCreate()
    val neo = Neo4j(spark.sparkContext)

    spark.stop()
  }
}
