package programmers.level02;

import java.util.LinkedList;
import java.util.List;

class Prob17680 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int cacheSize = 3;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"};
        
        System.out.println(sol.solution(cacheSize, cities));
    }

    // LRU 알고리즘
    /**
     * 캐시 교체 알고리즘
     * FIFO(First in First Out) - 가장 먼저 들어간 캐시를 교체
     * LRU(Least Recently Used) -  가장 오랫동안 사용되지 않은 캐시를 교체
     * LFU(Least Frequently Used) - 사용 횟수가 가장 적은 캐시를 교체
     */
    static class Solution {
        public int solution(int cacheSize, String[] cities) {
            int answer = 0;
            List<String> list = new LinkedList<>();     // 삽입/삭제가 있을 경우 ArrayList보다 LinkedList가 유리
            
            // 캐시크기가 0일 때
            if (cacheSize == 0) {
                return cities.length * 5;
            }
            
            String city;
            
            for(int i=0; i<cities.length; i++) {
                city = cities[i].toLowerCase();     // 대소문자 구분 X
                
                if(list.contains(city)) {
                    answer += 1;
                    list.remove(city);              // 삭제 후
                    list.add(city);                 // 제일 최근 캐시에 담기
                } else {
                    if (list.size() >= cacheSize) {
                        // 가장 앞에 있는것이 오랫동안 사용하지 않은 캐시므로 0번째를 제거
                        list.remove(0);
                    }
                    list.add(city);
                    answer += 5;
                }
            }
            
            return answer;
        }
    }
}