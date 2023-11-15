package chapter2

class Number4 {

    fun <A, B, C> uncurry(f: (A) -> (B) -> C): (A, B) -> C = { a: A, b: B -> f(a)(b) }
}
fun main() {
    val uncurry = Number4().uncurry(
        f = {a:Int -> {b:Int -> a+b } }
    )

    println(uncurry(4,5))
}
