package chapter3


class Number10 {

    fun sum(list: List<Int>): Int = foldLeft(list, 0) { x, y -> x + y }

    fun product(list:List<Double>): Double= foldLeft(list , 1.0) { x,y -> x *y}
}

fun main() {
    val list = List.of(1, 2, 3, 4)
    val listDouble = List.of(1.0, 2.0, 3.0, 4.0)
    println(Number10().sum(list))
    println(Number10().product(listDouble))
}
