
interface TestImplement {
    fun test(a: Int): Int
}

interface TestImplement2 {
    fun test2(b: Int): Int
}

enum class IPL : TestImplement, TestImplement2 {
    T1 {override fun test(a: Int) = a * a } ,
    T2 {override fun test(a: Int) = a * a} ;
    override fun test2(b: Int) = b * b
}
abstract class DefaultPrintable  {
}
class EnumClass :DefaultPrintable(){

}
fun main(){
    // Use
    val ipl = IPL.T1
    println(ipl.test(2))          // 4
    val ipl2 = IPL.T2
    println(ipl2.test2(4))    // 16
}
