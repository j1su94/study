package programmers.level01;

class Prob81301 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "one4seveneight";

        System.out.println(sol.solution(s));
    }

    static class Solution {
        public int solution(String s) {
            String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
            for(int i = 0; i < arr.length; i++) {
                s = s.replaceAll(arr[i], String.valueOf(i));
            }

            return Integer.parseInt(s);
        }
    }
}