import scala.io.StdIn.readLine
import scala.util.Random

object Test1 extends App {
  	var lotto = List.range(0,9)
		var a = Random.shuffle(lotto)
		val b = a.slice(0,3); //0~2
  	val c = b.map(_.toString.toInt)
		println(c)
  	
  	println("숫자 야구 게임을 시작합니다!")
  	// while(true) {
  	  println("3개의 숫자를 입력하세요(예:123):")
  	  val s = readLine
  	  val t = s.toList
  	  println(t)
  	
      var i = 0
      var strikes = 0
      var balls = 0
  	  for ( i <- 0 to 2) {
//  	    ball = if t.contains(x) 1 else 0 

  	    if (t(i).equals(c(i)) ) {
  	      println("Strike!! \n")
  	      strikes += 1
  	    }
  	    println(t(i), c(i))

  	  }
  	
  	  println("Strikes : ", strikes)
  	  // val strikes = 
//  	  if (s.equals("exit"))
//  	    break
  	  
  	// }
}