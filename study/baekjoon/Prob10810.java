package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Prob10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[Integer.parseInt(st.nextToken())];  // 바구니의 개수
        int count = Integer.parseInt(st.nextToken());           // 공을 넣고 빼는 횟수

        int start = 0;
        int end = 0;
        int num = 0;

        for(int i=0; i<count; i++) {
            st = new StringTokenizer(br.readLine());
            start = Integer.parseInt(st.nextToken()) - 1;
            end = Integer.parseInt(st.nextToken()) - 1;
            num = Integer.parseInt(st.nextToken());

            for(int j=start; j<=end; j++) {
                arr[j] = num;
            }
        }

        for(int i=0; i<arr.length; i++) {
            bw.write(arr[i] + " ");
        }

        bw.flush();
    }
}