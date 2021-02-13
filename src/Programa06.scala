//Programa que muestre la conversión de un numero decimal a su representación en sistema binario

object Programa06 {
  def conversion(n:Int, s:String): Unit={
    var r = 0
    var n2 = n
    var c = s
    
    if(n2>=0 && n2<=1){
     c=n2+c
      println("Binario: " + c)
      
  }else if(n2>=2){
      r= n%2
      n2=n2/2
      c=r+c
      
      println("Binario: " + c)
      conversion(n2, c)
     
  }
  }
  
  def main(args: Array[String]): Unit = {
    println("Programa que muestre la conversión de un numero decimal a su representación en sistema binario")
   println("Ingrese un numero: ")
    val n = readInt()
    
    conversion(n, "")
    
    
  }
}