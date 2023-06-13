package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Prob25192 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        boolean isAble = false;
        String input;
        String s1, s2;

        Set<String> set = new HashSet<>();
        while(n-->0) {
            input = br.readLine();
            st = new StringTokenizer(input);

            s1 = st.nextToken();
            s2 = st.nextToken();

            if(input.indexOf("ChongChong") > -1) {
                set.add(s1);
                set.add(s2);
                isAble = true;
                continue;
            }

            if(isAble) {
                if(set.contains(s1)) {
                    set.add(s2);
                } else if(set.contains(s2)) {
                    set.add(s1);
                }
            }
        }

        bw.write(set.size() + "");
        bw.flush();
    }
}