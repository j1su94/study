package programmers.level01;

class Prob12934 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        long n = 50000000000000L;
        
        System.out.println(sol.solution(n));
    }
    
    static class Solution {
        public long solution(long n) {
            long i = (long) Math.sqrt(n);
            double d = Math.sqrt(n);

            if(i == d) {
                return (int) Math.pow(i + 1, 2);
            }

            return -1;
        }
    }
}