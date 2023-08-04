package programmers.level01;

class Prob136798 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int number = 10;
        int limit = 3;
        int power = 2;

        System.out.println(sol.solution(number, limit, power));
    }

    static class Solution {
        public int solution(int number, int limit, int power) {
            int answer = 1;

            for(int i=2; i<=number; i++) {
                System.out.println(i + " : " + getFactorCount(i));
                answer += getFactorCount(i) > limit ? power : getFactorCount(i);
            }

            return answer;
        }

        /* 약수 개수 구하기 */
        public int getFactorCount(int n) {
            int cnt = 0;

            for(int i=1; i<=Math.sqrt(n); i++) {
                if (i == Math.sqrt(n)) {
                    cnt++;
                } else if (n % i == 0) {
                    cnt += 2;
                }
            }

            return cnt;
        }
    }
}