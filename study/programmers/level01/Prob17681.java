package programmers.level01;

import java.util.Arrays;

class Prob17681 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};

        System.out.println(Arrays.toString(sol.solution(n, arr1, arr2)));
    }

    static class Solution {
        public String[] solution(int n, int[] arr1, int[] arr2) {
            String[] answer = new String[n];
            String tmp;

            for(int i=0; i<n; i++) {
                tmp = Integer.toBinaryString(arr1[i] | arr2[i]);            // 비트연산자 OR

                while(tmp.length() < n) {
                    tmp = "0" + tmp;
                }

                answer[i] = tmp.replaceAll("0", " ").replaceAll("1", "#");
            }

            return answer;
        }
    }
}