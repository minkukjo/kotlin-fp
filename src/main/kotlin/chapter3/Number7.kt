package chapter3

fun <A> empty(): List<A> = Nil

class Number7 {

    // 그냥 리스트를 생성하는거 아닌가?
    //Cons(1, Cons(2, Cons(3, Nil))) == foldRight의 동작이 동일할 것으로 예상 됨
    fun main() {
        foldRight(
            Cons(1, Cons(2, Cons(3, Nil))),
            Nil as List<Int>
        ) { x, y -> Cons(x, y) }
    }
}
