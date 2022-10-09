data class DataSum(val sumArray: ArrayList<Int>)
open interface InterfaceAbstracts{
    abstract fun equaSumMax(a:Int, b:Int)
    abstract fun equaArrayNumber(arraySum: DataSum)
    // Không thể khai báo inner class bên trong một Interface
//    inner class A{
//
//    }
}
class InheritanceInterface(val sumArray_: DataSum, val a: Int, val b: Int) : InterfaceAbstracts {

    override fun equaSumMax(a: Int,b: Int) {
        println("$a + $b = " + (a+b))
    }

    override fun equaArrayNumber(arraySum: DataSum) {
       for ((index,value)in arraySum.sumArray.withIndex() ){
           println("$index => $value")
       }
    }
}
// abstract class
abstract class Calculator {
    abstract fun cal(x: Int, y: Int) : Int
    inner class A{

    }
}
// addition of two numbers
class Add : Calculator() {
    override fun cal(x: Int, y: Int): Int {
        return x + y
    }
    class C{
        inner class D{

        }
    }
}
// subtraction of two numbers
class Sub : Calculator() {
    override fun cal(x: Int, y: Int): Int {
        return x - y
    }
}
// multiplication of two numbers
class Mul : Calculator() {
    override fun cal(x: Int, y: Int): Int {
        return x * y
    }
}

fun main() {
    val dataSum = DataSum(arrayListOf(7,1,9,4,5))
    val InheritanceInterface = InheritanceInterface(dataSum,5,5)
    InheritanceInterface.equaSumMax(InheritanceInterface.a, InheritanceInterface.b)
    InheritanceInterface.equaArrayNumber(InheritanceInterface.sumArray_)
}

