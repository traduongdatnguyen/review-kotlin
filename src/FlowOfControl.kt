fun main() {
    //The if Statement
    // Check input
    print("Please input a number: ")
    val inputString = readLine()

    if (inputString == null) {
        println("No number input")
    } else {
        // chuyển đổi kiểu thành Int
        val number = inputString.toInt()
        if (number > 0) {
            println("Number is positive")
        } else if (number < 0) {
            println("Number is negative")
        } else {
            println("Number is zero")
        }
    }

    //When Expression
    val value = 11
    when (value) {
        0 -> println("It is a 0")
        1, 2 -> println("It is a 1 or 2")
        3 -> println("It is to high")
        else -> println("Default")
    }

    val message = when(value) {
        0 -> "Invalid number"
        1, 2 -> "Number too low"
        3 -> "Number correct"
        4 -> "Number too high, but acceptable"
        in 5..10 -> "Number too high, might be acceptable" // kiểm tra xem value có thuộc trong phạm vi không
        !in 10..20 -> "What are you on"
        else -> "Bad number"
    }
    println("message: $message")

    //Do while
    println("Do While Example")
    var count = 0
    println("Starting")
    do {
        print("$count, ")
        count++
    } while (count < 10)

    // For Loop
    println("Print out values in a range")
    for (i in 0..9) {
        print("$i, ")
    }
    println()
    println("Done")

    println("Print out values in a range with an increment of 2")
    for (i in 0..9 step 2) {
        print("$i, ")
    }
    println()
    println("Done")

    println("Print out values in a range to but not including 9")
    for (x in 0 until 9)
        print("$x, ")
    println()
    println("Done")

    println("Print out values in a range to but not including 9 with step 2")
    for (x in 0 until 9 step 2) {
        print("$x, ")
    }
    println()
    println("Done")

    println("Iterate down from one value to a lower value")
    for (i in 5 downTo 0) {
        print("$i * $i = ${i*i}; ")
    }
    println()
    println("Done")

}