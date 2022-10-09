class Util {

    // Top level nested class defined within the scope of Util namespace
    class Printer {
        fun print(msg: String) {
            println(this.javaClass.name + " - " + msg)
        }
    }

    // Top level interface defined within the scope of the Util namespace
    interface Printable {
        fun convert(): String?
    }

    // Top level object defined within the scope of the Util namespace
    object Session {
        val id = 2
        fun doSomething() {
            println("Do Something")
        }
    }

    // Abstract top level class defined within the scope of the Util namespace
    abstract class DefaultPrintable : Printable {
        abstract val name: String?
    }
}
class Outer {
    private val bar: Int = 1
    inner class Inner {
        fun foo() = bar
    }
}
fun main() {
    val printer = Util.Printer()
    printer.print("Hello World")

    val showView= Outer().Inner().foo()
    println(showView)
}