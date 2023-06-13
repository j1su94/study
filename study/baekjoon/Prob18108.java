package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob18108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();        // 입력받은 데이터
        int seogi = Integer.parseInt(line) - 543;

        System.out.println(seogi);
    }
}