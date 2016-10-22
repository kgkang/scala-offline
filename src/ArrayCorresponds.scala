

object Test05 extends App {
  val a = Array("Hello","scala","world","!!!")
  val b = Array(5,5,5,3)
  val c = a.corresponds(b)(_.length==_)
  val d = a.corresponds(b)((x:String, y:Int) => (x.length == y))
  println(c)
  println(d)
}