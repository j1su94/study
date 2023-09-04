package programmers.level01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

class Prob92334 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String[] id_list = {"abc", "acd", "add", "abd"};
        String[] report = {"abc abd", "abc add", "acd abd", "abc abd", "add abd"};
        int k = 2;

        System.out.println(Arrays.toString(sol.solution(id_list, report, k)));
    }

    static class Solution {
        public int[] solution(String[] id_list, String[] report, int k) {
            int[] answer = new int[id_list.length];
            StringTokenizer st;

            Map<String, Integer> userMap = new HashMap<>();
            Map<String, Integer> reportMap = new HashMap<>();

            Set<String> set = new HashSet<>();

            for(int i=0; i<report.length; i++) {
                set.add(report[i]);
            }

            String userId, reportId;
            Iterator<String> iter = set.iterator();

            while(iter.hasNext()) {
                st = new StringTokenizer(iter.next());

                st.nextToken();

                reportId = st.nextToken();
                reportMap.put(reportId, reportMap.getOrDefault(reportId, 0) + 1);
            }

            iter = set.iterator();

            while(iter.hasNext()) {
                st = new StringTokenizer(iter.next());

                userId = st.nextToken();
                reportId = st.nextToken();

                if(reportMap.getOrDefault(reportId, 0) >= k) {
                    userMap.put(userId, userMap.getOrDefault(userId, 0) + 1);
                }
            }


            for(int i=0; i<id_list.length; i++) {
                answer[i] = userMap.getOrDefault(id_list[i], 0);
            }

            return answer;
        }
    }
}