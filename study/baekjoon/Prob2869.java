package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Prob2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int able = Integer.parseInt(st.nextToken());
        int slide = Integer.parseInt(st.nextToken());
        int tree = Integer.parseInt(st.nextToken());

        if((tree - able) % (able - slide) != 0) {
            bw.write((tree - able) / (able - slide) + 2 + "");
        } else {
            bw.write((tree - able) / (able - slide) + 1 + "");
        }

        bw.flush();
    }
}