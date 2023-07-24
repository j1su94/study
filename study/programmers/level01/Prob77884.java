package programmers.level01;


class Prob77884 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int left = 13;
        int right = 17;

        System.out.println(sol.solution(left, right));
    }

    static class Solution {
        public int solution(int left, int right) {
            int answer = 0;

            /*for(int i=left; i<=right; i++) {
                answer += getFactorCount(i) % 2 == 0 ? i : -i;
            }*/

            /* 참고코드 */
            for (int i=left; i<=right; i++) {
                if (i % Math.sqrt(i) == 0) {        // 제곱수인 경우 약수의 개수가 홀수
                    answer -= i;
                } else {                            // 제곱수가 아닌 경우 약수의 개수가 짝수
                    answer += i;
                }
            }

            return answer;
        }

        public int getFactorCount(int input) {
            int cnt = 1;

            for(int i=2; i<=input; i++) {
                cnt += input % i == 0 ? 1 : 0;
            }

            return cnt;
        }
    }
}