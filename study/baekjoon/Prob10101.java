package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Prob10101 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        /* 참고코드 */
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        bw.write(a + b + c != 180 ? "Error" : a==b && b==c ? "Equilateral" : a == b || b == c || c == a ? "Isosceles" : "Scalene");

        /* 내코드
        int sum = 0;
        String input;
        Map<String, Integer> map = new HashMap<>();

        for(int i=0; i<3; i++) {
            input = br.readLine();
            sum += Integer.parseInt(input);
            map.put(input, 1);
        }

        if(sum != 180) {
            bw.write("error");
        } else if(map.size() == 3) {
            bw.write("Scalene");
        } else if(map.size() == 2) {
            bw.write("Isosceles");
        } else {
            bw.write("Equilateral");
        }*/

        bw.flush();
    }
}