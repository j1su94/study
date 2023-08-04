package programmers.level01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Prob135808 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int k = 4;
        int m = 3;
        int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};

        System.out.println(sol.solution(k, m, score));
    }

    static class Solution {
        public int solution(int k, int m, int[] score) {
            int answer = 0;

            List<Integer> list = new ArrayList<>();

            Arrays.sort(score);

            for(int i=score.length-1; i>=0; i--) {
                list.add(score[i]);
            }

            for(int i=0; i<list.size(); i++) {
                if(i % m == m - 1) {
                    answer += list.get(i) * m;
                }
            }

            return answer;
        }
    }
}