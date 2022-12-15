/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
    
    var x : Int = 10
    val y : String ="joe"
    x+=10
    //you cannot change value of ((val)) variable 
    println("Show value of x: ${x}")
    var floatNumberOldStyle  : Float = 5.5f
    var floatNumberNewStyle  = 4.5f
    var longNumberOldStyle : Long = 50000L
    var longNumberNewStyle = 20000L
    
    println("Show value of longs and floats numbers in the right way -> longs : ${longNumberOldStyle} and $longNumberNewStyle "+
            " floats : ${floatNumberOldStyle} and ${floatNumberNewStyle}")
    
    //--------------------------------------------------------------------------------------------------------------------
    //some conditions 
    val true1 = true 
    val true2 = true
    
    var operatorValue= true1 && true2
    println("Show value of operatorValue : $operatorValue")
    var operatorValue2= true1 || true2
    println("Show value of operatorValue2 : $operatorValue2")
    
    //--------------------------------------------------------------------------------------------------------------------
     val number1 = readLine() 
     val number2 = readLine() 
     // double !! ((exclamation mark)) tells to kotlin 
     //we sure about variable would not be null
     var result = number1!!.toInt() + number2!!.toInt() 
     print(result)
    //--------------------------------------------------------------------------------------------------------------------
     val number3 = readLine() ?: "0"
     val number4 = readLine() ?: "0"
     //you can use ?: to tell kotlin if it would be null set (("0"))
     val result2 = number3.toInt() + number4.toInt() 
     print(result)
}