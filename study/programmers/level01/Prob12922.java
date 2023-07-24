package programmers.level01;


class Prob12922 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 5;

        System.out.println(sol.solution(n));
    }

    static class Solution {
        public String solution(int n) {
            String wm = "수박";
            String answer = "";

            for(int i=1; i<=n+1/2; i++) {
                answer += wm;
            }

            answer = answer.substring(0, n);

            return answer;
        }
    }
}