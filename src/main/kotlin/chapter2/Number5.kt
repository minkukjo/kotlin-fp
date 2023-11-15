package chapter2

class Number5 {
    fun <A, B, C> compose(f: (B) -> C, g: (A) -> B): (A) -> C = { a: A -> f(g(a)) }
}

fun main() {
    val compose = Number5().compose(
        f = { b: Int -> b + 1 },
        g = { a: Int -> a + 2 }
    )

    println(compose(1))
}
