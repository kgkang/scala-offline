
object Sum  {

  def sumJavaStyle = {
    	var sum = 0
	    for ( i <- 1 to 100) {
		    if (i%2 == 1)
			    sum += i
	    }

	    println(sum);
  }

  def sumScalaStyle = {
  	// 스칼라스런 코드
    val hap = (1 to 100).sum
    println(hap)
  }

  def sumScalaFilter1 = {
  	val hap = (1 to 100).filter((i:Int)=>i%2==1).sum
  	println(hap)
  }

  def isEven(i: Int):Boolean = i%2==0
  def isOdd(i:Int):Boolean = i%2==1
  def sumScalaFilter2 = {
  	val hap = (1 to 100).filter(isOdd).sum
  	println(hap)
  }

  // 스칼라 스러운 마지막 코드 ...
  def sumScalaFilter3 = {
  	val hap = (1 to 100).filter( _%2 == 1).sum
  	println(hap)
  }

  def main(args: Array[String]): Unit = {
  //    sumJavaStyle
  //    sumScalaStyle
  //    sumScalaFilter
  	sumScalaFilter1
  	sumScalaFilter2
  	sumScalaFilter3

  }

}

