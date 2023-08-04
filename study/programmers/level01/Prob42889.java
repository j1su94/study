package programmers.level01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Prob42889 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int N = 4;
        int[] stages = {4,4,4,4,4};

        System.out.println(Arrays.toString(sol.solution(N, stages)));
    }

    static class Solution {
        public int[] solution(int N, int[] stages) {
            int[] answer = new int[N];

            Map<Integer, Integer> map = new HashMap<>();
            Map<Integer, Double> map2 = new HashMap<>();

            for(int i=0; i<stages.length; i++) {
                if(stages[i] > N) {
                    continue;
                }
                map.put(stages[i], map.getOrDefault(stages[i], 0) + 1);
            }

            int tmp = stages.length;

            for(int i=1; i<=N; i++) {
                if(map.containsKey(i)) {
                    map2.put(i, (double) map.get(i) / tmp);
                    tmp = tmp - map.get(i);
                } else {
                    map2.put(i, 0.0);
                }
            }

            List<Integer> keySet = new ArrayList<>(map2.keySet());

            Collections.sort(keySet, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    if (map2.get(o1) < map2.get(o2)) {
                        return 1;
                    }
                    if (map2.get(o1) > map2.get(o2)) {
                        return -1;
                    }

                    return 0;
                }
            });

            for(int i=0; i<keySet.size(); i++) {
                answer[i] = keySet.get(i);
            }

            return answer;
        }
    }
}