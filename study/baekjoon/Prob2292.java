package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Prob2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        int i = 1;
        int tmp = 0;

        while(true && input != 1) {
            tmp += 6 * i++;
            if(input - 1 <= tmp) {
                break;
            }
        }

        bw.write(i + "");
        bw.flush();
    }
}