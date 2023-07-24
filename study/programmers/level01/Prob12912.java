package programmers.level01;

class Prob12912 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int a = 5;
        int b = 3;

        System.out.println(sol.solution(a, b));
    }

    static class Solution {
        public long solution(int a, int b) {
            long answer = 0;

            long max = Math.max(a, b);
            long min = Math.min(a, b);

            if(max == min) {
                return max;
            }

            for(long i=min; i<=max; i++) {
                answer += i;
            }

            return answer;
        }
    }
}