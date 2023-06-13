package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Prob1330 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();        // 입력받은 데이터

        StringTokenizer st = new StringTokenizer(line);

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if(a - b == 0) {
            System.out.println("==");
        } else if(a - b > 0) {
            System.out.println(">");
        } else if(a - b < 0) {
            System.out.println("<");
        }
    }
}