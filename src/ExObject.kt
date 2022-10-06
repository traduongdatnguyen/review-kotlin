class UserSession private constructor(val id: Int) {

    // Companion (singleton) object
    companion object {
        private val MAX = 100
        private var count = 0
        private fun next() = count++
        fun create(): UserSession {
            return UserSession(count)
            next()
        }
    }
    fun printData() {
        println("Id is $id and MAX is $MAX")
    }
    override fun toString(): String {
        return "UserSession($id)"
    }

}
fun main() {
    // Defines a new object which is anonymous
    val obj = object {
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

    // Use single instance of anonymous object
    println(obj)
    println(obj.MAX)
    println("obj.x = ${obj.x}, obj.y = ${obj.y}")
    obj.x = 50
    println("obj.x = ${obj.x}, obj.y = ${obj.y}")
    obj.printMe()


    val session1 = UserSession.create()
    println(session1)
    val session2 = UserSession.create()
    println(session2)
}