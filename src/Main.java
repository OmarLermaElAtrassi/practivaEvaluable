package com.example.actividadevaluable9_10

/*
 *                                                    F1
 * ================================================================================================================
 * A esta funcion se le pasará una funcion cuadratica donde
 * a -> valor de x²
 * b -> valor de x
 * arraySumatorio -> será el array de 10 elementos cuyo valor sea su indice,
 * se podria crear directamente al llamar a la lambda que la necesita, pero dice que hay que definirla en el main
 *
 * se le pasarán 3 funciones anonimas:
 * a las cuales se les pasará los 3 valores que definen la funcion cuadratica
 *
 * f1 retornara una cadena que albergará los resultados de cada lambda, la cual se definirán en el main
 */
fun f1 (a : Double, b : Double, c : Double, arraySumatorio : DoubleArray,
        ecuacion : (n1 : Double, n2 : Double, n3 : Double) -> DoubleArray,
        operacion : (n4 : Double, n5 : Double, n6 : Double) -> Double,
        sumatorio : (numerosSumatorio : DoubleArray,a : Double, b : Double, c : Double) -> Double) : String{

    val resultado = ecuacion(a,b,c) //almacena el array de ecuacion

    val resOperacion =  operacion(a,b,c) //almacena el resultado de la operacion que multiplica los
                                         // valores a b y c, y en caso de que todos sean 0 devolverá 1.0

    val resSumatorio = sumatorio(arraySumatorio,a,b,c)//almace el resultado del sumatorio del array * a - b * c
    return  "Resultado ecuación: ${resultado.contentToString()}\n" +
            "Resultado operación: $resOperacion\n"+
            "Resultado sumatorio: $resSumatorio"
}
fun main(){
    val sumatorio = DoubleArray(10){it.toDouble()}
    println(f1(1.0, -5.0, 6.0, sumatorio,
        { a, b, c ->
            val discriminante = b * b - 4 * a * c
            when {
                discriminante > 0 -> {
                    // Ecuación con dos soluciones
                    val x1 = (-b + Math.sqrt(discriminante)) / (2 * a)
                    val x2 = (-b - Math.sqrt(discriminante)) / (2 * a)
                    doubleArrayOf(1.0, x1, x2)
                }
                discriminante == 0.0 -> {
                    // Ecuación con una solución
                    val x = -b / (2 * a)
                    doubleArrayOf(2.0, x, 0.0)
                }
                else -> {
                    // Ecuación sin solución
                    doubleArrayOf(0.0, 0.0, 0.0)
                }
            }
        },
        { a, b, c ->
            if (a == 0.0 && b == 0.0 && c == 0.0) //si a b y c es 0 devuelve 1.0
                1.0
            else
                a * b * c
        },
        {  numerosSumatorio: DoubleArray, a: Double, b: Double, c: Double ->
            numerosSumatorio.sum()*a - b*c
        }))
    println("===========================================================================")
    println(f1(1.0, -4.0, 4.0, sumatorio,
        { a, b, c ->
            val discriminante = b * b - 4 * a * c
            when {
                discriminante > 0 -> {
                    // Ecuación con dos soluciones
                    val x1 = (-b + Math.sqrt(discriminante)) / (2 * a)
                    val x2 = (-b - Math.sqrt(discriminante)) / (2 * a)
                    doubleArrayOf(1.0, x1, x2)
                }
                discriminante == 0.0 -> {
                    // Ecuación con una solución
                    val x = -b / (2 * a)
                    doubleArrayOf(2.0, x, 0.0)
                }
                else -> {
                    // Ecuación sin solución
                    doubleArrayOf(0.0, 0.0, 0.0)
                }
            }
        },
        { a, b, c ->
            if (a == 0.0 && b == 0.0 && c == 0.0) //si a b y c es 0 devuelve 1.0
                1.0
            else
                a * b * c
        },
        {  numerosSumatorio: DoubleArray, a: Double, b: Double, c: Double ->
            numerosSumatorio.sum()*a - b*c
        }))
    println("===========================================================================")
    println(f1(1.0, 4.0, 5.0, sumatorio,
        { a, b, c ->
            val discriminante = b * b - 4 * a * c
            when {
                discriminante > 0 -> {
                    // Ecuación con dos soluciones
                    val x1 = (-b + Math.sqrt(discriminante)) / (2 * a)
                    val x2 = (-b - Math.sqrt(discriminante)) / (2 * a)
                    doubleArrayOf(1.0, x1, x2)
                }
                discriminante == 0.0 -> {
                    // Ecuación con una solución
                    val x = -b / (2 * a)
                    doubleArrayOf(2.0, x, 0.0)
                }
                else -> {
                    // Ecuación sin solución
                    doubleArrayOf(0.0, 0.0, 0.0)
                }
            }
        },
        { a, b, c ->
            if (a == 0.0 && b == 0.0 && c == 0.0) //si a b y c es 0 devuelve 1.0
                1.0
            else
                a * b * c
        },
        {  numerosSumatorio: DoubleArray, a: Double, b: Double, c: Double ->
            numerosSumatorio.sum()*a - b*c
        }))
    println("===========================================================================")
    println(f1(0.0, 0.0, 0.0, sumatorio,
        { a, b, c ->
            val discriminante = b * b - 4 * a * c
            when {
                discriminante > 0 -> {
                    // Ecuación con dos soluciones
                    val x1 = (-b + Math.sqrt(discriminante)) / (2 * a)
                    val x2 = (-b - Math.sqrt(discriminante)) / (2 * a)
                    doubleArrayOf(1.0, x1, x2)
                }
                discriminante == 0.0 -> {
                    // Ecuación con una solución
                    val x = -b / (2 * a)
                    doubleArrayOf(2.0, x, 0.0)
                //en este caso x será NaN porque se da una división por 0 ya que a b y c son igual a 0
                }
                else -> {
                    // Ecuación sin solución
                    doubleArrayOf(0.0, 0.0, 0.0)
                }
            }
        },
        { a, b, c ->
            if (a == 0.0 && b == 0.0 && c == 0.0) //si a b y c es 0 devuelve 1.0
                1.0
            else
                a * b * c
        },
        {  numerosSumatorio: DoubleArray, a: Double, b: Double, c: Double ->
            numerosSumatorio.sum()*a - b*c
        }))
}
