package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Prob1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int total = n + m;

        Map<String, Integer> map = new TreeMap<>();
        String input;

        while(total-->0) {
            input = br.readLine();
            map.put(input, map.getOrDefault(input, 0) + 1);
        }

        bw.write(n + m - map.size() + "\n");
        for(String key : map.keySet()) {
            if(map.get(key) == 2) {
                bw.write(key + "\n");
            }
        }

        bw.flush();
    }
}