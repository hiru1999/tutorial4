package tutorial4

object Q1 {
  def interest(deposit:Double):Double=
  {
    if(deposit<=20000){
      return(deposit*(2/100))
    }
    else if(deposit<=200000){
      return(deposit*(4/100))
    }
    else if(deposit<=2000000){
      return(deposit*(3.5/100))
    }
    else{
      return(deposit*(6.5/100))
    }
  }
  
  def main(args:Array[String]):Unit = 
  {
     print("Enter deposit : ")
     val dep = scala.io.StdIn.readFloat()
     val interestAmount = interest(dep)
     val ActualAmount = 50000.00 + interestAmount
     println(ActualAmount)
  }
}