package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Prob1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        char[] case1 = {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'};
        char[] case2 = {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'};

        String input;
        String[] inputs = new String[m];
        for(int i=0; i<m; i++) {
            inputs[i] = br.readLine();
        }

        int cnt1, cnt2;
        int itmp = 0;
        int jtmp = 0;
        int result = 63;

        while(true) {
            cnt1 = 0;
            cnt2 = 0;

            for(int i=itmp; i<itmp+8; i++) {
                input = inputs[i];
                for(int j=jtmp, k=0; j<jtmp+8; j++,k++) {
                    if(i%2==0) {
                        if(input.charAt(j) != case1[k]) {
                            cnt1++;
                        }
                        if(input.charAt(j) != case2[k]) {
                            cnt2++;
                        }
                    } else {
                        if(input.charAt(j) != case2[k]) {
                            cnt1++;
                        }
                        if(input.charAt(j) != case1[k]) {
                            cnt2++;
                        }
                    }
                }
            }

            result = Math.min(result, Math.min(cnt1, cnt2));

            jtmp++;

            if(jtmp == n-7) {
                if(itmp == m-8) {
                    break;
                }
                itmp++;
                jtmp = 0;
            }

        }

        bw.write(result + "");
        bw.flush();

    }
}