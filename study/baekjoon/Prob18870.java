package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Prob18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();
        String[] arr = input.split(" ");
        String[] res = arr.clone();

        Map<Integer, Integer> map = new LinkedHashMap<>();

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.parseInt(o1) - Integer.parseInt(o2);
            }
        });

        int tmp = -1;
        for(int i=0; i<arr.length; i++) {
            if(map.get(Integer.parseInt(arr[i])) == null) {
                tmp++;
            }
            map.put(Integer.parseInt(arr[i]), tmp);
        }

        for(int i=0; i<res.length; i++) {
            bw.write(map.get(Integer.parseInt(res[i])) + " ");
        }

        bw.flush();
    }
}