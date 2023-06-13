package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob8393 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());    // 입력받은 데이터
        int result = 0;

        for(int i=1; i<=count; i++) {
            result += i;
        }

        System.out.println(result);

        /* 이런 방법도 있음 */
        System.out.println(count++ * count / 2);
    }
}