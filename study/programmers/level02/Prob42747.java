package programmers.level02;

import java.util.Arrays;

class Prob42747 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // int[] citations = {25, 8, 5, 3, 3};
        int[] citations = {3, 0, 6, 1, 5};

        System.out.println(sol.solution(citations));
    }

    static class Solution {
        public int solution(int[] citations) {
            /* 내코드
            int answer = 0;
            
            Arrays.sort(citations);
            int cnt;
            
            for(int i=citations.length; i>0; i--) {
                cnt = 0;
                for(int j=citations.length-1; j>=0; j--) {
                    if(citations[j] >= i) {
                        cnt++;
                    } else {
                        break;
                    }
                }
                
                if(i <= cnt) {
                    return i;
                }
            }
            
            return answer;
            */
            Arrays.sort(citations);
            
            int max = 0;
            for(int i=citations.length-1; i>=0; i--) {
                int min = Math.min(citations[i], citations.length-i);
                
                if(max < min) {
                    max = min;
                }
            }
            
            return max;
        }
    }
}