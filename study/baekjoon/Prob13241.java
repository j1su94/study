package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Prob13241 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        bw.write(getLcm(Long.parseLong(st.nextToken()), Long.parseLong(st.nextToken())) +"\n");

        bw.flush();
    }

    /* 최대공약수 구하는 공식 - 유클리드 호제법 */
    private static long getGcd(long a, long b) {     // 재귀 방식
        if(b == 0) return a;
        return getGcd(b, a % b);
    }

    /* 최소공배수 구하는 공식 */
    static long getLcm(long a, long b) {
        return a * b / getGcd(a, b);
    }
}