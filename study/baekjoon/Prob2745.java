package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Prob2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String n = st.nextToken();
        int b = Integer.parseInt(st.nextToken());

        bw.write(Integer.parseUnsignedInt(n, b) + "");

        /*int result = 0;

        if(b > 10) {

        }

        for(int i=0; i<n.length(); i++) {
            if('A' <= n.charAt(i) && n.charAt(i) <= 'Z') {
                result += Math.pow(b, n.length()-i-1) * ((int)n.charAt(i) - 55);
            } else {
                result += Math.pow(b, n.length()-i-1) * Integer.parseInt(String.valueOf(n.charAt(i)));
            }
        }
        bw.write(result + "");
        */

        bw.flush();
    }
}