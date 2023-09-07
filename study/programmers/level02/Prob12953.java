package programmers.level02;

class Prob12953 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[] arr = {2,6,8,14};

        System.out.println(sol.solution(arr));
    }

    static class Solution {
        public int solution(int[] arr) {
            int answer = getLcm(arr[0], arr[1]);
            
            for(int i=2; i<arr.length; i++) {
                answer = getLcm(answer, arr[i]);
            }
            
            return answer;
        }
        
        /* 최대공약수 구하는 공식 - 유클리드 호제법 */
        private static int getGcd(int a, int b) {     // 재귀 방식
            if(b == 0) return a;
            return getGcd(b, a % b);
        }
    
        /* 최소공배수 구하는 공식 */
        static int getLcm(int a, int b) {
            return a * b / getGcd(a, b);
        }
    }
}