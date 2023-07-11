package programmers.level01;

import java.util.Arrays;

class Prob12916 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        long n = 12345;
        
        System.out.println(Arrays.toString(sol.solution(n)));
    }
    
    static class Solution {
        public int[] solution(long n) {
            String input = String.valueOf(n);
            int[] answer = new int[input.length()];

            for(int i=input.length()-1; i>=0; i--) {
                answer[input.length()-i-1] = Integer.parseInt(String.valueOf(input.charAt(i)));
            }

            return answer;
        }
    }
}