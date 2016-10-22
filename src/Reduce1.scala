
object Reduce1 extends App {

	val a = new Array[Int](10).map( x => util.Random.nextInt(10))
	println(a)
	println(a.max)
	println(a.mkString(","))

	val max = a.reduceLeft((a,b) => if(a>b) a else b)
	println(max)
}