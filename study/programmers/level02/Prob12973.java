package programmers.level02;

import java.util.Stack;

class Prob12973 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String s = "cdcd";

        System.out.println(sol.solution(s));
    }

    static class Solution {
        public int solution(String s) {
            Stack<Character> stack = new Stack<>();

            stack.push(s.charAt(0));

            for(int i=1; i<s.length(); i++) {
                if(stack.size() > 0 && stack.peek() == s.charAt(i)) {
                    stack.pop();
                } else {
                    stack.push(s.charAt(i));
                }
            }

            return stack.isEmpty() ? 1 : 0;
        }
    }
}