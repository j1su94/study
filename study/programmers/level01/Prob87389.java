package programmers.level01;

class Prob87389 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 1000000;

        System.out.println(sol.solution(n));
    }
    
    static class Solution {
        public int solution(int n) {
            int answer = 0;
            
            for(int i=2; i<n; i++) {
                if(n % i == 1) {
                    answer = i;
                    break;
                }
            }
            return answer;
        }
    }
}