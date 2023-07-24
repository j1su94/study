package programmers.level01;

class Prob12918 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "1234";

        System.out.println(sol.solution(s));
    }

    static class Solution {
        public boolean solution(String s) {
            return s.length() == 4 || s.length() == 6 ? (s.replaceAll("[0-9]", "").length() == 0 ? true : false) : false;
        }
    }
}