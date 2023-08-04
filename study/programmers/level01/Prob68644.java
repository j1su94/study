package programmers.level01;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Prob68644 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] numbers = {2,1,3,4,1};

        System.out.println(Arrays.toString(sol.solution(numbers)));
    }

    static class Solution {
        public int[] solution(int[] numbers) {
            Set<Integer> set = new TreeSet<>();

            for(int i=0; i<numbers.length-1; i++) {
                for(int j=i+1; j<numbers.length; j++) {
                    set.add(numbers[i] + numbers[j]);
                }
            }

            int[] answer = new int[set.size()];
            int cnt = 0;
            Iterator<Integer> iter = set.iterator();                // set을 Iterator 안에 담기

            while(iter.hasNext()) {                                 // iterator에 다음 값이 있다면
                answer[cnt] = iter.next();                          // iter에서 값 꺼내기
                cnt ++;
            }

            return answer;
        }
    }
}