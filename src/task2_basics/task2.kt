// Task 2 - Basic Syntax & Data Types
// Demonstrate variable declarations, data types, conditionals, and loops

fun main() {

    println("----- Kotlin Basic Syntax & Data Types -----\n")

    // 1️. Variable Declarations
    val name: String = "Kritika"     // immutable variable
    var age: Int = 20               // mutable variable

    println("Name: $name")
    println("Age: $age")

    age = 21
    println("Updated Age: $age\n")

    // 2️. Data Types
    val isStudent: Boolean = true
    val percentage: Double = 89.75
    val grade: Char = 'A'

    println("Is Student: $isStudent")
    println("Percentage: $percentage")
    println("Grade: $grade\n")

    // 3️. Conditionals (if-else)
    println("----- Conditionals -----")

    if (percentage >= 90) {
        println("Excellent performance!")
    } else if (percentage >= 75) {
        println("Good performance!")
    } else {
        println("Needs improvement.")
    }
    println()

    // when statement (switch-like)
    val day = 3
    println("----- When Expression -----")

    when (day) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        else -> println("Weekend")
    }
    println()

    // 4. Loops
    println("----- For Loop -----")

    for (i in 1..5) {
        println("Counting: $i")
    }
    println()

    println("----- While Loop -----")
    var count = 5
    while (count > 0) {
        println("Count: $count")
        count--
    }
}
