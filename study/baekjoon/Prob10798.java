package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Prob10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = "";
        String[][] arr = new String[5][15];

        for(int i=0; i<arr.length; i++) {
            input = br.readLine();

            for(int j=0; j<arr[i].length; j++) {
                if(j < input.length()) {
                    arr[i][j] = String.valueOf(input.charAt(j));
                } else {
                    arr[i][j] = "";
                }
            }
        }

        for(int i=0; i<15; i++) {
            for(int j=0; j<5; j++) {
                bw.write(arr[j][i]);
            }

        }

        bw.flush();
    }

}