package programmers.level02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class Prob131127 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] number = {3, 2, 2, 2, 1};
        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};

        System.out.println(sol.solution(want, number, discount));
    }

    static class Solution {
        public int solution(String[] want, int[] number, String[] discount) {
            int answer = 0;
            int days = 0;
            
            Set<String> dis = new HashSet<>();
            List<String> list = new ArrayList<>();
            
            for(int i=0; i<discount.length; i++) {
                dis.add(discount[i]);
                list.add(discount[i]);
            }
            
            Map<String, Integer> wantMap = new TreeMap<>();
            
            for(int i=0; i<want.length; i++) {
                wantMap.put(want[i], number[i]);
                days += number[i];
                if(!dis.contains(want[i])) {
                    return answer;
                }
            }
            
            Map<String, Integer> disMap;
            String[] arr;
            
            for(int i=0; i<discount.length - days + 1; i++) {
                disMap = new TreeMap<>();
                arr = Arrays.copyOfRange(discount, i, days + i);
                
                if(!Arrays.asList(Arrays.copyOfRange(discount, i, days + i)).containsAll(Arrays.asList(want))) {
                    continue;
                }
                
                for(int j=0; j<days; j++) {
                    disMap.put(arr[j], disMap.getOrDefault(arr[j], 0) + 1);
                }
                
                if(disMap.equals(wantMap)) {
                    answer++;
                }
                
            }
            
            return answer;
        }
    }
}