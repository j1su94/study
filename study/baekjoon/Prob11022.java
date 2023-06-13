package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Prob11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());      // 입력받은 수

        StringTokenizer st;
        int a;
        int b;

        for(int i=1; i<=cnt; i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            bw.write("Case #");
            bw.write(String.valueOf(i));
            bw.write(": ");
            bw.write(a + " + " + b + " = ");
            bw.write(a + b + "\n");
        }

        bw.flush();
        bw.close();
    }
}