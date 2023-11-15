package chapter3

class Number13 {

    fun <A> append(xs:List<A>, xd: List<A>): List<A> = foldRight(xs, xd) { x,y -> Cons(x,y )}
}

fun main() {
    val test1 = List.of(1, 2, 3, 4)
    val test2 = List.of(5, 6, 7, 8)

    var append = Number13().append(test1, test2) as Cons<Int>
    while(append as List<Int> != Nil) {
        println(append.head)
        append = append.tail as Cons<Int>
    }
}
