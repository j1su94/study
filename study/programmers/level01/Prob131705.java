package programmers.level01;

class Prob131705 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] number = {-1, 1, -1, 1};

        System.out.println(sol.solution(number));
    }

    static class Solution {
        public int solution(int[] number) {
            int answer = 0;

            for(int i=0; i<=number.length-2; i++) {
                for(int j=i+1; j<number.length-1; j++) {
                    for(int k=j+1; k<number.length; k++) {
                        answer += (number[i] + number[j] + number[k] == 0) ? 1 : 0;
                    }
                }
            }

            return answer;
        }
    }
}