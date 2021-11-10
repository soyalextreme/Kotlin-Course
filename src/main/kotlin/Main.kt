import java.lang.Exception
import java.lang.NullPointerException

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

//    val name = "Li"
//
//
//    if (name.isNotEmpty()) {
//        println("Len of the name ${name.length}")
//    } else {
//        println("Error! Empty name")
//    }
//
//    // asignacion inmutable
//    val msj: String = if (name.length > 4) {
//        "Your name is long"
//    }  else if (name.isEmpty()){
//        "Name is empty"
//    }
//    else {
//        "Your name is short"
//    }
//
//
//    println(msj)

    // WHEN DATA CONTROL

//    val colorName= "Carmesi"
//
//    when (colorName.lowercase()) {
//        "yellow" -> {
//            val anotherTask = true
//            println("$colorName is the color of joy ")
//        }
//        "red", "carmesi" -> println("$colorName is the color of blood")
//        else -> println("Ups! Color is not registered")
//    }
//
//    val codeNum = 501
//    when (codeNum) {
//        in 200..299 -> println("Response $codeNum , Everything on order!")
//        in 400..500 -> println("Response $codeNum , Something went wrong")
//        else -> println("$codeNum no code register for this response")
//    }
////    if (name.isNotEmpty()) println("Len of name is ${name.length}") else println("name is empty ")
//
//    val shoesSize = 45
//
//    // with assign to the value we always need to include de else for the
//    // default value
//    val msj = when(shoesSize){
//        41, 43 -> "Size available"
//        42, 44 -> "Short Stack"
//        45 -> "Only by order! your a big foot"
//        else -> "No stack"
//    }
//
//    println(msj)


//    var counter = 10

//    while (counter > 0){
//        println("Counter val: $counter")
//       counter--
//    }
//
//
//
//    do {
//        println("Generating num random")
//        val numRandom = (0..100).random()
//        println("Random num: $numRandom")
//    }while (numRandom < 50)

//    val fruitsList = listOf<String>("Apple", "Strawberry", "Peach")
//    for (fruit in fruitsList) {
//        println("Fruit is $fruit")
//    }
//
//    fruitsList.forEach { newFruit -> println("Fruit of each is $newFruit") }
//
//    val charOfFruits: List<Int> = fruitsList.map { f -> f.length }
//
//    println(charOfFruits)
//
//    val filterList = charOfFruits.filter { fCharAmount -> fCharAmount > 5 }
//    // should print only strawberry
//    println(filterList)

//    var nombre: String? = null

/*
* Double bang
* Mala practica porque no nos aseguramos que no sea null
* puede marcar error
* NullPointerException
* */
//    nombre!!.length

//    try {
//        throw NullPointerException("Null Error reference")
//    } catch (e : NullPointerException){
//        println("$e")
//    } finally {
//       println("Closing app, error detected")
//    }
//
//    val valA = 0
//    val valB = 10
//    val result: Int = try {
//        valB/valA
//    }catch (e: Exception){
//        println("$e")
//        // last line returns the value
//        0
//    }
//    println(result)

//    var name: String? = null
//    // Elvis Operator
//    /* ?: [default value]
//    * Da un valor predeterminado en el caso de que el valor
//    * sea null.
//    *
//    * */
//    val charName: Int = name?.length ?: 0
//    print("$name $charName")

    // INMUTABLE
    val nameList = listOf<String>("Alejandro", "Fernando", "Camila")
    println(nameList)

    // MUTABLE
    val mutableList = mutableListOf<String>()
    println(mutableList)
    mutableList.add("Alfredo")
    println(mutableList)


    // OPERADOR INDEXADO
    val usingIndex = mutableList[0]
    // USING FUN GET
    val usingGet = mutableList.get(0)
    println(usingGet)
    println(usingIndex)

    // RETURNS FIRST VALUE
    val firstValue: String? = nameList.firstOrNull { name -> name.startsWith("F") }
    println(firstValue)

    // REMOVE AT
    mutableList.removeAt(0)
    println(mutableList)

    mutableList.add("Li")
    mutableList.add("Alejandro")
    mutableList.add("Sho")

    // REMOVE IF FUN
    mutableList.removeIf { name -> name.length > 3 }
    println(mutableList)

    // ARRAY
    // ARRAY + MAS PERFORMANCE
    val myArr = arrayOf(1, 2, 3, 4, 5)
    println("My arr: $myArr")
    // print array as cast
    println("Arr as list: ${myArr.toList()}")


}