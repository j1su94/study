package programmers.level01;

class Prob12926 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "a B z";
        int n = 1;

        System.out.println(sol.solution(s, n));
    }

    static class Solution {
        public String solution(String s, int n) {
            String answer = "";
            char tmp = ' ';

            for(int i=0; i<s.length(); i++) {
                if((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
                    tmp = (char) (s.charAt(i) + n);
                    answer += String.valueOf(tmp).matches("[A-Z]") ? tmp : (char) (tmp - 26);
                } else if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z')) {
                    tmp = (char) (s.charAt(i) + n);
                    answer += String.valueOf(tmp).matches("[a-z]") ? tmp : (char) (tmp - 26);
                } else {
                    answer += " ";
                }
            }

            return answer;
        }
    }
}