package chapter3

class Number16 {

    fun toString(xs: List<Double>): List<String> = foldRight(xs, empty()) {x,y -> Cons(x.toString(), y)}
}


fun main() {
    val test1 = List.of(1.0, 2.0, 3.0, 4.0)

    var append = Number16().toString(test1)
    while(append is Cons<String>) {
        println(append.head)
        append = append.tail
    }
}
