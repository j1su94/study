package programmers.level01;

class Prob86051 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] numbers = {1,2,3,4,6,7,8,0};

        System.out.println(sol.solution(numbers));
    }

    static class Solution {
        public int solution(int[] numbers) {
            int answer = 45;

            for(int i=0; i<numbers.length; i++) {
                answer -= numbers[i];
            }

            return answer;
        }
    }
}