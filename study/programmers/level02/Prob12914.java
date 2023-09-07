package programmers.level02;

class Prob12914 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int n = 3;

        System.out.println(sol.solution(n));
    }

    static class Solution {
        public long solution(int n) {
            // 피보나치 수열: 바로 앞 두 항의 합인 수열
            // n:1 -> 1 n:2 -> 2 n:3 -> 3 n:4 -> 5 n:5 -> 8
            long arr[] = new long[n+1];
            
            arr[0] = 1;
            arr[1] = 1;
            
            for(int i=2; i<arr.length; i++) {
                arr[i] = (arr[i-2] + arr[i-1]) % 1234567;
            }
            
            return arr[n];
        }
    }
}