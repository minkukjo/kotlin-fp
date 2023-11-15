package chapter3

class Number5 {

    fun <A> init(l: List<A>): List<A> = when(l) {
        is Nil -> Nil
        is Cons -> {
            if(l.tail == Nil) {
                Nil
            } else {
                Cons(l.head, init(l.tail))
            }
        }
    }
}
