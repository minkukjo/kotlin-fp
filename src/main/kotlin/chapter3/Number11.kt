package chapter3

class Number11 {

    fun <A> reverse(xs: List<A>): List<A> = foldLeft(xs, empty()) { x: List<A>, y: A -> Cons(y, x)}
}
