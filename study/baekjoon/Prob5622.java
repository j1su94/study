package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Prob5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();

        Map<String, Integer> map = new HashMap<>();
        int i = 2;
        int max = 1;

        int result = 0;

        for(char c='A'; c<='Z'; c++) {
            if(max < 3 && c != 'S' && c != 'Z') {
                map.put(String.valueOf(c), i);
                max ++;
            } else if(c == 'S' || c == 'Z') {
                i--;
                map.put(String.valueOf(c), i);
                i++;
            } else {
                map.put(String.valueOf(c), i);
                i++;
                max = 1;
            }
        }

        for(int j=0; j<input.length(); j++) {
            result += map.get(String.valueOf(input.charAt(j)));
        }

        result += input.length();

        bw.write(result + "");
        bw.flush();
    }
}