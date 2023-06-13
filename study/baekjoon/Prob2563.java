package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Prob2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int count = Integer.parseInt(br.readLine());
        int[][] arr = new int[100][100];
        int result = 0;

        for(int i=0; i<count; i++) {
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken()) - 1;
            int y = Integer.parseInt(st.nextToken()) - 1;

            for(int j=0; j<10; j++) {
                for(int k=0; k<10; k++) {
                    if(arr[j+x][k+y] == 0) {
                        arr[j+x][k+y] = 1;
                        result++;
                    }
                }
            }
        }

        bw.write(result + "");
        bw.flush();
    }
}