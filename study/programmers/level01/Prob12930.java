package programmers.level01;

import java.util.StringTokenizer;

class Prob12930 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "  TRy HElLo  WORLD ";

        System.out.println(sol.solution(s));
    }

    static class Solution {
        public String solution(String s) {
            char[] arr = s.toCharArray();
            StringTokenizer st = new StringTokenizer(s);

            String word = "";
            int tmp = 0;

            for(int i=0; i<arr.length; i+=tmp) {
                if(String.valueOf(arr[i]).matches("[a-zA-z]")) {
                    word = st.nextToken();

                    for(int j=0; j<word.length(); j++) {
                        arr[i+j] = (j % 2 == 0) ? Character.toUpperCase(word.charAt(j)) : Character.toLowerCase(word.charAt(j));
                    }

                    tmp = word.length();
                } else {
                    tmp = 1;
                }
            }

            return new StringBuilder(new String(arr)).toString();
        }
    }
}