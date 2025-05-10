
package org.example
import kotlin.math.pow
import java.text.DecimalFormat
fun calculo_cuadratica(a:Double, b:Double, c:Double, x:Double): Double{
    return a*x*x+b*x+c
}
fun discriminante(a:Double, b:Double, c:Double): Double{
    return b*b-4*a*c
}
fun raices(a:Double, b:Double, c:Double): String{
    val formato = DecimalFormat("0.00")
    var raiz = discriminante(a,b,c).pow(1.0/2.0)
    if(discriminante(a,b,c)<0){
        println("discriminante negativo, no se pueden calcular raices")
    }
    return ("x1 = ${formato.format((-b+ raiz)/(2.0*a))} \nx2 = ${formato.format((-b- raiz)/(2.0*a))}")
}
fun main() {
    val a = 3.0
    val b = -8.0
    val c = 4.0
    if (a == 0.0){
        println("a tiene que ser distinto a 0")
    }
    println("($a)x²+($b)x+($c)")
    for (i in -5..5){
        var x = i.toDouble()
        println("para x = $i, y = ${calculo_cuadratica(a,b,c,x)}")
    }
    println(discriminante(a, b, c))
    println(raices(a, b, c))
}
