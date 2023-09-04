package programmers.level01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

class Prob155652 {
    public static void main(String[] args) {
        Solution sol = new Solution();
/*

        String s = "aukks";
        String skip = "wbqd";
        int index = 5;
*/

        String s = "zzzzzz";
        String skip = "abcdefghijklmnopqrstuvwxy";
        int index = 6;
        System.out.println(sol.solution(s, skip, index));
    }

    static class Solution {
        public String solution(String s, String skip, int index) {
            String answer = "";
            char[] arr = new char[26];

            for(int i=0; i<26; i++) {
                String s1 = String.valueOf((char) ('a' + i));
                if(skip.indexOf(s1) == -1) {
                    arr[i] = (char) ('a' + i);
                } else {
                    arr[i] = ' ';
                }
            }

            int cnt;

            for(int i=0; i<s.length(); i++) {
                cnt = index;
                for(int j=1; j<=cnt; j++) {
                    if(arr[(s.charAt(i) - 97 + j) % 26] == ' ') {
                        cnt++;
                    }
                }

                answer += arr[(s.charAt(i) - 97 + cnt) % 26];
            }

            return answer;
        }
    }
}