package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Prob2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());

        /* 참고코드 */
        int ans = 0;
        for(int i=0; i<input; i++) {
            int sum = i;
            int k = i;
            while(k > 0) {
                sum += k % 10;
                k /= 10;
            }
            if(sum == input) {
                ans = i;
                break;
            }
        }

        bw.write(ans + "");

        /* 내코드
        int i = 0, tmp;
        String s;

        while(i < Integer.parseInt(input)) {
            tmp = 0;
            s = String.valueOf(i);
            for(int j=0; j<s.length(); j++) {
                tmp += Integer.parseInt(String.valueOf(s.charAt(j)));
            }

            if(tmp + i == Integer.parseInt(input)) {
                break;
            }

            i++;
        }

        bw.write(i == Integer.parseInt(input) ? "0" : i + "");
        */
        bw.flush();
    }
}