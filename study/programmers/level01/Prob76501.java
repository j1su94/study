package programmers.level01;

class Prob76501 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] absolutes = {4,7,12};
        boolean[] signs = {true,false,true};
        System.out.println(sol.solution(absolutes, signs));
    }

    static class Solution {
        public int solution(int[] absolutes, boolean[] signs) {
            int answer = 0;

            for(int i=0; i<absolutes.length; i++) {
                answer += signs[i] ? absolutes[i] : absolutes[i] * -1;
            }

            return answer;
        }
    }
}