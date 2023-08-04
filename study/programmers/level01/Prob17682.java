package programmers.level01;

import java.util.Arrays;

class Prob17682 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String dartResult = "1S*2T*3S";

        System.out.println(sol.solution(dartResult));
    }

    static class Solution {
        public int solution(String dartResult) {
            int[] answers = new int[3];

            String score = dartResult.replaceAll("[^0-9]", " ").trim();
            String award = dartResult.replaceAll("[0-9]", " ").trim();

            int pow = 0;

            String[] scores = score.split("\\s+");     // 공백이 여러 개 일 때 연속된 공백을 하나의 공백으로 취급하여 나눔
            String[] awards = award.split("\\s+");

            for(int i=0; i<3; i++) {
                switch(String.valueOf(awards[i].charAt(0))) {
                    case "S": pow = 1; break;
                    case "D": pow = 2; break;
                    case "T": pow = 3; break;
                }

                answers[i] = (int) Math.pow(Double.parseDouble(scores[i]), pow);

                if(awards[i].length() > 1) {
                    switch(String.valueOf(awards[i].charAt(1))) {
                        case "*":
                            answers[i] = answers[i] * 2;
                            if(i > 0) {
                                answers[i-1] = answers[i-1] * 2;
                            }
                            break;
                        case "#":
                            answers[i] = answers[i] * -1;
                            break;
                    }
                }
            }

            return Arrays.stream(answers).sum();
        }
    }
}