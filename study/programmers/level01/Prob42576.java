package programmers.level01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Prob42576 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        System.out.println(sol.solution(participant, completion));
    }

    static class Solution {
        public String solution(String[] participant, String[] completion) {
            /* 내코드
            Arrays.sort(participant);
            Arrays.sort(completion);

            for(int i=0; i<completion.length; i++) {
                if(!completion[i].equals(participant[i])) {
                    return participant[i];
                }
            }

            return participant[participant.length-1];
            */

            /* 참고코드 */
            String answer = "";
            Map<String, Integer> map = new HashMap<>();

            for (String player : participant) {
                map.put(player, map.getOrDefault(player, 0) + 1);
            }

            for (String player : completion) {
                map.put(player, map.get(player) - 1);
            }

            for (String key : map.keySet()) {
                if (map.get(key) != 0){
                    answer = key;
                }
            }

            return answer;
        }
    }
}