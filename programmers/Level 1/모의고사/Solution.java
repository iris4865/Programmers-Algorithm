import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] answers) {
        int[][] picks = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5},
        };
        
        int[] scores = {0, 0, 0};
        for (int i=0; i < answers.length; i++) {
            for (int p=0; p < picks.length; p++) {
                int[] pick = picks[p];
                if (answers[i] == pick[i % pick.length])
                    scores[p] += 1;
            }
        }
        
        int max = Arrays.stream(scores).max().orElse(0);
        
        return IntStream.range(0, scores.length)
            .filter(i -> scores[i] == max)
            .map(x -> x + 1)
            .toArray();
    }
}
