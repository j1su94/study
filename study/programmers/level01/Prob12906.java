package programmers.level01;

import java.util.Arrays;
import java.util.Stack;

class Prob12906 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {4,4,4,3,3};

        System.out.println(sol.solution(arr));
    }

    static class Solution {
        public int[] solution(int[] arr) {
            Stack<Integer> stack = new Stack<>();
            stack.push(arr[0]);

            for(int i=1; i<arr.length; i++) {
                if(arr[i-1] != arr[i]) {
                    stack.push(arr[i]);
                }
            }

            int[] answer = stack.stream().mapToInt(Integer::intValue).toArray();

            return answer;
        }
    }
}