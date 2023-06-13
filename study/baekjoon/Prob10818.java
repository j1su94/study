package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Prob10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(br.readLine());            // 배열의 크기

        int x = Integer.parseInt(st.nextToken());           // 비교해야 할 기준 숫자
        String[] tmp = br.readLine().split(" ");

        for(int i=0; i<n; i++) {
            if(Integer.parseInt(tmp[i]) < x) {
                bw.write(tmp[i] + " ");
            }
        }

        bw.flush();
    }
}