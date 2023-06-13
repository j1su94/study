package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Prob2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int input;
        int sum = 0;
        int[] arr = new int[n];

        Map<Integer, Integer> map = new TreeMap<>();

        for(int i=0; i<n; i++) {
            input = Integer.parseInt(br.readLine());

            arr[i] = input;
            map.put(input, map.getOrDefault(input, 0) + 1);
            sum += input;
        }


        Arrays.sort(arr);

        List<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(map.entrySet());
        entryList.sort(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });

        List<Integer> list = new ArrayList<>(map.keySet());

        bw.write(Math.round((double) sum / n) + "\n");
        bw.write(arr[n/2] + "\n");
        if(map.size() > 1 && (entryList.get(0).getValue() == entryList.get(1).getValue())) {
            bw.write(entryList.get(1).getKey() + "\n");
        } else {
            bw.write(entryList.get(0).getKey() + "\n");
        }
        bw.write(list.get(list.size()-1) - list.get(0) + "\n");

        bw.flush();
    }
}