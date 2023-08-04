package programmers.level01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Prob176963 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};

        System.out.println(Arrays.toString(sol.solution(name, yearning, photo)));
    }

    static class Solution {
        public int[] solution(String[] name, int[] yearning, String[][] photo) {
            int[] answer = new int[photo.length];
            Map<String, Integer> map = new HashMap<>();

            for(int i=0; i<name.length; i++) {
                map.put(name[i], yearning[i]);
            }

            for(int i=0; i<photo.length; i++) {
                for(int j=0; j<photo[i].length; j++) {
                    answer[i] += map.getOrDefault(photo[i][j], 0);
                }
            }

            return answer;
        }
    }
}