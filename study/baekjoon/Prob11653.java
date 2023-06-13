package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Prob11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        int tmp = 2;

        while(input != 1) {
            if(input % tmp == 0) {
                bw.write(tmp + "\n");
                input = input / tmp;
            } else {
                tmp++;
            }
        }

        bw.flush();
    }
}