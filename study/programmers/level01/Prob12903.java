package programmers.level01;


class Prob12903 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "qwer";

        System.out.println(sol.solution(s));
    }

    static class Solution {
        public String solution(String s) {
            String answer = s.length()%2==0 ? s.substring(s.length()/2-1, s.length()/2+1) : String.valueOf(s.charAt(s.length()/2));

            return answer;
        }
    }
}