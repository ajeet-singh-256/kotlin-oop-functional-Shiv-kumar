// Task 6 - Null Safety in Kotlin
// Demonstrating nullable vs non-nullable types, safe calls, and the Elvis operator

fun main() {

    println("----- Null Safety in Kotlin -----")

    // 1. Non-nullable variable
    val name: String = "Kritika"
    println("Non-nullable name: $name")

    // 2. Nullable variable
    var nickname: String? = null
    println("Nullable nickname: $nickname")

    // 3. Safe Call Operator (?.)
    println("\n----- Safe Call Operator (?.) -----")
    println("Length of nickname (safe call): ${nickname?.length}")

    nickname = "Kittu"
    println("Updated nickname length (safe call): ${nickname?.length}")

    // 4. Elvis Operator (?:)
    println("\n----- Elvis Operator (?:) -----")
    val displayName = nickname ?: "No Nickname"
    println("Display Name: $displayName")

    nickname = null
    val displayName2 = nickname ?: "Default Name"
    println("Display Name when null: $displayName2")

    // 5. Not-null assertion (!!) - risky
    println("\n----- Not-null Assertion (!!) -----")
    nickname = "Kitty"
    println("Nickname uppercase (using !!): ${nickname!!.uppercase()}")
}
