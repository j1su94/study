package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Prob5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a;
        int b;

        while((a = Integer.parseInt(st.nextToken())) + (b = Integer.parseInt(st.nextToken())) != 0) {
            st = new StringTokenizer(br.readLine());

            if(b % a == 0) {
                bw.write("factor");
            } else if(a % b == 0) {
                bw.write("multiple");
            } else {
                bw.write("neither");
            }

            bw.write("\n");
        }

        bw.flush();
    }
}