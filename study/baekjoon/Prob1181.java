package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Prob1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        List<String> array = new ArrayList<>();

        String input;
        for(int i=0; i<n; i++) {
            input = br.readLine();
            if(!array.contains(input)) {
                array.add(input);
            }
        }

        Collections.sort(array, String.CASE_INSENSITIVE_ORDER);

        Collections.sort(array, new Comparator<String>() {      // Collections.sort(array, Comparator.comparingInt(String::length));
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        for(int i=0; i<array.size(); i++) {
            bw.write(array.get(i) + "\n");
        }

        bw.flush();
    }
}