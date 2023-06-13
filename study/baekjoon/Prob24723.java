package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Prob24723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        /* 참고코드 */
        bw.write((int) Math.pow(2, input) + "");
        /* 내코드
        int count = 2;

        for(int i=2; i<=input; i++) {
            count *= 2;
        }

        bw.write(count + "");
        */
        bw.flush();
    }
}