package programmers.level02;

class Prob12985 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int n = 8;
        int a = 4;
        int b = 7;

        System.out.println(sol.solution(n, a, b));
    }

    static class Solution {
        public int solution(int n, int a, int b) {
            int answer = 1;
            
            int max = Math.max(a, b);
            int min = Math.min(a, b);
            
            while(true) {
                if(max % 2 == 1) {
                    max += 1;
                }
                
                if(min % 2 == 1) {
                    min += 1;
                }
                
                max /= 2;
                min /= 2;
                
                if(max == min) {
                    break;
                }
                
                answer++;
            }
            
            return answer;
        }
    }
}