package programmers.level01;

import java.util.Arrays;

class Prob12982 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] d = {1,3,2,5,4};
        int budget = 9;

        System.out.println(sol.solution(d, budget));
    }

    static class Solution {
        public int solution(int[] d, int budget) {
            int answer;
            Arrays.sort(d);

            for(answer=0; answer<d.length; answer++) {
                budget -= d[answer];

                if(budget < 0) {
                    break;
                }
            }

            return answer;
        }
    }
}