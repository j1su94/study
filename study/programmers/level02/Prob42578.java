package programmers.level02;

import java.util.HashMap;
import java.util.Map;

class Prob42578 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"red_sunglasses", "eyewear"}, {"green_turban", "headgear"}, {"smoky_makeup", "face"}};
        // String[][] clothes = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
        
        System.out.println(sol.solution(clothes));
    }

    // 좋은 해설: https://school.programmers.co.kr/questions/25816
    static class Solution {
        public int solution(String[][] clothes) {
            int answer = 1;
            
            Map<String, Integer> map = new HashMap<>();
            
            for(int i=0; i<clothes.length; i++) {
                map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
            }
            
            for(int v : map.values()) {
                answer *= (v + 1);              // 의상을 입지 않는 것까지 조건을 포함
            }
            
            return answer - 1;                  // 아무것도 입지 않은 경우 제외
        }
    }
}