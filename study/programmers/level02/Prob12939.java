package programmers.level02;

import java.util.Arrays;

class Prob12939 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String s = "-1 1 -3 -4";

        System.out.println(sol.solution(s));
    }

    static class Solution {
        public String solution(String s) {
            int[] arr = Arrays.stream(s.split(" ")).mapToInt(value -> Integer.parseInt(value)).toArray();
            Arrays.sort(arr);

            return arr[0] + " " + arr[arr.length-1];
        }
    }
}