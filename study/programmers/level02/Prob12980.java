package programmers.level02;

class Prob12980 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int n = 5;

        System.out.println(sol.solution(n));
    }

    static class Solution {
        public int solution(int n) {
            int ans = 0;
            
            while(n > 1) {
                if(n % 2 == 1) {
                    n--;
                    ans++;
                } else {
                    n /= 2;
                }
            }
            
            return ans + 1;
        }
    }
}