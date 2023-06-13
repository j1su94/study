package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob9498 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int score = Integer.parseInt(br.readLine());    // 입력받은 데이터
        String credit = "";

        switch (score / 10) {
            case 10: case 9:
                credit = "A";
                break;
            case 8:
                credit = "B";
                break;
            case 7:
                credit = "C";
                break;
            case 6:
                credit = "D";
                break;
            default:
                credit = "F";
        }

        System.out.println(credit);
    }
}