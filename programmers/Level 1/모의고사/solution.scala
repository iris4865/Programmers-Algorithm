object Solution {
    def solution(answers: Vector[Int]): Vector[Int] = {
        val solves = Seq(
            Vector(1, 2, 3, 4, 5),
            Vector(2, 1, 2, 3, 2, 4, 2, 5),
            Vector(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)
        )
        
        val scores = solves
            .map(xs => (0 until answers.size).map(i => i % xs.length).map(xs))
            .map(xs => xs zip answers)
            .map(xs => xs.filter(t => t._1 == t._2).size)
        
        (0 until scores.size)
            .filter(i => scores(i) == scores.max)
            .map(x => x + 1)
            .toVector
    }
}
