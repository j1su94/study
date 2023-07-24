package programmers.level01;

import java.util.Arrays;

class Prob12947 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int x = 18;
        
        System.out.println(sol.solution(x));
    }
    
    static class Solution {
        public boolean solution(int x) {
            // int y = Arrays.stream(Arrays.stream(String.valueOf(x).split("")).mapToInt(Integer::parseInt).toArray()).sum();
            int y = String.valueOf(x).chars().map(ch -> ch - '0').sum();        // chars(): IntStream으로 변환, char 문자를 숫자로 변환하는 방법은 - '0' 을 넣어주는 것

            return x % y == 0;
        }
    }
}