package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Prob2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        /* 내코드
        input = input.replaceAll("c=", "A");
        input = input.replaceAll("c-", "A");
        input = input.replaceAll("dz=", "A");
        input = input.replaceAll("d-", "A");
        input = input.replaceAll("lj", "A");
        input = input.replaceAll("nj", "A");
        input = input.replaceAll("s=", "A");
        input = input.replaceAll("z=", "A");

        bw.write(input.length() + "");
        */

        /* 참고코드 */
        bw.write(input.replaceAll("c=|c-|dz=|d-|lj|nj|s=|z=", " ").length() + "");
        bw.flush();
    }
}