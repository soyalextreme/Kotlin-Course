// Constantes antes de la funcion
// Variables generadas antes de la funcion
// Declarar en tiempo de compilacion
const val PI = 3.1416

fun main(args: Array<String>) {
    // Delcaradas en tiempo de ejecucion
//    println("Hello World!")
//    var money : Int = 10
//    println(money)
//    money = 5
//    println(money)
//
//    // variable de solo lectura -> no puedes cambiar el valor una vez que ya
//    // lo asignaste
//    val namePerson = "Alejandro"
////    namePerson = "Jona" -> error solo variable de lectura
//    println(namePerson)
//    println(PI)
//
//    val odd : Boolean = true
//    // soporte para numeros mas grandes
//    val numberLong: Long = 3L
//    // Flotantes .
//    val double: Double = 2.2131
//    // Porcentaje de luminasidad
//    val float: Float = 2.31f
//
//    val firstValue = 20
//    val secondValue = 10
////    val thirdValue = firstValue.minus(secondValue)
//    val result = firstValue - secondValue
//    println(result)
//
//    // Kotlin all is an object, this objects are transformed to
//    // primitive variables en time execution if the variable is not a null type
//    val name: String = "Alejandro"
//    val lastName: String = "Andrade"
//    val age: Int = 23
//    //! template string
//    val fullName: String = "My name is $name $lastName and Im $age old"
//    println(fullName)

    val name = "Li"


    if (name.isNotEmpty()) {
        println("Len of the name ${name.length}")
    } else {
        println("Error! Empty name")
    }

    // asignacion inmutable
    val msj: String = if (name.length > 4) {
        "Your name is long"
    }  else if (name.isEmpty()){
        "Name is empty"
    }
    else {
        "Your name is short"
    }


    println(msj)


//    if (name.isNotEmpty()) println("Len of name is ${name.length}") else println("name is empty ")
}