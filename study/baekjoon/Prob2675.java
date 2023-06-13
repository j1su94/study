package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Prob2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int count = Integer.parseInt(br.readLine());

        String input;
        int r;
        String s;

        for(int i=0; i<count; i++) {
            input = br.readLine();
            st = new StringTokenizer(input);
            r = Integer.parseInt(st.nextToken());
            s = st.nextToken();

            for(int j=0; j<s.length(); j++) {
                for(int k=0; k<r; k++) {
                    bw.write(s.charAt(j));
                }
            }
            bw.write("\n");
        }

        bw.flush();
    }
}