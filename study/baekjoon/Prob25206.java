package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Prob25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        Double total = 0.0;
        Double result = 0.0;

        for(int i=0; i<20; i++) {
            st = new StringTokenizer(br.readLine());
            String subject = st.nextToken();
            Double rating = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            total += !"P".equals(grade) ? rating : 0;
            result += getSum(subject, rating, grade);
        }

        
        bw.write(result / total + "");
        bw.flush();
    }

    public static Double getSum(String subject, Double rating, String grade) {
        Double result = 0.0;

        switch(grade) {
            case "A+":
                result += rating * 4.5;
                break;
            case "A0":
                result += rating * 4.0;
                break;
            case "B+":
                result += rating * 3.5;
                break;
            case "B0":
                result += rating * 3.0;
                break;
            case "C+":
                result += rating * 2.5;
                break;
            case "C0":
                result += rating * 2.0;
                break;
            case "D+":
                result += rating * 1.5;
                break;
            case "D0":
                result += rating * 1.0;
                break;
        }

        return result;
    }
}