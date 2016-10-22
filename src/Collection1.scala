import scala.collection.mutable._

object Collection1 extends App {
  def indexes(s: String) = {
    var res = new HashMap[Char, LinkedHashSet[Int]]()
    for ( (c,i) <- s.zipWithIndex ) {
      val set = res.getOrElse(c.toChar, new LinkedHashSet[Int])
      set += i
      res(c.toChar) = set
    }
    res
  }
  
  val x = indexes("Missisipi")
  println(x) // Map(M->Set(0), s->Set(2,3,5), ...
}