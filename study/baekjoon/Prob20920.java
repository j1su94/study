package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Prob20920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String input;
        Map<String, Integer> map = new HashMap<>();

        while(n-->0) {
            input = br.readLine();

            if(input.length() >= m) {
                map.put(input, map.getOrDefault(input, 0) + 1);
            }
        }

        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
        /* Comparator 써서 했는데 자바가 알아서 바꿔 줌 */
        /* 세 번 sor 했더니 시간 초과 남.. */
        /*
        Collections.sort(entryList, Map.Entry.comparingByKey());                                // 사전 순
        Collections.sort(entryList, (o1, o2) -> o2.getKey().length() - o1.getKey().length());   // 길이 순
        Collections.sort(entryList, (o1, o2) -> o2.getValue() - o1.getValue());                 // 횟수 순
        */

        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if(o1.getValue() == o2.getValue()) {
                    if(o1.getKey().length() == o2.getKey().length()) {
                        return o1.getKey().compareTo(o2.getKey());
                    } else {
                        return o2.getKey().length() - o1.getKey().length();
                    }
                }
                return o2.getValue() - o1.getValue();
            }
        });

        for(Map.Entry<String, Integer> e : entryList) {
            bw.write(e.getKey() + "\n");
        }

        bw.flush();
    }
}