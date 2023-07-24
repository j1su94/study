package programmers.level01;

class Prob12948 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String phone_number = "01033334444";

        System.out.println(sol.solution(phone_number));
    }

    static class Solution {
        public String solution(String phone_number) {
            String answer = "";

            for(int i=0; i<phone_number.length(); i++) {
                answer += i < phone_number.length() -4 ? "*" : phone_number.charAt(i);
            }

            return answer;
        }
    }
}