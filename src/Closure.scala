

object Largest {
	def largest(fun:(Int)=>Int,inputs: Seq[Int]) = {
		inputs.map(fun(_)).max
	}
	// def largest2(fun:(Int)=>Int,inputs: Seq[Int]) = {
	// 	Seq map { x => (x, fun(x))}
	// }
	def main(args: Array[String]): Unit = {
		println(largest(x=>10*x-x*x,1 to 10))
	}
}