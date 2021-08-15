

object InlineFunction {
   def main(args: Array[String]) 
      { 
        var addOne = (x:Int) => x+1
        println(addOne(10));
        println(checkZero(5)); 
        println(add(4,5));
        println(mul(4,5));
      } 
   
    
   
   def checkZero = (x:Int) => if (x==0) true else false
   
   def add = (x:Int, y:Int) => x+y
   
   def mul = (x:Int , y:Int) => x*y
}