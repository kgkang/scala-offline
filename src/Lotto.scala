import scala.util.Random
object Lotto {
	def main(args: Array[String]): Unit = {
		var lotto = List.range(1,46)
		var a = Random.shuffle(lotto)
		val b = a.slice(0,6); //0~5
		val c = b.sorted
		val d = c mkString "," // c.mkString(",") 와 같은 표현
		// 1 to 100 => 1.to(100) 과 같은 표현임
		println(d)
	}
}