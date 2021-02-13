//Programa que mueste la sumatoria de numeros enteros desde un limite inicial hasta un limite final

object Programa01 {
def sumatoriaRecursiva(i:Int, f:Int, sum:Int) : Unit = {
  
     if(i <= f){
       println("Sumatoria: " + (sum + i))
       sumatoriaRecursiva(i + 1, f, sum + i)
     }
  }

  
  def main(args: Array[String]): Unit = {
    println("Programa que mueste la sumatoria de numeros enteros desde un limite inicial hasta un limite final")
    var n1 = 0
    println("Ingrese numero para limite inicial: ")
    n1 = readInt();
    var n2 = 0
    println("Ingrese numero para limite final: ")
    n2 = readInt();
    
    sumatoriaRecursiva(n1, n2, 0)
    
  }
  
}