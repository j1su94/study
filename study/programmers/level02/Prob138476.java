package programmers.level02;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class Prob138476 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int k = 4;
        int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};

        System.out.println(sol.solution(k, tangerine));
    }

    static class Solution {
        public int solution(int k, int[] tangerine) {
            int answer = 0;
            Map<Integer, Integer> map = new HashMap<>();
            
            for(int i=0; i<tangerine.length; i++) {
                map.put(tangerine[i], map.getOrDefault(tangerine[i], 0) + 1);
            }
            
            // map value값으로 역정렬
            List<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(map.entrySet());
            entryList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
            
            for(Map.Entry<Integer, Integer> entry : entryList) {
                if(k <= 0) {
                    break;
                }
                
                k -= entry.getValue();
                answer++;
            }
            
            return answer;
        }
    }
}