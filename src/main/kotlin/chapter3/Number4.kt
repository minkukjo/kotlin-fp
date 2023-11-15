package chapter3


class Number4 {
    tailrec fun <A> dropWhile(l: List<A>, f: (A) -> Boolean): List<A> = when(l) {
        is Nil -> l
        is Cons -> {
            if(f(l.head)) {
                dropWhile(l.tail, f)
            } else {
                l
            }
        }
    }
}
