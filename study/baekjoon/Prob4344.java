package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Prob4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int[] arr;

        int count = Integer.parseInt(br.readLine());
        int students;
        int sum;

        double avg;
        int good;

        for(int i=0; i<count; i++) {
            sum = 0;
            good = 0;

            st = new StringTokenizer(br.readLine());
            students = Integer.parseInt(st.nextToken());

            arr = new int[students];

            for(int j=0; j<students; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
                sum += arr[j];
            }

            avg = sum / (double) students;

            for(int j=0; j<students; j++) {
                if(arr[j] > avg) {
                    good++;
                }
            }

            bw.write(String.format("%.3f", (double) good / students * 100) + "%\n");
        }

        bw.flush();
    }
}