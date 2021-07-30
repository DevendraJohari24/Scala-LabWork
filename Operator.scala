

object Operator {
  def main(args: Array[String]){
    var a = 10;
    var b = 4;
    var c = true;
    var d = false;
    var result = 0;
    
    // using Arithmetic Operator
    println("Addition is : " + (a + b));
    println("Substraction is : " + (a - b));
    
    // using Relational Operator
    if (a == b){
      println("Equal to Operator is True");
    }
    else
    {
      println("Equal to Operator is False");
    }
    
    //using Logical Operator 'OR'
    
    println("Logical OR of a || b = " + (c || d));
    
    // using Bitwise AND Operator
    result = a & b;
    println("Bitwise AND : "+ result);
    
    //using Assignment Operators
    println("Addition Assignment Operator : " + (a += b));
  }
}