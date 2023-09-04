package programmers.level02;

class Prob12911 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int n = 15;

        System.out.println(sol.solution(n));
    }

    static class Solution {
        public int solution(int n) {
            int count = Integer.bitCount(n);        // 이진수에서 1의 개수를 세어주는 함수

            while(true) {
                n++;

                if(Integer.bitCount(n) == count) {
                    break;
                }
            }

            return n;
        }
    }
}