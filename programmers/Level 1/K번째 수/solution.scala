object Solution {
    def solution(array: Vector[Int], commands: Vector[Vector[Int]]): Vector[Int] = {
        commands
            .map(c => (c(2) - 1, array.slice(c(0) - 1, c(1))))
            .map { case (index, arr) => (index, arr.sorted) }
            .map { case (index, arr) => arr(index) }
            .toVector
    }
}
