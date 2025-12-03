// Task 10 - Builder Pattern & DSL Implementation
// Demonstrating a builder pattern and a simple DSL in Kotlin


// 1. BUILDER PATTERN


class Course private constructor(
    val title: String,
    val duration: Int,
    val instructor: String,
    val topics: List<String>
) {
    class Builder {
        private var title: String = ""
        private var duration: Int = 0
        private var instructor: String = ""
        private val topics = mutableListOf<String>()

        fun title(title: String) = apply { this.title = title }
        fun duration(hours: Int) = apply { this.duration = hours }
        fun instructor(name: String) = apply { this.instructor = name }
        fun topic(topic: String) = apply { this.topics.add(topic) }

        fun build(): Course {
            return Course(title, duration, instructor, topics)
        }
    }

    fun showCourseDetails() {
        println("Course Title: $title")
        println("Duration: $duration hours")
        println("Instructor: $instructor")
        println("Topics:")
        topics.forEach { println("- $it") }
    }
}


// 2. DSL - Domain Specific Language


class Form {
    private val fields = mutableListOf<String>()

    fun field(name: String) {
        fields.add(name)
    }

    fun show() {
        println("Form Fields:")
        fields.forEach { println("- $it") }
    }
}

fun form(build: Form.() -> Unit): Form {
    val f = Form()
    f.build()
    return f
}


// MAIN FUNCTION


fun main() {

    println("----- Builder Pattern Example -----")

    val course = Course.Builder()
        .title("Kotlin Programming")
        .duration(40)
        .instructor("Dr. Sharma")
        .topic("Basics of Kotlin")
        .topic("OOP in Kotlin")
        .topic("Coroutines")
        .topic("Functional Programming")
        .build()

    course.showCourseDetails()

    println("\n----- DSL Form Example -----")

    val registrationForm = form {
        field("Full Name")
        field("Email Address")
        field("Phone Number")
        field("Department")
    }

    registrationForm.show()
}
