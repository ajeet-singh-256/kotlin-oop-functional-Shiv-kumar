// Task 9 - Functional Programming
// Extension functions, functional operations, and a simple DSL

// 1. EXTENSION FUNCTION
fun String.capitalizeWords(): String {
    return this.split(" ").joinToString(" ") { word ->
        word.replaceFirstChar { it.uppercase() }
    }
}

// 2. SIMPLE DSL → building a menu
class Menu {
    private val items = mutableListOf<String>()

    fun item(name: String) {
        items.add(name)
    }

    fun showMenu() {
        println("Menu Items:")
        items.forEach { println("- $it") }
    }
}

fun menu(build: Menu.() -> Unit): Menu {
    val m = Menu()
    m.build()
    return m
}

// 3. MAIN FUNCTION
fun main() {

    println("----- Extension Function Example -----")

    val text = "hello kotlin functional programming"
    println("Original: $text")
    println("Capitalized: ${text.capitalizeWords()}")

    println("\n----- Functional Collection Operations -----")

    val nums = listOf(1, 2, 3, 4, 5)

    val doubled = nums.map { it * 2 }
    val evens = nums.filter { it % 2 == 0 }
    val sum = nums.reduce { acc, n -> acc + n }

    println("Original List: $nums")
    println("Doubled: $doubled")
    println("Even numbers: $evens")
    println("Sum using reduce: $sum")

    println("\n----- Simple DSL Example -----")

    val myMenu = menu {
        item("Burger")
        item("Fries")
        item("Cold Coffee")
        item("Pasta")
    }

    myMenu.showMenu()
}
