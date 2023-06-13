package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Prob11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        /**
         * 이항계수.....
         * N개의 원소 중에 k개의 원소를 뽑아내는 경우의 수
         * 이항식을 이항 정리로 전개했을 때 각 항의 계수이며, 주어진 크기의 (순서 없는) 조합 의 가짓수이다.
         * ex) (a+b)⁵ = a⁵ + 5a⁴b + 10a³b² + 10a²b³ + 5ab⁴ + b⁵
         * -> a가 2인 수의 앞은 10..
         * 공식: nCr = n-1Cr + n-1Cr-1
         * 공식: nCr = nPr / r! => n! / nCr = (n-r)!r!
         *
         * 공식: n! / r!(n-r)!
         * 공식: ₄C₃ = ₄P₃ / 3!
         *
         * nPr 공식은 n! / (n-r)! 인데 계산하면 r이 3이면 n * n-1 * n-2만 하면 됨..
         */

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int result = 1;

        for(int i=n; i>n-k; i--) {      // nPk 공식
            result *= i;
        }

        for(int i=1; i<=k; i++) {       // 팩토리얼 구해서 나눌바에 나눠버리자
            result /= i;
        }

        bw.write(result + "");
        bw.flush();
    }
}