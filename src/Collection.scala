

object Collection {
	def values(fun:(Int)=>Int,low:Int,high:Int) = {
		(low to high) map { x => (x, fun(x))}
	}
	def main(args: Array[String]): Unit = {
		val ret = values(x=>x*x, -5, 5)
		println(ret) // Vector((-5,25),(-4,16),,,,,)
	}
}