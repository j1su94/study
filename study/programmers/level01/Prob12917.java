package programmers.level01;

import java.util.Arrays;
import java.util.Comparator;

class Prob12917 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "Zbcdefg";

        System.out.println(sol.solution(s));
    }

    static class Solution {
        public String solution(String s) {
            /*
            String[] arr = s.split("");

            Arrays.sort(arr, Comparator.reverseOrder());

            return Arrays.toString(arr).replaceAll("\\[|\\]|\\,", "").replaceAll(" ", "");
            */

            /* 참고코드 */
            char[] arr = s.toCharArray();

            return new StringBuilder(new String(arr)).reverse().toString();
        }
    }
}