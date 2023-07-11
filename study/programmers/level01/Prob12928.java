package programmers.level01;

import java.util.HashSet;
import java.util.Set;

class Prob12928 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 5;
        
        System.out.println(sol.solution(n));
    }
    
    static class Solution {
        public int solution(int n) {
            int answer = 0;
            Set<Integer> set = new HashSet<>();

            for(int i=1; i<=Math.sqrt(n); i++) {
                if(n % i == 0) {
                    set.add(i);
                    set.add(n/i);
                }
            }

            for(Integer i : set) {
                answer += i;
            }

            return answer;
        }
    }
}