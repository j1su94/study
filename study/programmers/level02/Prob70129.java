package programmers.level02;

import java.util.Arrays;

class Prob70129 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String s = "110010101001";

        System.out.println(Arrays.toString(sol.solution(s)));
    }

    static class Solution {
        public int[] solution(String s) {
            String tmp = s;
            int removeCnt = 0;
            int zeroCnt = 0;

            while(!"1".equals(tmp)) {
                removeCnt++;
                tmp = tmp.replace("0", "");

                zeroCnt += s.length() - tmp.length();
                tmp = Integer.toBinaryString(tmp.replace("0", "").length());        // toBinaryString: 10진수 -> 2진수
                s = tmp;
            }

            return new int[] {removeCnt, zeroCnt};
        }
    }
}