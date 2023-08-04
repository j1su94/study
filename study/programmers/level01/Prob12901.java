package programmers.level01;

import java.util.Calendar;

class Prob12901 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int a = 5;
        int b = 24;

        System.out.println(sol.solution(a, b));
    }

    static class Solution {
        public String solution(int a, int b) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(2016, a-1, b);

            return calendar.getTime().toString().split(" ")[0].toUpperCase();
        }
    }
}