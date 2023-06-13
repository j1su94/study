package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());            // 배열의 크기
        String[] tmp = br.readLine().split(" ");
        int findValue = Integer.parseInt(br.readLine());    // 배열에서 찾아야하는 수
        int result = 0;

        for(int i=0; i<n; i++) {
            if(Integer.parseInt(tmp[i]) == findValue) {
                result++;
            }
        }

        System.out.println(result);
    }
}