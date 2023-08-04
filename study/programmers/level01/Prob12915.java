package programmers.level01;

import java.util.Arrays;

class Prob12915 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] strings = {"abce", "abcd", "cdx"};
        int n = 2;

        System.out.println(sol.solution(strings, n));
    }

    static class Solution {
        public String[] solution(String[] strings, int n) {
            String[] answer = new String[strings.length];

            for(int i=0; i<answer.length; i++) {
                answer[i] = strings[i].charAt(n) + strings[i];
            }

            Arrays.sort(answer);

            for(int i=0; i<answer.length; i++) {
                answer[i] = answer[i].substring(1);
            }

            return answer;
        }
    }
}