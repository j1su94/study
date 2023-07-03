package programmers.level01;

class Prob12937 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int num = 987;
        
        System.out.println(sol.solution(num));
    }
    
    static class Solution {
        public String solution(int num) {
            return num % 2 == 0 ? "Even" : "Odd";
        }
    }
}