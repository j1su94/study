package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Prob3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] find = br.readLine().split(" ");
        int[] success = {1, 1, 2, 2, 2, 8};

        for(int i=0; i<find.length; i++) {
            bw.write(success[i] - Integer.parseInt(find[i]) + " ");
        }

        bw.flush();
    }
}