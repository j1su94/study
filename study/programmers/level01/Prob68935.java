package programmers.level01;

import java.util.ArrayList;
import java.util.List;

class Prob68935 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 125;

        System.out.println(sol.solution(n));
    }

    static class Solution {
        public int solution(int n) {
            /*int answer = 0;
            List<Integer> list = new ArrayList<>();

            while(n > 0) {
                list.add(n % 3);
                n = n / 3;
            }

            for(int i=0; i<list.size(); i++) {
                answer += list.get(i) * Math.pow(3, list.size()-i-1);
            }

            return answer;*/

            /* 참고코드 */
            String s = "";

            while(n > 0){
                s += n % 3;
                n /= 3;
            }

            return Integer.parseInt(s, 3);  // 이렇게 10진수로 바꿀 수 있음
        }
    }
}