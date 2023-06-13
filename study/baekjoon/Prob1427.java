package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Prob1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String n = br.readLine();
        int[] result = new int[n.length()];

        for(int i=0; i<n.length(); i++) {
            result[i] = Integer.parseInt(n.charAt(i) + "");
        }

        Arrays.sort(result);

        for(int i=result.length; i>0; i--) {
            bw.write(result[i-1] + "");
        }

        bw.flush();
    }
}