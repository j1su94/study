package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Prob41874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();	        // 출력할 결과물 저장

        /*
        출력초과가 나는 이유:
        BufferedWriter 는 내부에 버퍼를 가지고 있으며, 버퍼에 어느 정도 데이터가 차면 비정기적으로 flush 를 실행합니다.
        n이 작은 데이터일 때 NO 를 출력해야 할 때는 flush 를 하기 전에 NO만 출력하고 프로그램이 종료되지만
        n이 충분히 큰 데이터일 때 NO를 출력해야 할 때는 NO를 출력하기 전에 flush 가 발생해서 출력 스트림에 뭔가를 출력해 버립니다.
        */

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        int input;
        int end = 0;        // 무슨 수까지 넣었는지 저장하는 변수

        while(n-->0) {
            input = Integer.parseInt(br.readLine());

            if(end < input) {
                for(int i=end+1; i<=input; i++) {
                    stack.push(i);
                    sb.append('+').append('\n');	// + 를 저장한다.
                }
                end = input;
            } else if(stack.peek() != input) {
                System.out.println("NO");
                break;
            }

            stack.pop();
            sb.append('-').append('\n');
        }

        System.out.println(sb);
    }
}