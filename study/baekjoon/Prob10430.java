package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob10430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        String[] b = br.readLine().split("");

        int one = a * Integer.parseInt(b[2]);
        int two = a * Integer.parseInt(b[1]);
        int three = a * Integer.parseInt(b[0]);

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(three * 100 + two * 10 + one);
    }
}