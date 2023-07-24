package programmers.level01;

import java.util.Arrays;

class Prob12940 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 3;
        int m = 12;

        System.out.println(sol.solution(n, m));
    }

    static class Solution {
        public int[] solution(int n, int m) {
            int[] answer = new int[]{getGcd(n, m), getLcm(n, m)};

            return answer;
        }

        /* 최대공약수 구하는 공식 - 유클리드 호제법 */
        public int getGcd(int a, int b) {     // 재귀 방식
            if(b == 0) return a;
            return getGcd(b, a % b);
        }

        /* 최소공배수 구하는 공식 */
        public int getLcm(int a, int b) {
            return a * b / getGcd(a, b);
        }
    }
}