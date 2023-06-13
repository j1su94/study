package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Prob14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int result = 0;

        /*
        List<String> list = new ArrayList<>();

        while(n-->0) {  // n--; n>0; 줄여서 이렇게 씀
            list.add(br.readLine());
        }

        while(m-->0) {
            if(list.contains(br.readLine())) {
                result++;
            }
        }
        */

        Set<String> set = new HashSet<>();
        while(n-->0) {
            set.add(br.readLine());
        }
        while(m-->0) {
            result += set.contains(br.readLine()) ? 1 : 0;
        }

        bw.write(result + "");
        bw.flush();
    }
}