package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Prob1010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        /**
         * 이문제도 이항계수로 풀면 될 것 같음
         */

        int count = Integer.parseInt(br.readLine());

        /* 참고코드 */
        long n, m, result;
        for (int i=0; i<count; i++) {
            st = new StringTokenizer(br.readLine());
            n = Long.parseLong(st.nextToken());
            m = Long.parseLong(st.nextToken());

            result = 1;
            for (int j=0; j<n; j++) {
                result *= (m-j);
                result /= (j+1);
            }
            bw.write(result + "");
        }

        /* 내코드
        int m, n;

        for(int i=0; i<count; i++) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());

            bw.write(getResult(n, m) + "\n");
        }
        */
        bw.flush();
    }

    public static BigInteger getResult(int n, int m) {
        BigInteger result = BigInteger.valueOf(1);

        for(int i=m; i>m-n; i--) {      // nPk 공식
            result = result.multiply(BigInteger.valueOf(i));
        }

        for(int i=1; i<=n; i++) {       // 팩토리얼 구해서 나눌바에 나눠버리자
            result = result.divide(BigInteger.valueOf(i));
        }

        return result;
    }
}