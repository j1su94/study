package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Prob4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Character> stack;

        String input;
        boolean isEnd = false;

        while(!".".equals(input = br.readLine())) {
            stack = new Stack<>();
            isEnd = false;

            for(int i=0; i<input.length(); i++) {
                if(input.charAt(i) == '(' || input.charAt(i) == '[') {
                    stack.push(input.charAt(i));
                } else if(input.charAt(i) == ')') {
                    if(stack.empty() || stack.peek() != '(') {
                        bw.write("no" + "\n");
                        isEnd = true;
                        break;
                    }
                    stack.pop();
                } else if(input.charAt(i) == ']') {
                    if(stack.empty() || stack.peek() != '[') {
                        bw.write("no" + "\n");
                        isEnd = true;
                        break;
                    }
                    stack.pop();
                }
            }

            if(!isEnd) {
                if(stack.size() == 0) {
                    bw.write("yes" + "\n");
                } else {
                    bw.write("no" + "\n");
                }
            }
        }

        bw.flush();
    }
}