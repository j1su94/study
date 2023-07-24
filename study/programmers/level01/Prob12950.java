package programmers.level01;

class Prob12950 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] arr1 = {{1,2}, {2,3}};
        int[][] arr2 = {{3,4}, {5,6}};

        System.out.println(sol.solution(arr1, arr2));
    }

    static class Solution {
        public int[][] solution(int[][] arr1, int[][] arr2) {
            for(int i=0; i<arr1.length; i++) {
                for(int j=0; j<arr1[i].length; j++) {
                    arr1[i][j] += arr2[i][j];
                }
            }

            return arr1;
        }
    }
}