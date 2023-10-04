package programmers.level02;

class Prob12949 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[][] arr1 = {{1, 4}, {3, 2}, {4, 1}};
        int[][] arr2 = {{3, 3}, {3, 3}};
        
        // int[][] arr1 = {{2, 3, 2}, {4, 2, 4}, {3, 1, 4}};
        // int[][] arr2 = {{5, 4, 3}, {2, 4, 1}, {3, 1, 1}};

        System.out.println(sol.solution(arr1, arr2));
    }

    // 행렬 곱셈
    static class Solution {
        public int[][] solution(int[][] arr1, int[][] arr2) {
            int[][] answer = new int[arr1.length][arr2[0].length];
            
            for(int i=0; i<answer.length; i++) {
                for(int j=0; j<answer[i].length; j++) {
                    for(int k=0; k<arr2.length; k++) {
                        answer[i][j] += arr1[i][k] * arr2[k][j];
                    }
                }
            }
            
            return answer;
        }
    }
}