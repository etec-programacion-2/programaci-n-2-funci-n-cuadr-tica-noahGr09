
package org.example
fun calculo_cuadratica(a:Double, b:Double, c:Double, x:Double): Double{
    return a*x*x+b*x+c
}
fun main() {
    val a = 3.0
    val b = -6.0
    val c = 21.0
    if (a == 0.0){
        println("a tiene que ser distinto a 0")
    }
    println("($a)x²+($b)x+($c)")
    for (i in -5..5){
        var x = i.toDouble()
        println("para x = $i, y = ${calculo_cuadratica(a,b,c,x)}")
    }
}
