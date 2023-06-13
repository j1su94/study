package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Prob2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[][] arr = new String[9][9];
        int max = 0;
        int maxN = 1;
        int maxM = 1;

        for(int i=0; i<9; i++) {
            arr[i] = br.readLine().split(" ");
            for(int j=0; j<9; j++) {
                if(max < Integer.parseInt(arr[i][j])) {
                    max = Integer.parseInt(arr[i][j]);
                    maxN = i + 1;
                    maxM = j + 1;
                }
            }
        }

        bw.write(max + "\n");
        bw.write(maxN + " " + maxM);
        bw.flush();
    }

}