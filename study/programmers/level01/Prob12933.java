package programmers.level01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Prob12933 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        long n = 118372;
        
        System.out.println(sol.solution(n));
    }
    
    static class Solution {
        public long solution(long n) {
            String input = String.valueOf(n);
            List<String> list = new ArrayList<>();

            for(int i=0; i<input.length(); i++) {
                list.add(String.valueOf(input.charAt(i)));
            }

            Collections.sort(list, (o1, o2) -> Integer.parseInt(o2) - Integer.parseInt(o1));

            String result = "";

            for(int i=0; i<list.size(); i++) {
                result += list.get(i);
            }

            return Long.parseLong(result);
        }
    }
}