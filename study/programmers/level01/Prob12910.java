package programmers.level01;

import java.util.Arrays;

class Prob12910 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {3,2,6};
        int divisor = 10;

        System.out.println(sol.solution(arr, divisor));
    }

    static class Solution {
        public int[] solution(int[] arr, int divisor) {
            int[] answer = Arrays.stream(arr).filter(v -> v % divisor == 0).sorted().toArray();

            if(answer.length == 0) {
                answer = new int[] {-1};
            }

            return answer;
        }
    }
}