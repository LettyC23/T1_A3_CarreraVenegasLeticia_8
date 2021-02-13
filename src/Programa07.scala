//Programa que calcule a cantidad de vocales en una cadena

object Programa07 {
  
 def vocales(cadena:String, c:Int, c2:Int):Unit ={
   
    var v=c2
    
    if(c<cadena.length()){
      if(cadena.charAt(c).isLetter){
        if(cadena.charAt(c).toUpper=='A' || cadena.charAt(c).toUpper=='E' || cadena.charAt(c).toUpper=='I' 
          || cadena.charAt(c).toUpper=='O' || cadena.charAt(c).toUpper=='U'){
        v+=1
      }
    }
    vocales(cadena, c+1, v)
    
      }else{
        
        println("Cantidad de vocales: " + v)
      }
  }
  
  def main(args: Array[String]): Unit = {
    println("Programa que calcule a cantidad de vocales en una cadena")
    println("Ingrese una cadena: ")
    val cad = readLine()
    
    vocales(cad, 0, 0)
  }
}