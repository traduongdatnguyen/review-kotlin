data class ConllectionTypes(private val listsNew: List<Any>, private val setsNew: Set<Any>){
    //create List
    private val _listsNew = listsNew
    private val _setsNew = setsNew

    fun loopLists(){
        for((index,value ) in listsNew.withIndex()){
            println("$index -> $value")
        }
    }
    fun getList(){
         val lists = _listsNew.filter {it == 5}
        if (lists != null){
            println(lists)
        }

    }
    fun addLists(mutableLists: MutableList<Int>){
        mutableLists.add(20)
        println(mutableLists)
    }
}
fun main(){
    val conllectionTypes = ConllectionTypes(listOf<Int>(2,5,7), setOf(5,1))
    conllectionTypes.loopLists()
    conllectionTypes.getList()
    val mutableLists = mutableListOf(5,3,7,10)
    val conllectionTypesMutableList = ConllectionTypes(mutableLists, mutableSetOf(5,3,6))
    conllectionTypesMutableList.addLists(mutableLists)
}