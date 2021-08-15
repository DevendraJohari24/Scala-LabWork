

object EvenOrOdd {
    // Main method 
      def main(args: Array[String]) 
      { 
        println("Number is 5") 
        evenOrodd(5); 
      } 
      //Nested Function
      def evenOrodd(a:Int) = {
        def isEven(){
          if(a%2==0){
            println("Even")
          }
        }
        def isOdd(){
          if(a%2 != 0){
            println("Odd")
          }
        }
        isEven();
        isOdd();
      }
}