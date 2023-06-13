package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Prob2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        int star = -1;
        int max = count - 1;

        for(int i=0; i<2*count-1; i++) {
            max = i < count ? max + 1 : max - 1;
            star = i < count ? star + 2 : star - 2;

            for(int j=0; j<max; j++) {
                if(j < max-star) {
                    bw.write(" ");
                } else {
                    bw.write("*");
                }
            }
            bw.write("\n");
        }

        bw.flush();
    }
}