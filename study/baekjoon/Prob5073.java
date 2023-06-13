package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Prob5073 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int a, b, c;
        while(true) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());

            if(a + b + c == 0) {
                break;
            }

            if(Math.max(Math.max(a, b), c) >= a + b + c - Math.max(Math.max(a, b), c)) {        // 참고: c>=a+b || a>=b+c || b>=a+c 이렇게도..
                bw.write("Invalid\n");
            } else if(a == b && b == c) {
                bw.write("Equilateral\n");
            } else if(a == b || b == c || c == a) {
                bw.write("Isosceles\n");
            } else {
                bw.write("Scalene\n");
            }
        }

        bw.flush();
    }
}