// Task 3 - Functions & Lambdas
// Demonstrating function declarations, parameters,
// lambda expressions, and higher-order functions

fun main() {

    println("----- Function Declarations -----")

    // Simple function
    fun greet() {
        println("Hello from a simple function!")
    }
    greet()

    // Function with parameters
    fun add(a: Int, b: Int): Int {
        return a + b
    }
    println("Sum of 10 and 20 = ${add(10, 20)}")

    // Function with default parameter
    fun welcome(name: String = "Guest") {
        println("Welcome, $name!")
    }
    welcome()
    welcome("Kritika")


    println("\n----- Lambda Expressions -----")

    // Simple lambda
    val square = { x: Int -> x * x }
    println("Square of 5 = ${square(5)}")

    // Lambda with two arguments
    val multiply: (Int, Int) -> Int = { a, b -> a * b }
    println("Multiply 4 * 7 = ${multiply(4, 7)}")


    println("\n----- Higher-Order Functions -----")

    // Higher-order function (takes lambda as argument)
    fun operateOnNumbers(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
        return operation(a, b)
    }

    val resultAdd = operateOnNumbers(10, 5) { x, y -> x + y }
    println("10 + 5 = $resultAdd")

    val resultSubtract = operateOnNumbers(10, 5) { x, y -> x - y }
    println("10 - 5 = $resultSubtract")

    val resultMultiply = operateOnNumbers(10, 5, multiply)
    println("10 * 5 = $resultMultiply")
}
