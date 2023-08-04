package programmers.level01;

import java.util.Arrays;

class Prob42748 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        System.out.println(Arrays.toString(sol.solution(array, commands)));
    }

    static class Solution {
        public int[] solution(int[] array, int[][] commands) {
            int[] answer = new int[commands.length];
            int[] tmp;

            for(int i=0; i<answer.length; i++) {
                tmp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
                Arrays.sort(tmp);
                answer[i] = tmp[commands[i][2] - 1];
            }

            return answer;
        }
    }
}