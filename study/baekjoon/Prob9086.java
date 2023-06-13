package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Prob9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        String word = "";

        for(int i=0; i<count; i++) {
            word = br.readLine();
            bw.write(word.charAt(0) + "" + word.charAt(word.length() - 1) + "\n");
        }

        bw.flush();
    }
}