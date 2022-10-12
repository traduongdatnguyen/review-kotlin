class Obj {
    inner class A{
//        object H{
//
//        }
    }

// Defines a new object which is anonymous
    val obj = object : Ojb(){
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
    abstract class Ojb
}
fun main(){
    val Obj = Obj()
    print(Obj.obj)
}
