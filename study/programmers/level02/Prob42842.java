package programmers.level02;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

class Prob42842 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int brown = 10;
        int yellow = 2;

        System.out.println(Arrays.toString(sol.solution(brown, yellow)));
    }

    static class Solution {
        public int[] solution(int brown, int yellow) {
            int[] answer = new int[2];
            Map<Integer, Integer> map = new LinkedHashMap<>();

            for(int i=3; i<=Math.sqrt(brown+yellow); i++) {
                if((brown+yellow) % i == 0) {
                    map.put(i, (brown+yellow) / i);
                }
            }

            for(int key : map.keySet()) {
                if(key + map.get(key) == brown / 2 + 2) {
                    answer[0] = Math.max(key, map.get(key));
                    answer[1] = Math.min(key, map.get(key));
                }
            }

            return answer;
        }
    }
}