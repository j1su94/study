package programmers.level01;

class Prob161989 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int n = 10;
        int m = 1;
        int[] section = {1, 3};

        System.out.println(sol.solution(n, m, section));
    }

    static class Solution {
        public int solution(int n, int m, int[] section) {
            int answer = 1;
            int min = 0;
            int max = 1;

            if(m == 1) {
                return section.length;
            }

            while(max < section.length) {
                if(section[max] - section[min] + 1 <= m) {
                    max++;
                } else {
                    answer++;
                    min = max;
                }
            }

            return answer;
        }
    }
}