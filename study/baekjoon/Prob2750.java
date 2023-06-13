package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Prob2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        /*int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        for(int i=0; i<n; i++) {
            bw.write(arr[i] + "\n");
        }
        */


        /* 참고코드 */
		/*
		range : -1000 ~ 1000
		0 은 index[1000] 을 의미
		*/
        boolean[] arr = new boolean[2001];      // 중복되는 수가 없으니 그냥 boolean 배열로

        for(int i=0; i<n; i++) {
            arr[Integer.parseInt(br.readLine()) + 1000] = true;
        }

        // 정렬 과정이 따로 필요 없음
        for(int i = 0; i < 2001; i++) {
            if(arr[i]) {
                bw.write(i - 1000 + "\n");
            }
        }

        bw.flush();
    }
}