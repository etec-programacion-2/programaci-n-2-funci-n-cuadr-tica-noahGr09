
package org.example
import kotlin.math.pow //importación para hacer la potencia
import java.text.DecimalFormat //importación para formatear a dos decimales
fun calculo_cuadratica(a:Double, b:Double, c:Double, x:Double): Double{
    return a*x*x+b*x+c //calcula y, para x segun los parámetros que le pasemos
}
fun discriminante(a:Double, b:Double, c:Double): Double{
    return b*b-4*a*c //calcula el discriminante de una función cuadrática, según los coeficientes que le pasemos
}
fun raices(a:Double, b:Double, c:Double): String{
    val formato = DecimalFormat("0.00")//formato de dos decimales
    var raiz = discriminante(a,b,c).pow(1.0/2.0)//guardamos en una variable la raiz cuadrada del discriminante
    if(discriminante(a,b,c)>0.0){
        println("Raices: RRD")
    } else if (discriminante(a,b,c)==0.0){
        println("Raices: RRI")
    }//se muestra el tipo de raiz según el discriminante
    if(discriminante(a,b,c)<0){
        println("Raices: RCC")//lo mismo pero en este bloque de código, para ahorrar lineas
        return ("discriminante negativo, no se pueden calcular raices")//verifica la positividad del discriminante
    } else{
        return ("x1 = ${formato.format((-b+ raiz)/(2.0*a))} \nx2 = ${formato.format((-b- raiz)/(2.0*a))}")
    }//si el discriminante es positivo, se retorna en una cadena, el valor de x1 y x2 formateado a dos decimales

}
fun main() {
    //definimos los coeficientes
    val a = 2.0
    val b = -4.0
    val c = 8.0
    //verificamos la positividad de "a"
    if (a == 0.0){
        println("a tiene que ser distinto a 0")
    }
    println(" La función es: ($a)x²+($b)x+($c)")//mostramos la funcion, luego de definir los coefificientes
    for (i in -5..5){
        var x = i.toDouble()
        println("para x = $i, y = ${calculo_cuadratica(a,b,c,x)}")
    }//mostramos y, para x con distintas x
    println("El discriminante es: ${discriminante(a, b, c)}")//mostramos el discriminante
    println(raices(a, b, c))//mostramos las raices
}
