package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Prob2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        int change;
        int[] arr = {25, 10, 5, 1};
        int tmp;

        for(int i=0; i<count; i++) {
            change = Integer.parseInt(br.readLine());
            /* 참고코드 */
            bw.write((change / 25) + " " + (change % 25 / 10) + " " + (change % 25 % 10 / 5) + " " + (change % 25 % 10 % 5));
            /* 내코드
            tmp = 0;

            while(tmp <= 3) {
                bw.write(change / arr[tmp] + " ");
                change = change % arr[tmp];
                tmp++;
            }
            */
            bw.write("\n");
        }

        bw.flush();
    }
}