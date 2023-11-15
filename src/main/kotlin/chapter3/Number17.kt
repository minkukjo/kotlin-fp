package chapter3

class Number17 {

    fun <A,B> map(xs: List<A>, f: (A) -> B): List<B> = foldRight(xs, empty()) { x,y -> Cons(f(x), y)}
}

fun main() {
    val test1 = List.of(1.0, 2.0, 3.0, 4.0)

    var append = Number17().map(test1) { a -> a.toString()}
    while(append is Cons<String>) {
        println(append.head)
        append = append.tail
    }
}
