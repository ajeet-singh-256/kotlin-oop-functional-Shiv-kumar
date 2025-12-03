// Task 4 - OOP Basics
// Demonstrating classes, objects, inheritance, and access modifiers

// Base class (Parent)
open class Person(private val name: String, protected var age: Int) {

    fun introduce() {
        println("Hi, I'm $name and I am $age years old.")
    }
}

// Derived class (Child)
class Student(name: String, age: Int, private val grade: String) : Person(name, age) {

    fun showDetails() {
        introduce()  // inherited method
        println("I am in grade $grade.")
    }

    fun birthday() {
        age++   // age is protected → accessible inside child
        println("Happy Birthday! New age: $age")
    }
}

// Another class demonstrating public access
class Teacher(val name: String, val subject: String) {

    fun teach() {
        println("Teacher $name is teaching $subject.")
    }
}

fun main() {

    println("----- OOP Basics in Kotlin -----")

    // Creating object of Person
    val p = Person("Aarav", 30)
    p.introduce()

    println()

    // Creating object of Student
    val s = Student("Kritika", 20, "A")
    s.showDetails()
    s.birthday()

    println()

    // Creating object of Teacher
    val t = Teacher("Rohan", "Mathematics")
    t.teach()
}
