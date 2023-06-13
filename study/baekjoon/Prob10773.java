package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Prob10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int input;

        Stack<Integer> stack = new Stack<>();

        while(n-->0) {
            input = Integer.parseInt(br.readLine());

            if(input > 0) {
                stack.push(input);
            } else {
                stack.pop();
            }
        }

        int result = 0;
        for(int i : stack) {
            result += i;
        }

        bw.write(result + "");
        bw.flush();
    }
}