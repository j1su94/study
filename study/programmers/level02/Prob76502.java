package programmers.level02;

import java.util.Stack;

class Prob76502 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        String s = "}]()[{";

        System.out.println(sol.solution(s));
    }

    static class Solution {
        public int solution(String s) {
            int answer = 0;
            
            Stack<Character> stack;
            char c = ' ';
            
            for(int i=0; i<s.length(); i++) {
                stack = new Stack<>();
                
                for(int j=i; j<s.length()+i; j++) {
                     if(!stack.empty()) {
                        c = stack.peek();
                        
                        if(c == '(' && s.charAt(j % s.length()) == ')') {
                            stack.pop();
                        } else if((c == '[' || c == '{') && ((int) s.charAt(j % s.length()) - (int) c == 2)) {
                            stack.pop();
                        } else {
                            stack.push(s.charAt(j % s.length()));
                        }
                    } else {
                        stack.push(s.charAt(j % s.length()));
                    }
                }
                
                answer += (stack.size() == 0) ? 1 : 0;
            }
            
            return answer;
        }
    }
}