
object Reduce {
	def factreduce(low:Int, high:Int) = {
		(low to high) reduceLeft(_*_)
	}

	def factorial(n:Int) = {
		(0 to n).reduceLeft( (a,b) => if(a==0) 1 else (a*b))
	}

	def main(args: Array[String]): Unit = {
		var fact1 = factreduce(1,10)
		println(fact1)

		val fact2 = factorial(10)
		println(fact2)

	}
}