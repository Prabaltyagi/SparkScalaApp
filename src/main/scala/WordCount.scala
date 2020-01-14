import org.apache.spark._
import org.apache.log4j._

/** Count up how many of each word appears in a file .
 * */
object WordCount {

  /** main function from where the action starts
   * */
  def main(args: Array[String]) {
    // Set the log level to only print errors
    Logger.getLogger("org").setLevel(Level.ERROR)

    // Create a SparkContext using every core of the local machine
    val sc = new SparkContext("local[*]", "WordCount")

    // Read each line of the any text file into an RDD
    val input = sc.textFile("D:/hadoopWork/SparkScalaTest/test.txt")

    // Split into words separated by a space character
    val words = input.flatMap(x => x.split(" "))

    // Count up the occurrences of each word
    val wordCounts = words.countByValue()

    // Print the results.
    wordCounts.foreach(println)
  }

}


