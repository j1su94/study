package programmers.level01;

class Prob133499 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa", "yayae", "ayayeayayeaya"};

        System.out.println(sol.solution(babbling));
    }

    static class Solution {
        public int solution(String[] babbling) {
            int answer = 0;
            String[] possible = {"aya", "ye", "woo", "ma"};

            for(int i=0; i<babbling.length; i++) {
                babbling[i] = babbling[i].replaceAll(possible[0], "1");
                babbling[i] = babbling[i].replaceAll(possible[1], "2");
                babbling[i] = babbling[i].replaceAll(possible[2], "3");
                babbling[i] = babbling[i].replaceAll(possible[3], "4");

                answer += isPossible(babbling[i])? 1 : 0;
            }

            return answer;
        }

        public boolean isPossible(String input) {
            if(!"".equals(input.replaceAll("[0-9]", ""))) {
                return false;
            }

            String tmp = String.valueOf(input.charAt(0));

            for(int i=1; i<input.length(); i++) {
                if(tmp.equals(String.valueOf(input.charAt(i)))) {
                    return false;
                }
                tmp = String.valueOf(input.charAt(i));
            }

            return true;
        }
    }
}