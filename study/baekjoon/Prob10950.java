package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Prob10950 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());    // 입력받은 데이터
        List<String> list = new ArrayList<>();
        StringTokenizer st;

        for(int i=0; i<count; i++) {
            list.add(br.readLine());
        }

        for(int i=0; i<list.size(); i++) {
            String line = list.get(i);
            st = new StringTokenizer(line);

            System.out.println(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
        }
    }
}