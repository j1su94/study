package programmers.level02;

class Prob12951 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String s = "3people  unFollowed me";

        System.out.println(sol.solution(s));
    }

    static class Solution {
        public String solution(String s) {
            /* 내코드
            String[] arr = s.split(" ", -1);        // 마지막 공백 포함하여 split
            System.out.println(Arrays.toString(arr));

            StringBuilder sb = new StringBuilder();

            for(int i=0; i<arr.length; i++) {
                if(arr[i].trim().length() == 0) {
                    sb.append(" ");
                    continue;
                }
                sb.append(String.valueOf(arr[i].charAt(0)).toUpperCase()).append(arr[i].toLowerCase().substring(1)).append(" ");
            }

            return sb.substring(0, sb.toString().length()-1);
            */

            /* 참고코드 */
            String answer = "";
            String[] sp = s.toLowerCase().split("");
            boolean flag = true;

            for(String ss : sp) {
                answer += flag ? ss.toUpperCase() : ss;
                flag = ss.equals(" ") ? true : false;
            }

            return answer;
        }
    }
}