package programmers.level01;

class Prob147355 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String t = "500220839878";
        String p = "7";

        System.out.println(sol.solution(t, p));
    }

    static class Solution {
        public int solution(String t, String p) {
            int answer = 0;

            for(int i=0; i<t.length()-p.length()+1; i++) {
                answer += Long.parseLong(t.substring(i, i+p.length())) <= Long.parseLong(p) ? 1 : 0;
            }

            return answer;
        }
    }
}