package programmers.level01;

import java.util.Arrays;

class Prob42862 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int n = 4;
        int[] lost = {2, 4};
        int[] reserve = {1, 3};

        System.out.println(sol.solution(n, lost, reserve));
    }

    static class Solution {
        public int solution(int n, int[] lost, int[] reserve) {
            int[] students = new int[n+2];      // n+2로 하면 추가 조건 붙일 필요가 없음
            Arrays.fill(students, 1);
            students[0] = 0;
            students[students.length-1] = 0;

            for(int i=0; i<lost.length; i++) {
                students[lost[i]] = 0;
            }

            for(int i=0; i<reserve.length; i++) {
                students[reserve[i]] += 1;
            }

            System.out.println(Arrays.toString(students));

            for(int i=1; i<=n; i++) {
                if(students[i] == 0 && students[i-1] == 2) {
                    students[i] = 1;
                    students[i-1] = 1;
                } else if(students[i] == 0 && students[i+1] == 2) {
                    students[i] = 1;
                    students[i+1] = 1;
                }

                System.out.println(Arrays.toString(students));
            }

            return (int) Arrays.stream(students).filter(v -> v >= 1).count();
        }
    }
}