package programmers.level01;

import java.util.Arrays;

class Prob12954 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int x = 10000000;
        int n = 1000;

        System.out.println(Arrays.toString(sol.solution(x, n)));
    }
    
    static class Solution {
        public long[] solution(int x, int n) {
            long[] answer = new long[n];
            
            for(int i=1; i<=n; i++) {
                answer[i-1] = (long) x * i;
            }
            
            return answer;
        }
    }
}