package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Prob4948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        int n;
        int cnt;

        /* 참고코드 - 아예 한번에 소수 배열 만들어서 */
        boolean[] arr = new boolean[1000001];
        for(int i = 2; i < Math.sqrt(1000001); i++) {
            if(!arr[i]) {
                for(int j=i*i; j<=1000000; j+=i) {      // 2를 예를 들면 2를 제외한 2의 배수는 2로 나뉘어지니 소수가 아님
                    arr[j] = true;
                }
            }
        }

        while(input-->0) {
            n = Integer.parseInt(br.readLine());
            cnt = 0;

            for(int i=2; i<=n/2; i++) {
                if(!arr[i] && !arr[n-i]) {
                    cnt++;
                }
            }
            bw.write(cnt + "\n");
        }

        bw.flush();
    }

    /* 에라토스테네스의 체 */
    /*private static boolean[] getPrimeNumbers(boolean[] arr, int number) {
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
    }*/
}