package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Prob10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[Integer.parseInt(st.nextToken())];  // 바구니의 개수
        int count = Integer.parseInt(st.nextToken());           // 바구니 뒤집는 횟수

        int start;
        int end;
        int tmp;

        for(int i=0; i<arr.length; i++) {
            arr[i] = i + 1;
        }

        for(int i=0; i<count; i++) {
            st = new StringTokenizer(br.readLine());
            start = Integer.parseInt(st.nextToken()) - 1;
            end = Integer.parseInt(st.nextToken()) - 1;

            if(start == end) {
                continue;
            }

            for(int j=0; j<((end-start) / 2) + 1; j++) {
                tmp = arr[start + j];
                arr[start + j] = arr[end - j];
                arr[end - j] = tmp;
            }
        }

        for(int i=0; i<arr.length; i++) {
            bw.write(arr[i] + " ");
        }

        bw.flush();
    }
}