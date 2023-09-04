package programmers.level01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

class Prob150370 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String today = "2020.12.17";
        String[] terms = {"A 12"};
        String[] privacies = {"2010.01.01 A", "2019.12.17 A"};

        System.out.println(Arrays.toString(sol.solution(today, terms, privacies)));
    }

    static class Solution {
        public int[] solution(String today, String[] terms, String[] privacies) {
            /* 참고 코드 */
            List<Integer> answer = new ArrayList<>();
            Map<String, Integer> termMap = new HashMap<>();
            int date = getDate(today);

            for (String s : terms) {
                String[] term = s.split(" ");

                termMap.put(term[0], Integer.parseInt(term[1]));
            }
            for (int i = 0; i < privacies.length; i++) {
                String[] privacy = privacies[i].split(" ");

                if (getDate(privacy[0]) + (termMap.get(privacy[1]) * 28) <= date) {
                    answer.add(i + 1);
                }
            }
            return answer.stream().mapToInt(integer -> integer).toArray();

            /*
            내 코드
            List<Integer> list = new ArrayList<>();
            StringTokenizer st;

            String[] date;
            String term = "";

            Map<String, Integer> map = new HashMap<>();

            for(int i=0; i<terms.length; i++) {
                st = new StringTokenizer(terms[i]);

                map.put(st.nextToken(), Integer.parseInt(st.nextToken()));
            }

            int mm, dd;

            for(int i=0; i<privacies.length; i++) {
                st = new StringTokenizer(privacies[i]);

                date = st.nextToken().split("\\.");
                term = st.nextToken();

                if(Integer.parseInt(date[2]) - 1 == 0) {
                    dd = 28;
                    date[1] = String.valueOf(Integer.parseInt(date[1]) - 1);
                } else {
                    dd = Integer.parseInt(date[2]) - 1;
                }

                if(Integer.parseInt(date[1]) + map.get(term) > 12) {
                    if((Integer.parseInt(date[1]) + map.get(term)) % 12 == 0) {
                        mm = 12;
                        date[0] = String.valueOf(Integer.parseInt(date[0]) + ((Integer.parseInt(date[1]) + map.get(term)) / 12) - 1);
                    } else {
                        mm = (Integer.parseInt(date[1]) + map.get(term)) % 12;
                        date[0] = String.valueOf(Integer.parseInt(date[0]) + ((Integer.parseInt(date[1]) + map.get(term)) / 12));
                    }
                } else {
                    mm = Integer.parseInt(date[1]) + map.get(term);
                }

                date[0] = String.valueOf(date[0]);
                date[1] = String.format("%02d", mm);
                date[2] = String.format("%02d", dd);

                System.out.println(Integer.parseInt(date[0] + date[1] + date[2]) - Integer.parseInt(today.replaceAll("\\.", "")));
                System.out.println(Integer.parseInt(date[0] + date[1] + date[2]));
                System.out.println(Integer.parseInt(today.replaceAll("\\.", "")));

                if(Integer.parseInt(date[0] + date[1] + date[2]) - Integer.parseInt(today.replaceAll("\\.", "")) < 0) {
                    list.add(i+1);
                }
            }

            int[] answer = new int[list.size()];

            for(int i=0; i<list.size(); i++) {
                answer[i] = list.get(i);
            }

            return answer;*/
        }

        private int getDate(String today) {
            String[] date = today.split("\\.");
            int year = Integer.parseInt(date[0]);
            int month = Integer.parseInt(date[1]);
            int day = Integer.parseInt(date[2]);
            return (year * 12 * 28) + (month * 28) + day;
        }
    }
}