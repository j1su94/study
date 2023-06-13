package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Prob10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        Map<Integer, String> map = new LinkedHashMap<>();
        int key;
        String val;

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            key = Integer.parseInt(st.nextToken());
            val = st.nextToken();
            map.put(key, map.getOrDefault(key, "") + " " + val);
        }

        List<Integer> keySet = new ArrayList<>(map.keySet());

        // 키 값으로 오름차순 정렬
        Collections.sort(keySet);
        String[] arr;

        for(Integer k : keySet) {
            arr = map.get(k).trim().split(" ");
            for(String s : arr) {
                bw.write(k + " " + s + "\n");
            }
        }

        bw.flush();
    }
}