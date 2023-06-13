package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Prob7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        /* 참고코드 */
        Map<String, String> map = new HashMap();

        String input;
        for(int i=0;i<n;i++) {
            input = br.readLine();
            map.put(input, i+1+"");
            map.put(i+1+"", input);
        }

        while(m-->0) {
            bw.write(map.get(br.readLine()) + "\n");
        }

        /* 내코드
        Map<Integer, String> map = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        String input;
        int i = 0;
        while(n-->0) {
            input = br.readLine();
            map.put(++i, input);
            map2.put(input, i);
        }

        String s;

        while(m-->0) {
            s = br.readLine();
            if(isInteger(s)) {
                bw.write(map.get(Integer.parseInt(s)) + "\n");
            } else {
                bw.write(map2.get(s) + "\n");
            }
        }
        */

        bw.flush();
    }

    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}