package programmers.level02;

import java.util.Arrays;

class Prob42885 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] people = {70, 50, 80, 50};
        int limit = 100;

        System.out.println(sol.solution(people, limit));
    }

    static class Solution {
        public int solution(int[] people, int limit) {
            int answer = 0;
            Arrays.sort(people);

            int index = 0;

            for(int i=people.length-1; i>= 0; i--) {
                if(index >= i) {
                    break;
                }

                if(people[i] + people[index] <= limit) {
                    index++;
                    answer++;
                }
            }

            return people.length - answer * 2 + answer;
        }


    }
}