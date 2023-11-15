package chapter3

class Number3 {

    tailrec fun <A> drop(l: List<A>, n: Int): List<A> = when(l) {
        is Nil -> Nil
        is Cons -> {
            if(n ==0) {
                l
            } else {
                drop(l.tail, n-1)
            }
        }
    }
}
