package programmers.level01;

import java.util.Arrays;

class Prob12935 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {10};

        System.out.println(Arrays.toString(sol.solution(arr)));
    }

    static class Solution {
        public int[] solution(int[] arr) {
            if(arr.length == 1) {
                arr[0] = -1;

                return arr;
            }

            int[] answer = Arrays.stream(arr).filter(v -> v != Arrays.stream(arr).min().getAsInt()).toArray();

            return answer;
        }
    }
}