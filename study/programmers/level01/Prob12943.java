package programmers.level01;

class Prob12943 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int num = 18;
        
        System.out.println(sol.solution(num));
    }
    
    static class Solution {
        public int solution(int num) {
            int cnt = 0;
            long l = num;

            while(l != 1 && cnt < 500) {
                if(l % 2 == 0) {
                    l /= 2;
                } else {
                    l = l * 3 + 1;
                }
                cnt ++;
            }

            return cnt == 500 ? -1 : cnt;
        }
    }
}