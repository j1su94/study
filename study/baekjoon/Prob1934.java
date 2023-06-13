package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Prob1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        // 최소공배수 구하기
        while(n-->0) {
            st = new StringTokenizer(br.readLine());
            bw.write(getLcm(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())) +"\n");
        }

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