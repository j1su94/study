package programmers.level01;

import java.util.Stack;

class Prob64061 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};

        System.out.println(sol.solution(board, moves));
    }

    static class Solution {
        public int solution(int[][] board, int[] moves) {
            int answer = 0;
            int[][] tmp = new int[board.length][board[0].length];

            for(int i=0; i<board.length; i++) {
                for(int j=0; j<board[i].length; j++) {
                    tmp[j][i] = board[i][j];
                }
            }

            Stack<Integer> stack = new Stack<>();
            int value = 0;

            for(int i=0; i<moves.length; i++) {
                value = 0;
                for(int j=0; j<tmp[moves[i] - 1].length; j++) {
                    if(tmp[moves[i] - 1][j] > 0) {
                        value = tmp[moves[i] - 1][j];
                        tmp[moves[i] - 1][j] = 0;
                        break;
                    }
                }

                if(value == 0) {
                    break;
                }

                if (stack.size() > 0) {
                    if (stack.peek() != value) {
                        stack.push(value);
                    } else {
                        stack.pop();
                        answer += 2;
                    }
                } else {
                    stack.push(value);
                }
            }

            return answer;
        }
    }
}