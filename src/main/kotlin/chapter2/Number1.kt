package chapter2

class Fibonacci {

    fun calculate(n: Int): Int {

        tailrec fun go(n: Int): Int {
            if (n == 0) {
                return 0
            }
            if (n == 1) {
                return 1
            }

            // 재귀 함수 내에서 tailrec를 쓰지 말라고 경고하네 흠... 어떡하지?
            return go(n - 1) + go(n - 2)
        }
        return go(n)
    }
}

fun main() {
    println(Fibonacci().calculate(6))
}
