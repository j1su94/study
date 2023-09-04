package programmers.level02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Prob12981 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int n = 2;
        String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};

        System.out.println(Arrays.toString(sol.solution(n, words)));
    }

    static class Solution {
        public int[] solution(int n, String[] words) {
            int[] answer = {0, 0};
            List<String> list = new ArrayList<>();

            list.add(words[0]);

            for(int i=1; i<words.length; i++) {
                if(list.contains(words[i]) || words[i].charAt(0) != words[i-1].charAt(words[i-1].length()-1)) {
                    answer[0] = (i+1) % n == 0 ? n : (i+1) % n;
                    answer[1] = (i+1) % n == 0 ? (i+1) / n : (i+1) / n + 1;

                    break;
                } else {
                    list.add(words[i]);
                }
            }

            return answer;
        }
    }
}