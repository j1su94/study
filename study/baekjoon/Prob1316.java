package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Prob1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        String input = "";
        int gw = 0;

        /* 내코드
        int chk;
        boolean ok = false;
        char c;
        int[] arr;

        for(int i=0; i<count; i++) {
            input = br.readLine();
            arr = new int[26];
            chk = 0;
            for(int j=0; j<input.length(); j++) {
                arr[input.charAt(j) - 97] = arr[input.charAt(j) - 97] + 1;
            }

            for(int j=0; j<arr.length; j++) {
                if(arr[j] > 1) {
                    c = (char) (j + 97);
                    String tmp1 = input.substring(input.indexOf(String.valueOf(c)), input.indexOf(String.valueOf(c)) + arr[j]);
                    String tmp2 = "";

                    for(int k=0; k<arr[j]; k++) {
                        tmp2 += c;
                    }

                    if(!tmp1.equals(tmp2)) {
                        ok = false;
                        break;
                    } else {
                        ok = true;
                    }
                } else {
                    chk += arr[j];
                }
            }

            if(chk == input.length() || ok) {
                gw++;
            }
        }
        */

        /* 참고코드 */
        for (int i = 0; i < count; i++) {
            input = br.readLine();
            boolean check[] = new boolean[26];                  // 알파벳 사용 내역
            boolean tmp = true;                                 // 그룹 단어 인지

            for (int j = 0; j < input.length(); j++) {
                int index = input.charAt(j) - 'a';
                if(check[index]) {                              // 이전에 사용한적이 있는 문자라면
                    if(input.charAt(j) != input.charAt(j-1)) {  // 이전 문자와 연속되지 않는다면
                        tmp = false;                            // 그룹 단어가 아님
                        break;
                    }
                } else {                                        // 이전에 사용한적이 없는 문자라면
                    check[index] = true;                        // 문자 사용 체크
                }
            }

            if(tmp) {
                gw++;
            }
        }

        bw.write(gw + "");
        bw.flush();
    }
}