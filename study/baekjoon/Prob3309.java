package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Prob3309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        /* 참고코드 */
        int x = 0, y = 0;

        /**
         * 비트연산자 ^ (XOR)
         * A^A = 0
         * A^0 = A
         */

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            x = x ^ Integer.parseInt(st.nextToken());
            y = y ^ Integer.parseInt(st.nextToken());

            // 1: x1 = 0 ^ x1 -> x1,   y1 = 0 ^ y1 -> y1;
            // 2: x2 = x1 ^ a -> x2,   y2 = y1 ^ c -> y2;
            // 3: x3 = x2(x1 ^ a) ^ a -> x1,   y3 = y2(y1 ^ c) ^ y1 -> c

            System.out.println(i+1 + " : " + x + " " + y);
        }

        //System.out.print(x + " " + y);

        /* 내코드
        List<String> xList = new ArrayList<>();
        List<String> yList = new ArrayList<>();

        String x, y;

        for(int i=0; i<3; i++) {
            st = new StringTokenizer(br.readLine());
            x = st.nextToken();
            y = st.nextToken();

            if(!xList.contains(x)) {
                xList.add(x);
            } else {
                xList.remove(x);
            }

            if(!yList.contains(y)) {
                yList.add(y);
            } else {
                yList.remove(y);
            }
        }

        bw.write(xList.get(0) + " " + yList.get(0));
        */
        bw.flush();
    }
}