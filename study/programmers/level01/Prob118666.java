package programmers.level01;

import java.util.Map;
import java.util.HashMap;

class Prob118666 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String[] survey = {"TR", "RT", "TR"};
        int[] choices = {7, 1, 3};

        System.out.println(sol.solution(survey, choices));
    }

    static class Solution {
        public String solution(String[] survey, int[] choices) {
            String answer = "";

            Map<String, Integer> map = new HashMap<>();

            for(int i=0; i<choices.length; i++) {
                if(choices[i] > 4) {
                    map.put(String.valueOf(survey[i].charAt(1)), map.getOrDefault(String.valueOf(survey[i].charAt(1)), 0) + choices[i] - 4);
                } else {
                    map.put(String.valueOf(survey[i].charAt(0)), map.getOrDefault(String.valueOf(survey[i].charAt(0)), 0) + 4 - choices[i]);
                }
            }

            answer += map.getOrDefault("R", 0) >= map.getOrDefault("T", 0) ? "R" : "T";
            answer += map.getOrDefault("C", 0) >= map.getOrDefault("F", 0) ? "C" : "F";
            answer += map.getOrDefault("J", 0) >= map.getOrDefault("M", 0) ? "J" : "M";
            answer += map.getOrDefault("A", 0) >= map.getOrDefault("N", 0) ? "A" : "N";

            return answer;
        }
    }
}