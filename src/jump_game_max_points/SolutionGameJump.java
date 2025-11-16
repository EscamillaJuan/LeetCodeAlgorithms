package jump_game_max_points;

import java.util.HashMap;
import java.util.Map;

public class SolutionGameJump {
  public static void main(String[] args) {
    int[] initialPoints = new int[] {1, 2, 4, 8, 99};
    int res = memo(initialPoints);
    System.out.println(res);
  }

  private static int solution(int[] points, int i, Map<Integer, Integer> dp) {
    if (i >= points.length) return 0;

    if (dp.containsKey(i)) {
      return dp.get(i);
    }

    int skip = solution(points, i + 1, dp);
    int take = points[i] + solution(points, i + points[i], dp);
    int best = Math.max(skip, take);
    dp.put(i, best);
    return best;
  }

  private static int memo(int[] points) {
    Map<Integer, Integer> memo = new HashMap<>();
    return solution(points, 0, memo);
  }

}
