package programmers.level01;

import java.util.LinkedList;
import java.util.Queue;

class Prob159994 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] cards1 = {"i", "drink", "water"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};

        System.out.println(sol.solution(cards1, cards2, goal));
    }

    static class Solution {
        public String solution(String[] cards1, String[] cards2, String[] goal) {
            Queue<String> queue1 = new LinkedList<>();
            Queue<String> queue2 = new LinkedList<>();

            for(int i=0; i<cards1.length; i++) {
                queue1.add(cards1[i]);
            }

            for(int i=0; i<cards2.length; i++) {
                queue2.add(cards2[i]);
            }

            for(int i=0; i<goal.length; i++) {
                if(queue1.contains(goal[i])) {
                    if(queue1.peek().equals(goal[i])) {
                        queue1.poll();
                    } else {
                        return "No";
                    }
                } else {
                    if(queue2.peek().equals(goal[i])) {
                        queue2.poll();
                    } else {
                        return "No";
                    }
                }
            }

            return "Yes";
        }
    }
}