

object Curring2 extends App {
	val t = (10, "Hello")
	println(t) // (10,Hello)
	println(t._1) // 10
	println(t._2) // Hello

	def adjustToPair(fun:(Int,Int)=>Int) = (x: (Int, Int)) => fun(x._1, x._2)
//	def adjustToPar2
	val x = adjustToPair(_*_)((6,7))
	println(x)
}