package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Prob1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        Queue<Integer> que = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());
        int cnt, ord;
        String input;


        while(n-->0) {
            st = new StringTokenizer(br.readLine());
            cnt = Integer.parseInt(st.nextToken());         // 문서의 개수
            ord = Integer.parseInt(st.nextToken());         // 궁금한 문서가 Queue에서 몇 번째에 놓여 있는지

            input = br.readLine();
            st = new StringTokenizer(input);
            for(int i=0; i<cnt; i++) {
                que.add(Integer.parseInt(st.nextToken()));
            }
        }

        sb.insert(0, "<");
        sb.append(">");
        System.out.println(sb);
    }
}