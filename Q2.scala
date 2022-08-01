package tutorial4

object Result {
 
    def PatternMatching(var1: Int) = var1 match {
 
      case zero if (var1==( 0 | -1))=>println("Negative/Zero")
      case even if var1 % 2 == 0 => println("even")
      case odd =>println("odd")
    }
 


    def main(args: Array[String]) {
        print("Enter value : ")
        val var1 = scala.io.StdIn.readInt()
        PatternMatching(var1)
    }
}