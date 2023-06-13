package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Prob10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());    // 가지고 있는 카드 수
        String[] cards = br.readLine().split(" ");  // 가지고 있는 카드
        int m = Integer.parseInt(br.readLine());    // 가지고 있는지 확인해야 할 카드 수
        String[] check = br.readLine().split(" ");  // 가지고 있는지 확인해야 할 카드

        int[] arr = new int[20000001];

        for(int i=0; i<n; i++) {
            arr[Integer.parseInt(cards[i]) + 10000000] = 1;
        }

        for(int i=0; i<m; i++) {
            if(arr[Integer.parseInt(check[i]) + 10000000] == 1) {
                bw.write("1 ");
            } else {
                bw.write("0 ");
            }
        }

        bw.flush();
    }
}