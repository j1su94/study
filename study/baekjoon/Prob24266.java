package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Prob24266 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		/**
		 * 시간복잡도
         * https://blog.chulgil.me/algorithm/
         *
         * 하나의 루프를 사용하여 단일 요소 집합을 반복 하는 경우 : O (n)
         * 컬렉션의 절반 이상 을 반복 하는 경우 : O (n / 2) -> O (n)
         * 두 개의 다른 루프를 사용하여 두 개의 개별 콜렉션을 반복 할 경우 : O (n + m) -> O (n)
         * 두 개의 중첩 루프를 사용하여 단일 컬렉션을 반복하는 경우 : O (n²)
         * 두 개의 중첩 루프를 사용하여 두 개의 다른 콜렉션을 반복 할 경우 : O (n * m) -> O (n²)
         * 컬렉션 정렬을 사용하는 경우 : O(n*log(n))
         */

        Long n = Long.parseLong(br.readLine());

        bw.write(n * n * n + "\n" + 3);
        bw.flush();
    }
}