package programmers.level01;

class Prob12977 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {1,2,7,6,4};

        System.out.println(sol.solution(nums));
    }

    static class Solution {
        public int solution(int[] nums) {
            int answer = 0;

            for(int i=0; i<nums.length-2; i++) {
                for(int j=i+1; j<nums.length-1; j++) {
                    for(int k=j+1; k<nums.length; k++) {
                        answer += isPrime(nums[i] + nums[j] + nums[k]) ? 1 : 0;
                    }
                }
            }

            return answer;
        }

        boolean isPrime(int num) {               // 소수인지 판별 (√N까지 나눠서 소수를 판별)
            if(num < 2) {
                return false;
            }

            for(int i=2; i<=Math.sqrt(num); i++) {      // 제곱근 함수 : Math.sqrt()
                if(num % i == 0) {
                    return false;
                }
            }

            return true;
        }
    }
}