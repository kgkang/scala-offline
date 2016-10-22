

object CaseMatch1 extends App {
  // Tuple2 => 2개 데이타의 tuple
  // Tuple2~Tuple22 까지 있음.
  
  def swap1(p: Tuple2[Int,Int])= { (p._2, p._1)  }
  def swap2(p: Tuple2[Int,Int]) = { p.swap }
  def swap3(p: Tuple2[Int,Int]) = {
    p match {
      case (y,x) => (x,y)
      case _ => println("잘못된 요청")
    }
  }
  
  
  
  val x = (1,2)
  println(swap1(x))
  println(swap2(x))
  println(swap3(x))
}