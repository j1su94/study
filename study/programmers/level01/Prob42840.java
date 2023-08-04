package programmers.level01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Prob42840 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] answers = {1,3,2,4,2};

        System.out.println(Arrays.toString(sol.solution(answers)));
    }

    static class Solution {
        public int[] solution(int[] answers) {
            int[] supo1 = {1, 2, 3, 4, 5};
            int[] supo2 = {2, 1, 2, 3, 2, 4, 2, 5};
            int[] supo3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

            int supoCnt1 = 0, supoCnt2 = 0, supoCnt3 = 0;

            for(int i=0; i<answers.length; i++) {
                supoCnt1 += (supo1[i % supo1.length] == answers[i]) ? 1 : 0;
                supoCnt2 += (supo2[i % supo2.length] == answers[i])? 1 : 0;
                supoCnt3 += (supo3[i % supo3.length] == answers[i]) ? 1 : 0;
            }

            int max = Math.max(Math.max(supoCnt1, supoCnt2), supoCnt3);

            List<Integer> list = new ArrayList<>();

            if(supoCnt1 == max) {
                list.add(1);
            }
            if(supoCnt2 == max) {
                list.add(2);
            }
            if(supoCnt3 == max) {
                list.add(3);
            }

            int[] answer = new int[list.size()];

            for(int i=0; i<list.size(); i++) {
                answer[i] = list.get(i);
            }

            return answer;
        }
    }
}