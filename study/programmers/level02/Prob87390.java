package programmers.level02;

import java.util.Arrays;

class Prob87390 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int n = 3;
        long left = 2;
        long right = 5;

        System.out.println(Arrays.toString(sol.solution(n, left, right)));
    }

    static class Solution {
        public int[] solution(int n, long left, long right) {
            int[] answer = new int[(int) (right - left + 1)];
            
            int startX = (int) (left / n);
            int startY = (int) (left % n);
            
            int cnt = 0;
            
            for(int i=startX; i<n; i++) {
                for(int j=startY; j<n; j++) {
                    answer[cnt++] = Math.max(i, j) + 1;
                    
                    if(cnt >= answer.length) {
                        return answer;
                    }
                }
                startY = 0;
            }
            
            return answer;
        }
    }
}