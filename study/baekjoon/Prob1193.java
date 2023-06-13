package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Prob1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        /** 참고코드
         * 등차수열
         * 1/1
         * 2/1, 1/2
         * 3/1, 2/2, 1/3
         * ....
         * 공식 : n(a+l) / 2 (n : n번째 까지 항의 개수)
         * 공식 : (수의 갯수) * (끝수 + 첫번째 수) / 2
         */

        int input = Integer.parseInt(br.readLine());

        int line = 0;
        int cnt = 0;

        while(cnt < input) {            // 등차수열
            line++;
            cnt = line * (line + 1) / 2;
        }

        int top, bottom;

        if(line % 2 != 0) {             // 홀수
            top = 1 + (cnt - input);
            bottom = line - (cnt - input);
        } else {
            top = line - (cnt - input);
            bottom = 1 + (cnt - input);
        }

        bw.write(top + "/" + bottom);
        bw.flush();
    }
}