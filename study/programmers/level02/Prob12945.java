package programmers.level02;

class Prob12945 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int n = 100000;

        System.out.println(sol.solution(n));
    }

    static class Solution {
        public int solution(int n) {
            int[] arr = new int[100001];

            arr[0] = 0;
            arr[1] = 1;

            for(int i=2; i<=n; i++) {
                arr[i] = (arr[i-2] + arr[i-1]) % 1234567;
            }

            return arr[n];
        }
    }
}