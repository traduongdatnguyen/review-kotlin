open class Employee( name: String,age: Int,salary : Int) {
    init {
        println("My name is $name, $age years old and earning $salary per month. ")
    }
}
class webDeveloper( name: String,age: Int,salary : Int): Employee(name, age,salary) {
    fun website() {
        println("I am website developer")
        println()
    }
}

class androidDeveloper( name: String,age: Int,salary : Int): Employee(name, age,salary) {
    fun android() {
        println("I am android app developer")
        println()
    }
}

class iosDeveloper( name: String,age: Int,salary : Int): Employee(name, age,salary) {
    fun iosapp() {
        println("I am iOS app developer")
        println()
    }
}
//main method
fun main(args: Array<String>) {
    val wd = webDeveloper("Gennady", 25, 10000)
    wd.website()
    val ad = androidDeveloper("Gaurav", 24,12000)
    ad.android()
    val iosd = iosDeveloper("Praveen", 26,15000)
    iosd.iosapp()
}