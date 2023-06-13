package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Prob2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();                        // 입력받은 데이터

        StringTokenizer st = new StringTokenizer(line);

        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        int plusMinute = Integer.parseInt(br.readLine());   // 입력받은 데이터

        int result = hour * 60 + minute + plusMinute;

        System.out.println(((result / 60 >= 24) ? result / 60 - 24 : result / 60) + " " + result % 60);
    }
}