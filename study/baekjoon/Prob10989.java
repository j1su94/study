package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Prob10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        /* 참고코드 - 카운팅정렬 (계수정렬) */
        /* https://st-lab.tistory.com/107 */

        int[] counting = new int[10001];        // 수의 범위가 10000보다 작거나 같은 자연수 (1 ~ 10000) 사실상 0은 제외

        for(int i=0; i<n; i++) {                // 입력받은 값을 index 로 하는 counting 배열 값 1 증가  -> i=1일 때, counting[5]의 값 ++
            counting[Integer.parseInt(br.readLine())]++;    // 각 수의 개수를 세는 과정       -> {0, 2, 2, 2, 1, 2, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0,...}
        }

        int cnt = 0;

        // 0은 입력범위에서 없으므로 1부터 시작
        for(int i=1; i<10001; i++) {
            // i 값이 개수가 0 이 될 때 까지 출력 (빈도수를 의미)
            while(counting[i] > 0){
                bw.write(i + "\n");
                counting[i]--;
                cnt++;
            }

            if(cnt == n) {
                break;
            }
        }

        bw.flush();
    }
}