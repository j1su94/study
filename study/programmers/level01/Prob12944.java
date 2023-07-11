package programmers.level01;

import java.util.Arrays;

class Prob12944 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {1,2,3,4};
        
        System.out.println(sol.solution(arr));
    }
    
    static class Solution {
        public double solution(int[] arr) {
            return Arrays.stream(arr).average().getAsDouble();
        }
    }
}