import org.apache.spark.sql.SparkSession

object sample {
  def main(args: Array[String]): Unit = {
    val sc = SparkSession.builder().appName("just try it").master("local").getOrCreate()
    val ramdom = List(1,3,4,7,3,6,9,3)
    val randomrdd = sc.sparkContext.parallelize(ramdom,2)

    println("num of records " + randomrdd.count())
  }
}
