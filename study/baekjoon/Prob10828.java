package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Prob10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String input;

        Stack<Integer> stack = new Stack<>();

        while(n-->0) {
            input = br.readLine();

            if(input.indexOf("push") > -1) {
                stack.push(Integer.parseInt(input.split(" ")[1]));
                continue;
            }

            switch(input) {
                case "pop":
                    if(stack.size() > 0) {
                        bw.write(stack.lastElement() + "\n");
                        stack.pop();
                    } else {
                        bw.write("-1\n");
                    }
                    break;
                case "size":
                    bw.write(stack.size() + "\n");
                    break;
                case "empty":
                    bw.write((stack.isEmpty() ? "1" : "0") + "\n");
                    break;
                case "top":
                    if(stack.size() > 0) {
                        bw.write(stack.lastElement() + "\n");
                    } else {
                        bw.write("-1\n");
                    }
                    break;
            }
        }

        bw.flush();
    }
}