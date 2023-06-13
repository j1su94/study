package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Prob2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int input = Integer.parseInt(st.nextToken());
        int index = Integer.parseInt(st.nextToken());

        /* 참고코드 */
        int arr[] = new int[input];

        for(int i=1, j=0; i<=input; i++) {
            if(input % i == 0) {
                arr[j++] = i;
            }
        }

        bw.write(arr[index - 1] + "");

        /* 내코드
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(input);

        for(int i=2; i<=input; i++) {
            if(!list.contains(i)) {
                getDiv(input, i, list);
            } else {
                break;
            }
        }

        list.sort(null);

        if(list.size() < index) {
            bw.write("0");
        } else {
            bw.write(list.get(index - 1) + "");
        }*/

        bw.flush();
    }

    /* 내코드
    public static void getDiv(int input, int tmp, List<Integer> list) {
        if(input % tmp == 0 && !list.contains(tmp)) {
            list.add(tmp);
        }

        while(input % tmp == 0) {
            input = input / tmp;
        }
    }
    */
}