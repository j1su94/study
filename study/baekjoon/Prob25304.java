package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Prob25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = Integer.parseInt(br.readLine());      // 총 결제 금액
        int count = Integer.parseInt(br.readLine());    // 총 상품 종류 개수
        int result = 0;

        StringTokenizer st;
        String line;

        for(int i=0; i<count; i++) {
            line = br.readLine();
            st = new StringTokenizer(line);
            result += Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
        }

        System.out.println(result == sum ? "Yes" : "No");
    }
}