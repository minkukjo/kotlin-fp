package chapter2

class Number2 {

    val <T> List<T>.tail: List<T>
        get() = drop(1)

    val <T> List<T>.head: T
        get() = first()

    // 제가 짠 코드
    fun <A> isSorted(aa: List<A>, order: (A, A) -> Boolean): Boolean {
        for (a in aa) {
            val index = aa.indexOf(a)

            if (index == aa.size - 1) {
                return true
            }

            val b = aa[index + 1]


            if (!order(a, b)) {
                return false
            }
        }

        return true
    }

//    fun <A> isSorted(aa: List<A>, order: (A, A) -> Boolean): Boolean {
//        // 답지를 본 코드
//        tailrec fun sort(a:A, aa:List<A>): Boolean {
//            if(aa.isEmpty()) return true
//            if(!order(a, aa.head)) return false
//            return sort(aa.head, aa.tail)
//        }
//
//        return sort(aa.head, aa.tail)
//    }
}

fun main() {
    val list = listOf(1, 2, 3, 5, 6, 7)
    println(Number2().isSorted(list) { a: Int, b: Int -> a < b })
}
