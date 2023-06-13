package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Prob1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int cnt;
        int result = 0;

        for(int i=0; i<count; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            cnt = 0;

            for(int j=1; j<=tmp; j++) {
                if(tmp % j == 0) {
                    cnt++;
                }
            }

            result += cnt == 2 ? 1 : 0;
        }

        bw.write(result + "");
        bw.flush();
    }
}