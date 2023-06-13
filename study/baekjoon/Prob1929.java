package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Prob1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        boolean[] arr = new boolean[b+1];
        arr = getPrimeNumbers(arr, b);

        for(int i=a; i<=b; i++) {
            if(!arr[i]) {
                bw.write(i + "\n");
            }
        }

        bw.flush();
    }

    /* 에라토스테네스의 체 */
    private static boolean[] getPrimeNumbers(boolean[] arr, int number) {
        arr[0] = true;                                  // 소수면 false, 소수가 아니면 true
        arr[1] = true;

        for(int i=2; i<=Math.sqrt(number); i++) {
            if(!arr[i]) {
                for(int j=i*i; j<=number; j+=i) {       // 2를 예를 들면 2를 제외한 2의 배수는 2로 나뉘어지니 소수가 아님
                    arr[j] = true;
                }
            }
        }

        return arr;
    }
}