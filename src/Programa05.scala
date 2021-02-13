//Programa que muestre cuantos son los divisores enteros entre dos números dados

object Programa05 {
   def divisores(n:Int, c:Int, c2:Int): Unit={
     
    var d=c2
    if(c>0){
    if(n%c == 0){
      d+=1
    }
    divisores(n, c-1, d)
    }else{
      println("Numero de divisores: "+c2)
    }
  }
  
  def main(args: Array[String]): Unit = {
    println("Programa que muestre cuantos son los divisores enteros entre dos números dados")
    println("Ingrese un numero: ")
    val num = readInt()
    divisores(num, num, 0)
  }
}