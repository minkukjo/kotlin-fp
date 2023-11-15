package chapter3

class Number2 {

    fun <A> setHead(xs: List<A>, x: A): List<A> = when(xs) {
        is Nil -> Nil
        is Cons -> Cons(x, xs.tail)
    }
}
