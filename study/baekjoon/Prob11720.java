package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Prob11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        String num = br.readLine();
        int result = 0;

        for(int i=0; i<count; i++) {
            result += Integer.parseInt(String.valueOf(num.charAt(i)));
        }

        bw.write(result + "");
        bw.flush();
    }
}