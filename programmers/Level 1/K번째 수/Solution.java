import java.util.Arrays;
import java.util.AbstractMap;
import java.util.Map;

class Pair {
	public static <T, U> Map.Entry<T, U> of(T first, U second) {
		return new AbstractMap.SimpleEntry<>(first, second);
	}
}

class Solution {
    public int[] selfSort(int[] array) {
        Arrays.sort(array);
        return array;
    }
    
    public int[] solution(int[] array, int[][] commands) {
        return Arrays.stream(commands)
            .map(command -> Pair.of(Arrays.copyOfRange(array, command[0] - 1, command[1]), command[2] - 1))
            .map(pair -> Pair.of(selfSort(pair.getKey()), pair.getValue()))
            .mapToInt(pair -> pair.getKey()[pair.getValue()])
            .toArray();
    }
}
