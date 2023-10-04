package programmers.level02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Prob64065 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        String s = "{{1,2,3},{2,1},{1,2,4,3},{2}}";
        
        System.out.println(Arrays.toString(sol.solution(s)));
    }

    static class Solution {
        public int[] solution(String s) {
            /* 내코드
            String[] arr = s.split("},");
            
            for(int i=0; i<arr.length; i++) {
                arr[i] = arr[i].replaceAll("\\{|\\}", "");
            }
            
            Arrays.sort(arr, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o1.length() - o2.length();
                }
            });
            
            List<Integer> list = new ArrayList<>();
            list.add(Integer.parseInt(arr[0]));
            
            String[] tmp;
            for(int i=1; i<arr.length; i++) {
                tmp = arr[i].split(",");
                
                for(int j=0; j<tmp.length; j++) {
                    if(!list.contains(Integer.parseInt(tmp[j]))) {
                        list.add(Integer.parseInt(tmp[j]));
                    }
                }
            }
            
            int[] answer = new int[list.size()];
            
            for(int i=0; i<list.size(); i++) {
                answer[i] = list.get(i);
            }
            
            return answer;
            */
            
            /* 참고코드 */
            Map<String, Integer> map = new HashMap<>();
            Pattern pattern = Pattern.compile("[0-9]+");
            Matcher matcher = pattern.matcher(s);
            
            while (matcher.find()) {
                String n = matcher.group();
                map.put(n, map.getOrDefault(n, 0) + 1);
            }
            
            int size = map.size();
            int[] answer = new int[size];
            
            for (String key: map.keySet()) {
                answer[size - map.get(key)] = Integer.parseInt(key);
            }
            
            return answer;
        }
    }
}