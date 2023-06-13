package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Prob10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        /* 참고코드 */
        for(char c='a'; c <='z'; c++) {
            bw.write(input.indexOf(c) + " ");
        }

        /* 내코드
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<input.length(); i++) {
            list.add((int) input.charAt(i));
        }

        for(int i=97; i<=122; i++) {         // 아스키 a-z
            bw.write(list.indexOf(i) + " ");
        }
        */

        bw.flush();
    }
}