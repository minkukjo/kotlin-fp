package chapter3

class Number8 {

    fun <A> length(xs: List<A>): Int = when(xs) {
        is Nil -> 0
        is Cons -> {
            foldRight(xs, 0) { _, y -> y + 1 }
        }
    }
}
