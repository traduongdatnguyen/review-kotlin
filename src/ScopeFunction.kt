class User(val name: String) {
    var id: String = ""
    var game: String = ""

    override fun toString(): String {
        return "User(name='$name', id='$id', game='$game')"
    }
}

class Service(val url: String) {
    var port = 80
    fun query(method: String): Boolean {
        println("$method on $url:$port")
        return true
    }
}

fun main() {
    val user = User("John").apply {
        this.id = "123"
        game = "Nightfall"
    }
    println("${user.id} ${user.name}")

    val s = "Hello World"
    val s2 = s.let { it.toUpperCase() }
    val s3 = s.let {
        println(it)
        it.toUpperCase()
    }

    val label = with(user) {
        id = "new$id"
        game = "new$game"
        println(this)
        this.toString()
    }
    println("label: $label")

    val user2 = user.also { println(it) }

    val service = Service("http://www.midmarsh.com")
    val result = service.run {
        port = 8080
        query("get")
    }
    println("result: $result")

    service.takeIf { service.port > 1024 }?.run {
        println(query("get"))
    }

    service.takeUnless{service.port > 1024 }?.run {
        println(query("get"))
    }

}
