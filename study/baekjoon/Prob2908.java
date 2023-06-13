package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Prob2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String a = st.nextToken();
        String b = st.nextToken();

        int A = Integer.parseInt(a.charAt(2) + "" + a.charAt(1) + "" + a.charAt(0));
        int B = Integer.parseInt(b.charAt(2) + "" + b.charAt(1) + "" + b.charAt(0));

        bw.write(Math.max(A, B) + "");
        bw.flush();
    }
}