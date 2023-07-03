package programmers.level01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Prob178871 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};

        System.out.println(Arrays.toString(sol.solution(players, callings)));
    }

    /* 시간 초과 */
    /*
    static class Solution {
        public String[] solution(String[] players, String[] callings) {
            String tmp;

            for(int i=0; i<callings.length; i++) {
                for(int j=0; j<players.length; j++) {
                    if(players[j].equals(callings[i])) {
                        tmp = players[j];
                        players[j] = players[j-1];
                        players[j-1] = tmp;
                        break;
                    }
                }
            }

            return players;
        }
    }
    */

    static class Solution {
        public String[] solution(String[] players, String[] callings) {
            Map<String, Integer> map = new HashMap<>();


            for(int i=0; i<players.length; i++) {
                map.put(players[i], i);
            }

            int idx;

            String call;    // 추월한 사람
            String next;    // 추월 당한 사람

            for(String calling : callings) {
                idx = map.get(calling);

                call = players[idx];
                next = players[idx-1];
                players[idx] = players[idx-1];
                players[idx-1] = call;

                map.put(calling, idx-1);
                map.put(next, idx);
            }


            return players;
        }
    }
}