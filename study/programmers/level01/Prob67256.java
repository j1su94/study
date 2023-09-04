package programmers.level01;

class Prob67256 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";

        System.out.println(sol.solution(numbers, hand));
    }

    static class Solution {
        public String solution(int[] numbers, String hand) {
            String answer = "";
            int left = 10;
            int right = 12;
            int lCnt = 0;
            int rCnt = 0;

            for(int i=0; i<numbers.length; i++) {
                if(numbers[i] == 0) {
                    numbers[i] = 11;
                }

                if(numbers[i] % 3 == 1) {
                    answer += "L";
                    left = numbers[i];
                } else if(numbers[i] % 3 == 0) {
                    answer += "R";
                    right = numbers[i];
                } else {
                    lCnt = (Math.max(numbers[i], left) - Math.min(numbers[i], left)) / 3;
                    rCnt = (Math.max(numbers[i], right) - Math.min(numbers[i], right)) / 3;

                    if(Math.max(numbers[i], left) - Math.min(numbers[i], left) % 3 != 0) {
                        lCnt += ((Math.max(numbers[i], left) - Math.min(numbers[i], left)) - lCnt * 3) % 3;
                    }

                    if(Math.max(numbers[i], right) - Math.min(numbers[i], right) % 3 != 0) {
                        rCnt += ((Math.max(numbers[i], right) - Math.min(numbers[i], right)) - rCnt * 3) % 3;
                    }

                    answer += (lCnt == rCnt) ? String.valueOf(hand.toUpperCase().charAt(0)) : (lCnt > rCnt ? "R" : "L");
                    left = answer.charAt(answer.length()-1) == 'R' ? left : numbers[i];
                    right = answer.charAt(answer.length()-1) == 'L' ? right : numbers[i];
                }
            }

            return answer;
        }
    }
}