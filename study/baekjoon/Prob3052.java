package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Prob3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] remain = new int[42];         // 나머지 값을 저장할 배열
        int line;
        int result = 0;

        for(int i=0; i<10; i++) {
            line = Integer.parseInt(br.readLine());
            remain[line % 42] = 1;
        }

        for(int i=0; i<remain.length; i++) {
            if(remain[i] != 0) {
                result++;
            }
        }

        bw.write(result + "");
        bw.flush();
    }
}