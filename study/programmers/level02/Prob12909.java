package programmers.level02;

import java.util.Stack;

class Prob12909 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String s = "())()((())(()()()()((()";

        System.out.println(sol.solution(s));
    }

    static class Solution {
        public boolean solution(String s) {
            Stack<Character> stack = new Stack<>();

            stack.push(s.charAt(0));

            for(int i=1; i<s.length(); i++) {
                if(s.charAt(i) == ')' && stack.size() > 0 && stack.peek() == '(') {
                    stack.pop();
                } else {
                    stack.push(s.charAt(i));
                }
            }

            return stack.size() == 0;
        }
    }
}