package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Prob10812 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] basket = new int[Integer.parseInt(st.nextToken())];
        int count = Integer.parseInt(st.nextToken());

        int begin;
        int end;
        int mid;

        List<Integer> list = new ArrayList<>();

        for(int i=0; i<basket.length; i++) {
            basket[i] = i+1;
        }

        for(int i=0; i<count; i++) {
            st = new StringTokenizer(br.readLine());
            begin = Integer.parseInt(st.nextToken());
            end = Integer.parseInt(st.nextToken());
            mid = Integer.parseInt(st.nextToken());

            for(int k=0; k<mid-begin; k++) {
                list.add(basket[begin + k - 1]);
            }

            for(int j=0; j<=end-begin; j++) {
                if(j <= end - mid) {
                    basket[begin + j -1] = basket[mid + j -1];
                } else {
                    basket[begin + j -1] = list.get(0);
                    list.remove(0);
                }
            }
        }

        for(int a : basket) {
            bw.write(a + " ");
        }

        bw.flush();
    }
}