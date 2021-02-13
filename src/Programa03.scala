//Programa que muestre el FACTORIAL de un numero dado

object Programa03 {
  
    def factorial(i:Int, n:Int, r:Int): Unit = {
      
    if(i <= n)
      factorial(i+1, n, r * i)
    else
      println("RESULTADO: " + r)
    
  }
  
  def main(args: Array[String]): Unit = {
    println("Programa que muestre el FACTORIAL de un numero dado")
    println("Ingrese un numero: ")
    var n = readInt()
    
    factorial(1, n, 1)
  }
}