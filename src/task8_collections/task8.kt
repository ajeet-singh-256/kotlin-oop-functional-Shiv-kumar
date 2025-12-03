// Task 8 - Collections in Kotlin
// Working with lists, sets, maps and performing transformations

fun main() {

    println("----- LISTS IN KOTLIN -----")

    val numbers = listOf(5, 2, 9, 1, 7)
    println("Original List: $numbers")

    val sortedNumbers = numbers.sorted()
    println("Sorted List: $sortedNumbers")

    val evenNumbers = numbers.filter { it % 2 == 0 }
    println("Even Numbers: $evenNumbers")

    val squaredNumbers = numbers.map { it * 2 }
    println("Squared (each * 2): $squaredNumbers")


    println("\n----- MUTABLE LIST -----")

    val mutableList = mutableListOf("Apple", "Banana", "Cherry")
    println("Initial Mutable List: $mutableList")

    mutableList.add("Dates")
    mutableList.remove("Banana")

    println("Updated Mutable List: $mutableList")


    println("\n----- SETS IN KOTLIN -----")

    val setExample = setOf(1, 2, 2, 3, 4, 4, 5)
    println("Set (removes duplicates): $setExample")

    val mutableSet = mutableSetOf(10, 20, 30)
    mutableSet.add(20)
    mutableSet.add(40)

    println("Mutable Set: $mutableSet")


    println("\n----- MAPS IN KOTLIN -----")

    val studentMarks = mapOf(
        "Kritika" to 89,
        "Aarav" to 92,
        "Rohan" to 76
    )

    println("Student Marks: $studentMarks")
    println("Kritika's Marks: ${studentMarks["Kritika"]}")

    val mutableMarks = mutableMapOf(
        "Aarav" to 92,
        "Kritika" to 89
    )

    mutableMarks["Rohan"] = 76     // adding new entry
    mutableMarks["Kritika"] = 95   // updating entry

    println("Updated Marks: $mutableMarks")


    println("\n----- COLLECTION TRANSFORMATIONS -----")

    val names = listOf("kritika", "aarav", "rohan")

    val capitalized = names.map { it.replaceFirstChar { c -> c.uppercase() } }
    println("Capitalized Names: $capitalized")

    val filtered = names.filter { it.startsWith("k") }
    println("Names starting with 'k': $filtered")

    val lengths = names.associateWith { it.length }
    println("Name → Length Map: $lengths")
}
