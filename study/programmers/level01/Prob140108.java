package programmers.level01;

class Prob140108 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String s = "aaabbaccccabbba";

        System.out.println(sol.solution(s));
    }

    static class Solution {
        public int solution(String s) {
            /* 내코드
            char x = s.charAt(0);
            int answer = 0;
            int xCnt = 0;
            int yCnt = 0;

            for(int i=0; i<s.length(); i++) {
                if(s.charAt(i) == x) {
                    xCnt++;
                } else {
                    yCnt++;
                }

                if(xCnt == yCnt) {
                    answer++;
                    xCnt = 0;
                    yCnt = 0;

                    if(i < s.length()-1) {
                        x = s.charAt(i+1);
                    } else {
                        break;
                    }
                } else if(i == s.length()-1) {
                    answer++;
                }
            }

            answer += answer == 0 ? 1 : 0;*/

            /* 참고코드 */
            int answer = 0;
            char init = s.charAt(0);
            int count = 0;

            for (char c : s.toCharArray()) {
                if (count == 0) {
                    init = c;
                }
                if (init == c) {
                    count++;
                } else {
                    count--;
                }
                if (count == 0) {
                    answer++;
                }
            }


            return answer;
        }
    }
}