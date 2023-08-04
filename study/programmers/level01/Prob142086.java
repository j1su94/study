package programmers.level01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Prob142086 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "foobar";

        System.out.println(Arrays.toString(sol.solution(s)));
    }

    static class Solution {
        public int[] solution(String s) {
            int[] answer = new int[s.length()];
            List<Character> list = new ArrayList<>();

            for(int i=0; i<s.length(); i++) {
                if(list.contains(s.charAt(i))) {
                    answer[i] = i - list.lastIndexOf(s.charAt(i));
                } else {
                    answer[i] = -1;
                }
                list.add(s.charAt(i));
            }

            return answer;
        }
    }
}