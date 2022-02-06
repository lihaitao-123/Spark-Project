import org.apache.spark.sql.SparkSession

object TestJob {
  def main(args: Array[String]): Unit = {
    val session: SparkSession = SparkSession.builder().master("local[4]").getOrCreate()
    val context = session.sparkContext
    val value = context.makeRDD(Seq(123, 1234, 12345))
    value.foreach(println)
  }
}
