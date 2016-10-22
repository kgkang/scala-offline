

object List1 extends App {

//	val numbers: List[Int] = List(1,2,3,4)
	val numbers = List(1, 2, 3, 4)
	// val a = numbers.map((x:Int) => x*2)
	// val a = numbers.map(x => x*2)
	val a = numbers.map(_*2)
	println(a)

}