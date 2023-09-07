package programmers.level02;

import java.util.Set;
import java.util.HashSet;

class Prob131701 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[] elements = {7, 9, 1, 1, 4};

        System.out.println(sol.solution(elements));
    }

    static class Solution {
        public int solution(int[] elements) {
            Set<Integer> set = new HashSet<>();
            
            int tmp;
            
            for(int i=0; i<elements.length; i++) {
                for(int j = 1; j <= elements.length; j++) {
                    tmp = 0;
                    
                    for(int k = i; k < i + j; k++) {
                        tmp += elements[k % elements.length];
                    }
                    
                    set.add(tmp);
                }
            }
            
            return set.size();
        }
    }
}