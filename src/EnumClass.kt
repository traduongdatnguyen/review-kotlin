
interface TestImplement {
    fun test(a: Int): Int
}

interface TestImplement2 {
    fun test2(b: Int): Int
}


abstract class DefaultPrintable  {
}
class EnumClass :DefaultPrintable(){

}

enum class IPL constructor(val a:Int) : TestImplement, TestImplement2{
    T1(2) {override fun test(a: Int) = a * a } ,
    T2(4) {override fun test(a: Int) = a * a} ;
    override fun test2(b: Int) = b * b
}
fun main(){
    // Use
    val ipl = IPL.T1
    println(ipl.test(2))          // 4
    val ipl2 = IPL.T2
    println(ipl2.test2(4))    // 16
}
