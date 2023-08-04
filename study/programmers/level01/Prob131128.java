package programmers.level01;

class Prob131128 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String X = "100";
        String Y = "203045";

        System.out.println(sol.solution(X, Y));
    }

    static class Solution {
        public String solution(String X, String Y) {
            StringBuilder answer = new StringBuilder();

            int[] xArr = new int[10];
            int[] yArr = new int[10];

            for(int i=0; i<X.length(); i++) {
                xArr[Integer.parseInt(String.valueOf(X.charAt(i)))]++;
            }

            for(int i=0; i<Y.length(); i++) {
                yArr[Integer.parseInt(String.valueOf(Y.charAt(i)))]++;
            }

            for(int i=9; i>=0; i--) {                               // 큰 수 부터 answer에 append
                for(int j=0; j<Math.min(xArr[i], yArr[i]); j++) {
                    answer.append(i);
                }
            }

            if("".equals(answer.toString())) {
                answer.append("-1");
            } else if(answer.toString().charAt(0) == 48) {          // 제일 큰 수가 0이라는 것이라 0을 리턴
                return "0";
            }

            return answer.toString();
        }
    }
}