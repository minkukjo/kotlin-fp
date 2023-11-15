package chapter3

fun <A,B> foldRight(xs: List<A>, z:B, f: (A,B) -> B): B = when(xs) {
    is Nil -> z
    is Cons -> f(xs.head, foldRight(xs.tail,z,f))
}

class Number6 {
    // 가능하지않을까? 미리 0.0이 되는지 검사해보고 종료를 시켜버리면 되지않으려나??
}
