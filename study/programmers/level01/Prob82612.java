package programmers.level01;

class Prob82612 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int price = 3;
        int money = 20;
        int count = 3;

        System.out.println(sol.solution(price, money, count));
    }

    static class Solution {
        public long solution(int price, int money, int count) {
            long result = money;

            /*
            for(int i=1; i<=count; i++) {
                result -= price * i;
            }

            return result < 0 ? result * -1 : 0;*/

            /* 참고코드 */
            // 등차수열 -> 공식 : n(n+1) / 2 (n : n번째 까지 항의 개수)
            result -= (long) price * (count * (count + 1) / 2);

            return Math.max(-result, 0);
        }
    }
}