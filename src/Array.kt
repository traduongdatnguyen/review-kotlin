class DataArrays(val arrs : Array<Students>) {
    var family: Array<Array<String>>
    val numbers = listOf("Nguyen","Trà","Dương","Nguyên")
    val mutableLists = mutableListOf("Nguyen","Trà","Dương","Nguyên")
    val numberSets = setOf("nguyen",2,5,5,"nguyen")
    val arrListOf = arrayOf(2,4);
    val numberMaps = mapOf(2 to "Nguyen")
    val arrNew = Array(3, {i -> i * 1} )



    init {
        family = arrayOf (
            arrayOf("John", "Denise", "Phoebe", "Adam"),
            arrayOf("Paul", "Fi", "Andrew", "James")
        )
    }
    fun showView(){
        println(arrs)
        val family0 = family[0]
        for (name in family0) {
            println(name)
        }
        println()
        family[0][2] = "Jasmine"
        for (name in family[0]) {
            println(name)
        }
        println(family0.size)
        println("first(): ${family0.first()}")
        println("last(): ${family0.last()}")
        println("copyOf(): ${family0.copyOf()}")
        println("sliceArray(2..3): ${family0.sliceArray(2..3)}")
        println("family0.takeLast(2): ${family0.takeLast(2)}")
        println("family0.isEmpty(): ${family0.isEmpty()}")
        println("family0.isNotEmpty(): ${family0.isNotEmpty()}")
        println("mutableLists.asReversed(): ${mutableLists.asReversed()}")
    }
}
data class Students(val iD:Int, val name:String)
fun main(){

    val dataArrays = DataArrays(arrayOf(Students(5,"nguyen")))
    dataArrays.showView()
    println(dataArrays.numbers[3])
    println(dataArrays.numbers.lastIndex)
    dataArrays.mutableLists.set(0,"Đạt")
    dataArrays.mutableLists.add("Hello")
    println(dataArrays.mutableLists)
    println(dataArrays.numberSets)
    dataArrays.arrListOf.set(1,5)
    println(dataArrays.arrListOf[1])
    for (i in 0..dataArrays.arrNew.size-1)
    {
        println(dataArrays.arrNew[i])
    }

}