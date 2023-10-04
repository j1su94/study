package programmers.level02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Prob42586 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};
        
        System.out.println(Arrays.toString(sol.solution(progresses, speeds)));
    }

    static class Solution {
        public int[] solution(int[] progresses, int[] speeds) {
            int[] tmp = new int[progresses.length];
            
            List<Integer> list = new ArrayList<>();
            
            for(int i=0; i<progresses.length; i++) {
                tmp[i] = (int) Math.ceil((double) (100 - progresses[i]) / speeds[i]);
            }
            
            int max = tmp[0];
            int cnt = 1;
            int sum = 0;
            
            for(int i=1; i<tmp.length; i++) {
                if(tmp[i] > max) {
                    max = tmp[i];
                    list.add(cnt);
                    sum += cnt;
                    cnt = 1;
                } else {
                    cnt++;
                }
            }
            
            list.add(list.size() == 0 ? tmp.length : tmp.length - sum);
            
            int[] answer = new int[list.size()];
            
            for(int i=0; i<list.size(); i++) {
                answer[i] = list.get(i);
            }
            
            return answer;
        }
    }
}