package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Prob2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();        // 입력받은 데이터

        StringTokenizer st = new StringTokenizer(line);

        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());

        int result = (hour == 0 ? 24 : hour) * 60 + minute - 45;

        System.out.println(((result / 60 == 24) ? 0 : result / 60) + " " + result % 60);
    }
}