package programmers.level01;

class Prob134240 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] food = {1, 3, 4, 6};

        System.out.println(sol.solution(food));
    }

    static class Solution {
        public String solution(int[] food) {
            /*
            String answer = "";

            for(int i=1; i<food.length; i++) {
                for(int j=0; j<food[i]/2; j++) {
                    answer += String.valueOf(i);
                }
            }

            // 문자열 뒤집기 (reverse)
            StringBuffer sb = new StringBuffer(answer);
            String reverse = sb.reverse().toString();

            answer += "0" + reverse;
            */

            /* 참고코드1 */
            String answer = "0";

            for (int i = food.length - 1; i > 0; i--) {
                for (int j = 0; j < food[i] / 2; j++) {
                    answer = i + answer + i;
                }
            }

            /* 참고코드 2 */
            /*
            StringBuilder builder = new StringBuilder();
            for (int i=1; i<food.length; i++) {
                int result = food[i] / 2;
                builder.append(String.valueOf(i).repeat(result));           // 문자열 반복 메서드 repeat (JAVA 11부터)
            }
            String answer = builder + "0";
            return answer + builder.reverse();
            */
            return answer;
        }
    }
}