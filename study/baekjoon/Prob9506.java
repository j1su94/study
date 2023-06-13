package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Prob9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input;
        int tmp;
        int arr[];
        String line;

        while(!"-1".equals((line = br.readLine()))) {
            input = Integer.parseInt(line);
            arr = new int[input];
            tmp = 0;

            for(int i=1, j=0; i<input; i++) {
                if(input % i == 0) {
                    tmp += i;
                    arr[j++] = i;
                }
            }

            if(tmp == input) {
                bw.write(input + " = ");
                for(int i=0; i<arr.length; i++) {
                    if(arr[i] > 0) {
                        bw.write(arr[i] + "");
                    } else {
                        break;
                    }

                    if(arr[i + 1] > 0) {
                        bw.write(" + ");
                    }
                }
            } else {
                bw.write(input + " is NOT perfect.");
            }

            bw.write("\n");
        }


        bw.flush();
    }
}