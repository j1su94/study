package programmers.level01;

import java.util.Arrays;

class Prob161990 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String[] wallpaper = {".....", "....#"};

        System.out.println(Arrays.toString(sol.solution(wallpaper)));
    }

    static class Solution {
        public int[] solution(String[] wallpaper) {
            int[] answer = {49, 49, -1, -1};

            for(int i=0; i<wallpaper.length; i++) {
                for(int j=0; j<wallpaper[i].length(); j++) {
                    if(wallpaper[i].charAt(j) == '#') {
                        answer[0] = Math.min(answer[0], i);
                        answer[1] = Math.min(answer[1], j);
                        answer[2] = Math.max(answer[2], i);
                        answer[3] = Math.max(answer[3], j);
                    }
                }
            }

            answer[2]++;
            answer[3]++;

            return answer;
        }
    }
}