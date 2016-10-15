
object Factorial {
	// 꼬리 재귀를 사용해서 stack overflow 를 방지함.
	import scala.annotation.tailrec // 꼬리 재귀 최적화

	def factorial(i:Int):Int = if (i!=0) i*factorial(i-1) else 1

	@tailrec // 다음 함수가 꼬리재귀를 적용할 수 있는 코드인지 검사해준다.
	def fact(n:BigDecimal, acc:BigDecimal = 1):BigDecimal = {
		if (n==0) acc
		else fact(n-1, (acc*n))
	}

	def main(args: Array[String]): Unit = {
		// val ret = factorial(1000000) => stack overflow발생, 꼬리 재귀를 사용해야 함.
		val ret = factorial(3)
		println(ret)

		println(fact(5))
		println(fact(100000))

	}
}