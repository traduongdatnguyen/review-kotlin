fun square(num: Int): Int {
    return num * num
}
fun printMessage(msg: String) {
    println(msg)
}


//Hàm viết tắt
fun incrementer(x: Int) = x * 3
val adder = fun(i: Int) = i + 1


// Hàm ẩn danh
val func = fun(i: Int): Int { return i + 1 }


//Lambda
val increment: (Int) -> Int = { x -> x + 1 }
val increase = { x: Int -> x + 1 }
val func0: () -> Unit = { println("no args") }
val func1: (Int, Int) -> Int = { x, y -> x * y }


// Higher Order Function
fun simpleTaxCalculator(amount: Double) = amount * 0.3
fun calculateTax(salary: Double, func: (Double) -> Double): Double {
    return func(salary)
}


fun main() {
    val result = square(4)
    println("result: $result")
    println("square(5): ${square(5)}")
    if (square(3) < 15) {
        println("square(3) is less than 15")
    }
    printMessage("Hello World")


    println(incrementer(5))
    println(adder(5))
    println(func(5))


    println(increment(5))
    println(increase(5))
    func0()
    println(func1(3, 4))


    val tax = calculateTax(45000.0, ::simpleTaxCalculator)
    println("Tax payable: $tax")
    val tax2 = calculateTax(45000.0) {amount -> amount * 0.25}
    println("Tax payable: $tax2")
}

