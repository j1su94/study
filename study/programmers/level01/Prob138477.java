package programmers.level01;

import java.util.Arrays;

class Prob138477 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int k = 4;
        int[] score = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};

        System.out.println(Arrays.toString(sol.solution(k, score)));
    }

    static class Solution {
        public int[] solution(int k, int[] score) {
            int[] tmp;
            int[] answer = new int[score.length];

            for(int i=0; i<score.length; i++) {
                tmp = Arrays.copyOfRange(score, 0, i + 1);
                Arrays.sort(tmp);

                answer[i] = i < k ? tmp[0] : tmp[i-k+1];
            }

            return answer;
        }
    }
}