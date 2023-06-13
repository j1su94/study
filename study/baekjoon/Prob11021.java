package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Prob11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());      // 입력받은 수

        StringTokenizer st;

        for(int i=0; i<cnt; i++) {
            st = new StringTokenizer(br.readLine());
            bw.write("Case #");
            bw.write(String.valueOf(i + 1));
            bw.write(": ");
            bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");
        }

        bw.flush();
        bw.close();
    }
}