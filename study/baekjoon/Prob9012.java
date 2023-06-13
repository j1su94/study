package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Prob9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String input;

        while(n-->0) {
            input = br.readLine();

            while(input.indexOf("()") > -1) {
                input = input.replaceAll("\\(\\)" ,"");
            }

            if(input.length() > 0) {
                bw.write("NO" + "\n");
            } else {
                bw.write("YES" + "\n");
            }
        }

        bw.flush();
    }
}