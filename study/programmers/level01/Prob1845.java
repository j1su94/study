package programmers.level01;

import java.util.HashSet;
import java.util.Set;

class Prob1845 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {3,3,3,2,2,4};

        System.out.println(sol.solution(nums));
    }

    static class Solution {
        public int solution(int[] nums) {
            Set<Integer> set = new HashSet<>();

            for(int i=0; i<nums.length; i++) {
                set.add(nums[i]);
            }

            return set.size() > nums.length/2 ? nums.length/2 : set.size();
        }
    }
}