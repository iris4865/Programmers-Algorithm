import java.util.stream.LongStream;

class Solution {
  public long solution(int a, int b) {
      int min = a < b ? a : b;
      int max = a < b ? b : a;

      return LongStream.range(min, max + 1).sum();
  }
}
