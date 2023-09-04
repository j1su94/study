package programmers.level01;

class Prob72410 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String new_id = "abcdefghijklmn.p";

        System.out.println(sol.solution(new_id));
    }

    static class Solution {
        public String solution(String new_id) {
            new_id = new_id.toLowerCase().replaceAll("[^0-9a-z-_.]", "");       // ^의 경우 문자열의 시작을 의미하지만, [] 내에 존재하면 not을 의미합
            new_id = new_id.replaceAll("\\.+", ".");                // 연속된 마침표를 하나의 마침표로
            new_id = new_id.replaceAll("^[.]|[.]$", "");            // 마침표로 시작하거나 끝나는지

            new_id = new_id.length() == 0 ? "a" : new_id;
            new_id = new_id.length() >= 16 ? new_id.substring(0, 15) : new_id;

            new_id = new_id.replaceAll("[.]$", "");                 // 마침표로 끝나는지

            if(new_id.length() <= 2) {
                new_id += (new_id.substring(new_id.length()-1) + new_id.substring(new_id.length()-1)).substring(0, 3-new_id.length());
            }

            return new_id;
        }
    }
}