object Solution {
    def solution(n: Int): Int = n.toString.foldLeft(0)(_ + _.asDigit)
}
