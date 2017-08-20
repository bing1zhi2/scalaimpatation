package chapter2

/**
 * Created by Administrator on 2017/8/20.
 */
class chapter2 {

}
object chapter2{
  def main(args: Array[String]) {
      countdown(10)
    getUnicode("Hello")
    getUnicode2("Hello")
    println(dg("Hello"))
    println(xn(3.0,2))
    println(xn(3.0,-3))
  }
  def countdown(n:Int): Unit ={
    for( i <- 0 to n){
      println(i)
    }
  }
  def getUnicode( str:String): Long ={
    var t=1L
    for(i <- str){
      t=t*i.toLong
    }
    println(t)
    t
  }
  def getUnicode2(str:String):Long={
    var t=1L
//    str.foreach( s=> {
//      t=t*s.toLong
//    })
    str.foreach(t*= _.toLong)
    println(t)
    t
  }

  def dg(str:String):Long={
    if(str.length==1){
      return str.charAt(0).toLong
    }else{
      val s0=str.take(1)
      return s0.charAt(0).toLong * dg(str.drop(1))
    }
  }

  def xn(x :Double ,n :Int):Double={
    if(n == 0) 1
    else if (n>0 && n%2 ==0) xn(x,n/2)*xn(x,n/2)
    else if(n>0 && n%2 == 1) x*xn(x,n-1)
    else 1/xn(x,-n)
  }
}
