package programmers.level01;

class Prob12925 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "1234";
        
        System.out.println(sol.solution(s));
    }
    
    static class Solution {
        public int solution(String s) {
            return Integer.parseInt(s);
        }
    }
}