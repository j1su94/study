package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Prob5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        /* 참고코드 */
        int[] arr = new int[30];        // 각 배열의 요소 값을 0으로 초기화
        String line = "";

        for(int i=0; i<28; i++) {
            line = br.readLine();
            arr[Integer.parseInt(line) - 1] = 1;
        }

        for(int i=0; i<30; i++){
            if(arr[i] == 0) {
                bw.write(i + 1 + "\n");
            }
        }

        /*
        List<Integer> submitList = new ArrayList<>();       // 제출 학생
        List<Integer> unsubmitList = new ArrayList<>();     // 미제출 학생

        String line = "";

        for(int i=0; i<28; i++) {
            line = br.readLine();
            submitList.add(Integer.parseInt(line));
        }

        for(int j=1; j<=30; j++) {
            if(!submitList.contains(j)) {
                unsubmitList.add(j);
            }
        }

        unsubmitList.sort(null);

        for(int a : unsubmitList) {
            bw.write(a + "\n");
        }
        */
        bw.flush();
    }
}