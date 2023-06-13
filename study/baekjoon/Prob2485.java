package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Prob2485 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int gcd = arr[1] - arr[0];
        for(int i=1; i<arr.length-1; i++) {
            gcd = getGcd(gcd, (arr[i+1] - arr[i]));
        }

        bw.write(((arr[n-1] - arr[0]) / gcd + 1 ) - n + "");
        bw.flush();
    }

    /* 최대공약수 구하는 공식 - 유클리드 호제법 */
    private static int getGcd(int a, int b) {     // 재귀 방식
        if(b == 0) return a;
        return getGcd(b, a % b);
    }
}