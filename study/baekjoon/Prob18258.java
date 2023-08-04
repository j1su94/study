package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Prob18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        String input = "";

        Queue<Integer> queue = new LinkedList<>();
        String last = "";

        while(n-->0) {
            input = br.readLine();

            if(input.indexOf("push") > -1) {
                queue.add(Integer.parseInt(input.split(" ")[1]));
                last = input.split(" ")[1];
                continue;
            }

            switch(input) {
                case "pop":
                    if(queue.size() > 0) {
                        sb.append(queue.poll()).append("\n");   // queue에 첫번째 값을 반환하고 제거 비어있다면 null
                    } else {
                        sb.append("-1").append("\n");
                    }
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    sb.append((queue.isEmpty() ? "1" : "0")).append("\n");
                    break;
                case "front":
                    if(queue.size() > 0) {
                        sb.append(queue.peek()).append("\n");
                    } else {
                        sb.append("-1").append("\n");
                    }
                    break;
                case "back":
                    if(queue.size() > 0) {
                        sb.append(last).append("\n");
                    } else {
                        sb.append("-1").append("\n");
                    }
                    break;
            }
        }

        System.out.println(sb);
    }
}