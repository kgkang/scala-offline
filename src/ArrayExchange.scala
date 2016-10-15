

// 정수 배열의 인접한 원소를 교환하는 루프를 작성하라
// Array(1,2,3,4,5) => Array(2,1,4,3,5)
object ArrayExchange {
	def main(args: Array[String]): Unit = {
		val arr1 = Array(1,2,3,4,5)
		val arr2 = Array(6,7,8,9,10)
		val arr3 = arr1 ++ arr2

		println(arr3.mkString(","))
	}
}