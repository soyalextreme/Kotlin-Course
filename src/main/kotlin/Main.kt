// Constantes antes de la funcion
// Variables generadas antes de la funcion
// Declarar en tiempo de compilacion
const val PI = 3.1416

fun main(args: Array<String>) {
    // Delcaradas en tiempo de ejecucion
    println("Hello World!")
    var money : Int = 10
    println(money)
    money = 5
    println(money)

    // variable de solo lectura -> no puedes cambiar el valor una vez que ya
    // lo asignaste
    val namePerson = "Alejandro"
//    namePerson = "Jona" -> error solo variable de lectura
    println(namePerson)
    println(PI)
}