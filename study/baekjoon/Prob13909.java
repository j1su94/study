package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Map;

public class Prob13909 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int n2 = 0;

        int cnt;

        bw.write((int) Math.sqrt(n) + "");

        /* 참고코드 */
        // n번째 창문이 열려 있으려면 열고 닫은 횟수가 홀수번이어야 한다.
        /*while(n2++<n) {
            int[] arr = new int[n2+1];

            for(int i=1; i<=n2; i++) {
                for(int j=i; j<=n2; j+=i) {
                    arr[j] = arr[j] == 1 ? 0 : 1;
                }
                // System.out.println((Arrays.stream(arr).filter(value -> value == 1)).sum());
                // System.out.println(i + " : " + (Arrays.stream(arr).filter(value -> value == 1)).sum());
            }
            System.out.println(Arrays.toString(arr).replace("[0, ", "").replace("]", ""));
            System.out.println(n2 + " : " + (Arrays.stream(arr).filter(value -> value == 1)).sum());        // 제곱근으로 나누었을때 값과 같음
        }*/


        /*cnt = 0;
        for(int i=1; i<n; i++) {
            if(arr[i] == 1) {
                cnt++;
            }
        }*/

        // bw.write(cnt + "");
        bw.flush();
    }
}