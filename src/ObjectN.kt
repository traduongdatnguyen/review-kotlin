fun main() {
// Defines a new object which is anonymous
    val obj = object{
        var x: Int = 0
        val y = 42
        val MAX: Int

        init {
            MAX = 100
        }

        fun printMe() {
            println("Print Me")
        }
    }
}
