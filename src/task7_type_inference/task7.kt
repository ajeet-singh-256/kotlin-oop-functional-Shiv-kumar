// Task 7 - Type Inference & Smart Casting
// Demonstrating type inference and Kotlin smart casting

fun printTypeInfo(value: Any) {
    // Smart casting using 'is'
    when (value) {
        is Int -> println("$value is an Integer, doubled = ${value * 2}")
        is String -> println("$value is a String, length = ${value.length}")
        is Boolean -> println("$value is a Boolean, reversed = ${!value}")
        else -> println("$value is of unknown type")
    }
}

fun main() {

    println("----- Type Inference in Kotlin -----")

    // Type inference examples
    val number = 42              // Inferred as Int
    val name = "Kritika"         // Inferred as String
    val percentage = 89.5        // Inferred as Double
    val isActive = true          // Inferred as Boolean

    println("number (Int): $number")
    println("name (String): $name")
    println("percentage (Double): $percentage")
    println("isActive (Boolean): $isActive")

    println("\n----- Smart Casting with 'is' -----")

    printTypeInfo(number)
    printTypeInfo(name)
    printTypeInfo(isActive)
    printTypeInfo(3.14)
}
