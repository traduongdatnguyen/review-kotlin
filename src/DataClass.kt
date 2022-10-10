
open class Game
abstract class AbTrac
interface ShowData
data class GameContent(val x: Double, val y: Double) : Game(),ShowData
sealed class Shape{
    class Circle(var radius: Float): Shape()
    class Square(var length: Int): Shape()
    object Rectangle: Shape()
    {
        var length: Int = 0
        var breadth : Int = 0
    }
}

fun eval(e: Shape) =
    when (e) {
        is Shape.Circle -> println("Circle area is ${3.14*e.radius*e.radius}")
        is Shape.Square -> println("Square area is ${e.length*e.length}")
        Shape.Rectangle -> println("Rectangle area is ${Shape.Rectangle.length*Shape.Rectangle.breadth}")
    }
fun main(args: Array<String>) {

    var circle = Shape.Circle(4.5f)
    var square = Shape.Square(4)
    var rectangle = Shape.Rectangle

    eval(circle)       //Circle area is 63.585
    eval(square)       //Square area is 16
    eval(rectangle)    //Rectangle area is 20
    //eval(x) //compile-time error.

    val inst1 = GameContent(10.0, 10.0)
    println(inst1)
    val inst2 = GameContent(10.0, 10.0)
    // uses default implementation of toString()
    println(inst2)
    println("x: ${inst2.x}, obj2.y: ${inst2.y}")
    // uses default implementation of equals()
    println(inst1 == inst2)
// Uses default implementation of hashCode()
    println(inst1.hashCode())

}