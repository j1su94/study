package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Prob2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        /* 참고코드 */
        int sum = 0;
        int min = 0;
        int j;

        for(int i=n; i>=m; i--) {
            for(j=2; j<i; j++) {
                if(i % j == 0) {
                    break;
                }
            }

            if(j==i) {
                sum += i;
                min = j;
            }
        }


        /* 내코드
        int cnt;
        int sum = 0;
        int min = n;

        for(int i=m; i<=n; i++) {
            cnt = 0;

            for(int j=1; j<=i; j++) {
                if(i % j == 0) {
                    cnt++;
                }
            }

            if(cnt == 2) {
                sum += i;
                if(i < min) {
                    min = i;
                }
            }
        }
        */

        if(sum > 0) {
            bw.write(sum + "\n");
            bw.write(min + "");
        } else {
            bw.write("-1");
        }

        bw.flush();
    }
}