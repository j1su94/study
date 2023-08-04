package programmers.level01;

class Prob132267 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int a = 2;
        int b = 1;
        int n = 20;

        System.out.println(sol.solution(a, b, n));
    }

    static class Solution {
        public int solution(int a, int b, int n) {
            /* 내코드
            int answer = 0;

            while(n >= a) {
                answer += n / a * b;
                n = n % a + (n / a * b);
                System.out.println(answer + ", " + n);
            }

            return answer;
            */

            return (n - b) / (a - b) * b;
        }
    }
}