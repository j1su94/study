package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Prob10801 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());           // 배열의 크기
        String[] tmp = br.readLine().split(" ");
        int max = Integer.parseInt(tmp[0]);
        int min = Integer.parseInt(tmp[0]);

        for(int i=1; i<n; i++) {
            max = Math.max(max, Integer.parseInt(tmp[i]));
            min = Math.min(min, Integer.parseInt(tmp[i]));
        }

        bw.write(min + " " + max);
        bw.flush();
    }
}