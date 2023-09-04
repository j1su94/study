package programmers.level01;

import java.util.Stack;

class Prob133502 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};

        System.out.println(sol.solution(ingredient));
    }

    static class Solution {
        public int solution(int[] ingredient) {
            int answer = 0;
            Stack<Integer> stack = new Stack<>();

            /* 시간 초과
            String s = Arrays.toString(ingredient).replaceAll("\\[|\\]|\\,", "").replaceAll(" ", "");

            while(s.indexOf("1231") > -1) {
                s = s.replaceFirst("1231", "");v
                answer ++;
            }
            */

            for(int i=0; i<ingredient.length; i++) {
                stack.push(ingredient[i]);

                // 스택의 사이즈가 4이상이 됐을 경우 조건처리 시작 (오류방지)
                if(stack.size() >= 4) {

                    // Stack이 1231이 연달아 들어가있는 경우
                    if(stack.get(stack.size()-4) == 1 && stack.get(stack.size()-3) == 2
                        && stack.get(stack.size()-2) == 3 && stack.get(stack.size()-1) == 1) {

                        answer++;

                        stack.pop();
                        stack.pop();
                        stack.pop();
                        stack.pop();
                    }
                }
            }

            return answer;
        }
    }
}