

object EvenOrOddMultiple {
    // Main method 
      def main(args: Array[String]) 
      { 
        println("Number is 5") 
        evenOrodd(5); 
      } 
      //Nested Function
      
      def evenOrodd(a:Int) = {
        def isEven(){
          def checkEven() = {
              if(a%2==0){
              println("Even")
            }
          }
          checkEven();
          
        }
        def isOdd(){
          def checkOdd() = {
            if(a%2 != 0){
              println("Odd")
            }
          }
          checkOdd();
          
        }
        isEven();
        isOdd();
      }
}