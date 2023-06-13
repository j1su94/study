package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Prob2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        /* 내코드
        int x, y;
        int tmp = n;
        int i = 0;

        while(true) {
            x = n / 5 - i > 0 ? n / 5 - i : 0;
            n = n - 5 * x;
            y = n / 3;
            n = n - 3 * y;

            if(n == 0) {
                bw.write(x + y + "");
                break;
            } else {
                if(x == 0) {
                    bw.write("-1");
                    break;
                }
                n = tmp;
                i++;
            }
        }
        */

        /* 참고코드 -> 내가 전에 한 코드.. */
        /*
        int min = -1;

        for(int x=0; x<=n/5; x++) {
            for(int y=0; y<=n/3; y++) {
                if(5*x + 3*y == n) {
                    min = x + y;
                    break;
                }
            }
        }

        bw.write(min + "");
        */

        /* 참고코드 - https://st-lab.tistory.com/72*/
        if (n == 4 || n == 7) {
            bw.write(-1 + "");
        } else if (n % 5 == 0) {
            bw.write(n / 5 + "");
        } else if (n % 5 == 1 || n % 5 == 3) {
            bw.write((n / 5) + 1 + "");
        } else if (n % 5 == 2 || n % 5 == 4) {
            bw.write((n / 5) + 2 + "");
        }


        bw.flush();
    }
}