package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Prob1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        br.readLine();
        String[] tmp = br.readLine().split(" ");

        int sum = 0;
        int max = 0;

        for(String score : tmp) {
            sum += Integer.parseInt(score);
            max = Integer.parseInt(score) > max ? Integer.parseInt(score) : max;
        }

        double result = (double) sum / max * 100 / tmp.length;

        bw.write(String.valueOf(result));
        bw.flush();
    }
}