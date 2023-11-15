package chapter2

class Number3 {

    fun <A, B, C> curry(f: (A, B) -> C): (A) -> (B) -> C = { a -> { b -> f(a, b) } }
}

fun main() {
    val curry = Number3().curry(
        f = { a: Int, b: Int -> a + b }
    )

    println(curry(1)(2))
}
