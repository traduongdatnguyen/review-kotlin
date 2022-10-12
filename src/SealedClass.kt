sealed class SealedClass{
    class Circle(var radius: Float): SealedClass()
    class Square(var length: Int): SealedClass()
    object Rectangle: SealedClass()
    {
        var length: Int = 0
        var breadth : Int = 0
    }
}

fun eval(e: SealedClass) = when (e) {
        is SealedClass.Circle -> println("Circle area is ${3.14*e.radius*e.radius}")
        is SealedClass.Square -> println("Square area is ${e.length*e.length}")
    SealedClass.Rectangle -> println("Rectangle area is ${Shape.Rectangle.length*Shape.Rectangle.breadth}")
    }
fun main(args: Array<String>) {

    var circle = Shape.Circle(4.5f)
    var square = Shape.Square(4)
    var rectangle = Shape.Rectangle

    eval(circle)       //Circle area is 63.585
    eval(square)       //Square area is 16
    eval(rectangle)
    //eval(x) //compile-time error.

}

//is kiểm tra nếu class đó thuộc một trong các kiểu đã cho và chỉ yêu cầu cho các class