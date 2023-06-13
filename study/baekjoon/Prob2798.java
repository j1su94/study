package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Prob2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[count];

        st = new StringTokenizer(br.readLine());

        for(int i=0; i<count; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = 0;

        for(int i=0; i<count-2; i++) {
            for(int j=i+1; j<count-1; j++) {
                for(int k=j+1; k<count; k++) {
                    if(arr[i] + arr[j] + arr[k] <= m) {
                        max = max > arr[i] + arr[j] + arr[k] ? max : arr[i] + arr[j] + arr[k];
                    }
                }
            }
        }

        bw.write(max + "");
        bw.flush();
    }
}