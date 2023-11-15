package chapter3

class Number15 {

    fun addOne(xs: List<Int>): List<Int> = foldRight(xs, empty()) {x,y -> Cons(x+1, y)}

}
fun main() {
    val test1 = List.of(1, 2, 3, 4)

    var append = Number15().addOne(test1)
    while(append is Cons<Int>) {
        println(append.head)
        append = append.tail
    }
}
