package programmers.level01;

import java.util.Arrays;

class Prob77484 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] lottos = {1, 2, 3, 4, 5, 6};
        int[] win_nums = {7, 8, 9, 10, 11, 12};

        System.out.println(Arrays.toString(sol.solution(lottos, win_nums)));
    }

    static class Solution {
        public int[] solution(int[] lottos, int[] win_nums) {
            int[] answer = new int[2];
            int zeroCnt = (int) Arrays.stream(lottos).filter(value -> value == 0).count();

            for(int i=0; i<win_nums.length; i++) {
                for(int j=0; j<lottos.length; j++) {
                    if(lottos[j] == win_nums[i]) {
                        lottos[j] = 0;
                    }
                }
            }

            if(7 - (int) Arrays.stream(lottos).filter(value -> value == 0).count() >= 6) {
                answer[0] = 6;
            } else {
                answer[0] = 7 - (int) Arrays.stream(lottos).filter(value -> value == 0).count();
            }

            if(7 - (int) Arrays.stream(lottos).filter(value -> value == 0).count() + zeroCnt >= 6) {
                answer[1] = 6;
            } else {
                answer[1] = 7 - (int) Arrays.stream(lottos).filter(value -> value == 0).count() + zeroCnt;
            }

            return answer;
        }
    }
}