

object Unless {
	def unless(condition: => Boolean)(block: => Unit) {
		if (!condition) {block}
	}
	def main(args: Array[String]): Unit = {
		unless(0>1){println("Unless")} // Unless, false일때 실행
	}
}