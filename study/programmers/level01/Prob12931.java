package programmers.level01;

class Prob12931 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 987;
        
        System.out.println(sol.solution(n));
    }
    
    static class Solution {
        public int solution(int n) {
            int answer = 0;
            /* 내코드
            String input = String.valueOf(n);
            
            for(int i=0; i<input.length(); i++) {
                answer += Integer.parseInt(String.valueOf(input.charAt(i)));
            }
            */
            
            /* 참고코드 */
            while (n != 0) {
                answer += n % 10;
                n /= 10;
            }
            
            return answer;
        }
    }
}