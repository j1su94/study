package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Prob19532 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());

        int lcm, tmp1, tmp2, x, y;

        // 최소공배수 구하기
        lcm = getLcm(a, d);
        tmp1 = lcm == 0 ? 0 : lcm / a;
        tmp2 = lcm == 0 ? 0 : lcm / d;

        if(lcm != 0) {
            y = ((c * tmp1) - (f * tmp2)) / ((b * tmp1) - (e * tmp2));
            x = (c - b * y) / a;
        } else {
            y = c / b;
            x = (f - e * y) / d;
        }

        bw.write(x + " " + y);
        bw.flush();
    }

    /* 최대공약수 구하는 공식 - 유클리드 호제법 */
    private static int getGcd(int a, int b) {     // 재귀 방식
        if(b == 0) return a;
        return getGcd(b, a % b);
    }

    /* 최소공배수 구하는 공식 */
    static int getLcm(int a, int b) {
        return a * b / getGcd(a, b);
    }
}