package programmers.level01;

class Prob12921 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int n = 5;

        System.out.println(sol.solution(n));
    }

    static class Solution {
        public int solution(int n) {
            int answer = 0;

            for(int i=2; i<=n; i++) {
                answer += isPrime(i) ? 1 : 0;
            }

            return answer;
        }

        boolean isPrime(int num) {               // 소수인지 판별 (√N까지 나눠서 소수를 판별)
            for(int i=2; i<=Math.sqrt(num); i++) {      // 제곱근 함수 : Math.sqrt()
                if(num % i == 0) {
                    return false;
                }
            }

            return true;
        }
    }
}