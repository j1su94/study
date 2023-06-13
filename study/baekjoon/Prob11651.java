package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Prob11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[][] result = new int[n][2];

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            result[i][0] = Integer.parseInt(st.nextToken());
            result[i][1] = Integer.parseInt(st.nextToken());
        }

        /* 참고코드 */
        Arrays.sort(result, new Comparator<int[]>() {
            // Override된 compare 함수를 어떻게 정의하냐에 따라서 다양한 정렬이 가능
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] != o2[1]) {            // 내림자순 정렬을 하고 싶다면 o2와 o1의 위치를 바꿔준다 // return o2[0] - o1[0];
                    return o1[1] - o2[1];
                }
                return o1[0] - o2[0];
            }
        });

        for(int i=0; i<n; i++) {
            bw.write(result[i][0] + " " + result[i][1] + "\n");
        }

        bw.flush();
    }
}