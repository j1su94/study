package programmers.level02;

class Prob12924 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int n = 15;

        System.out.println(sol.solution(n));
        System.out.println(sol.solution2(n));
    }

    static class Solution {
        public int solution(int n) {
            int answer = 1;

            if(n <= 2) {
                return answer;
            }

            int input;
            int tmp = n / 2 + 1;

            while(tmp * (1 + tmp) / 2 >= n) {    // 등차수열 -> 공식 : n(a+l) / 2 (n: n번째 까지 항의 개수, a: 시작하는 수, l: 마지막 숫자)
                input = n;

                for(int i=tmp; i>0; i--) {
                    input -= i;

                    if(input == 0) {
                        answer++;
                        break;
                    } else if(input < 0) {
                        break;
                    }
                }

                tmp--;
            }

            return answer;
        }

        /* 참고코드 - 주어진 자연수를 연속된 자연수의 합으로 표현하는 방법의 수는 주어진 수의 홀수 약수의 개수와 같다 (정수론 정리) */
        public int solution2(int n) {
            int answer = 0;
            for (int i = 1; i <= n; i += 2) {
                if (n % i == 0) {
                    answer++;
                }
            }
            return answer;
        }
    }
}