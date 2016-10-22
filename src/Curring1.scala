

object Curring1 extends App {
  def factorial1(n:Int) = (1 to n).reduceLeft( (x,y) => if (y==0) 1 else x*y)
//  def factorial2(n:Int) = (1 to n).foldLeft(1)( (x,y) => x*y)
  def factorial2(n:Int) = (1 to n).foldLeft(1)( _ * _) // 첫번째 ()은 초기값, 두번재()은 처리
  println(factorial1(5)) 
  println(factorial2(5)) 
}