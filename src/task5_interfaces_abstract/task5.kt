// Task 5 - Interfaces & Abstract Classes
// Demonstrating interfaces, abstract classes, and implementation in Kotlin

// Abstract Class
abstract class Animal(val name: String) {

    // abstract function (must be implemented by subclass)
    abstract fun sound()

    // normal function
    fun info() {
        println("Animal Name: $name")
    }
}

// Interface
interface Runnable {
    fun run()
}

interface Eatable {
    fun eat()
}

// Subclass implementing abstract class + multiple interfaces
class Dog(name: String) : Animal(name), Runnable, Eatable {

    override fun sound() {
        println("$name says: Woof Woof!")
    }

    override fun run() {
        println("$name is running fast!")
    }

    override fun eat() {
        println("$name is eating food.")
    }
}

// Another class implementing only interface
class Cat(name: String) : Animal(name), Eatable {

    override fun sound() {
        println("$name says: Meow Meow!")
    }

    override fun eat() {
        println("$name is eating fish.")
    }
}

fun main() {

    println("----- Interfaces & Abstract Classes in Kotlin -----")

    // Dog object
    val dog = Dog("Bruno")
    dog.info()
    dog.sound()
    dog.run()
    dog.eat()

    println()

    // Cat object
    val cat = Cat("Kitty")
    cat.info()
    cat.sound()
    cat.eat()
}
