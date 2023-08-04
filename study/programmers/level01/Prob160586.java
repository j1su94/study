package programmers.level01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Prob160586 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String[] keymap = {"BC"};
        String[] targets = {"AC", "BC"};

        System.out.println(Arrays.toString(sol.solution(keymap, targets)));
    }

    static class Solution {
        public int[] solution(String[] keymap, String[] targets) {
            int[] answer = new int[targets.length];
            int cnt = 0;

            Map<String, Integer> map = new HashMap<>();

            for(int i=0; i<keymap.length; i++) {
                for(int j=0; j<keymap[i].length(); j++) {
                    map.put(String.valueOf(keymap[i].charAt(j)), Math.min(map.getOrDefault(String.valueOf(keymap[i].charAt(j)), j), j));
                }
            }

            for(int i=0; i<targets.length; i++) {
                for(int j=0; j<targets[i].length(); j++) {
                    if(!map.containsKey(String.valueOf(targets[i].charAt(j)))) {
                        cnt = -1;
                        break;
                    }
                    cnt += map.get(String.valueOf(targets[i].charAt(j))) + 1;
                }

                answer[i] = cnt == 0 ? -1 : cnt;
                cnt = 0;
            }

            return answer;
        }
    }
}