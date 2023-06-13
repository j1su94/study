package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Prob1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<String, Integer> map = new HashMap<>();

        String input = br.readLine().toUpperCase();
        int max = 0;

        for(int i=0; i<input.length(); i++) {
            map.put(String.valueOf(input.charAt(i)), map.getOrDefault(String.valueOf(input.charAt(i)), 0) + 1);
        }

        char ch = '?';

        for(String key : map.keySet()) {
            if(max < map.get(key)) {
                max = map.get(key);
                ch = key.charAt(0);
            } else if(max == map.get(key)) {
                ch = '?';
            }
        }

        bw.write(ch + "");
        bw.flush();
    }
}