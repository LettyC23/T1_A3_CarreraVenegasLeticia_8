
//Programa que muestre los DIVISORES de un numero dado

object Programa02 {
  
def divisores(num:Int, x:Int) : Unit = {
  
   if(x > 0){
     if(num % x == 0)
       println("Divisores: " + x)
     
     divisores(num, x-1)
   }
   
  }
  
  def main(args: Array[String]): Unit = {
    println("Programa que muestre los DIVISORES de un numero dado")
    println("Ingrese un numero:")
    var n = 0
    n = readInt()
   
    divisores(n, n)
    
  }
  
}