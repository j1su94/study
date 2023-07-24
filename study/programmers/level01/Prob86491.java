package programmers.level01;

import java.util.Arrays;

class Prob86491 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};

        System.out.println(sol.solution(sizes));
    }

    static class Solution {
        public int solution(int[][] sizes) {
            int length = 0, height = 0;

            for(int i=0; i<sizes.length; i++) {
                length = Math.max(length, Math.min(sizes[i][0], sizes[i][1]));
                height = Math.max(height, Math.max(sizes[i][0], sizes[i][1]));
            }

            return length * height;
        }
    }
}