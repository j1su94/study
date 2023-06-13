package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Prob4134 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine());
        long input;

        for(int i=0; i<n; i++) {
            input = Long.parseLong(br.readLine());
            while(!isPrime(input)) {
                input++;
            }
            bw.write(input + "\n");
        }

        bw.flush();
    }

    private static boolean isPrime(long num) {      // 소수인지 판별 (√N까지 나눠서 소수를 판별)
        if(num < 2) {
            return false;
        }

        for(int i=2; i<=Math.sqrt(num); i++) {      // 제곱근 함수 : Math.sqrt()
            if(num % i == 0) {
                return false;
            }
        }

        return true;
    }
}