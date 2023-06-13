package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Prob11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Queue<Integer> queue = new LinkedList<>();

        for(int i=1; i<=n; i++) {
            queue.add(i);
        }

        int i = 1;
        while(queue.size() > 0) {
            if(i % k == 0) {
                sb.append(queue.poll());
                if(queue.size() > 0) {
                    sb.append(", ");
                }
            } else {
                queue.add(queue.poll());
            }

            i++;
        }

        sb.insert(0, "<");
        sb.append(">");
        System.out.println(sb);
    }
}