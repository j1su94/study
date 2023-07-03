package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Prob1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int total = n + m;

        /* 참고코드 */
        Map<Integer, Boolean> map = new HashMap<>();

        st = new StringTokenizer(br.readLine());
        while(n-->0) {
            map.put(Integer.parseInt(st.nextToken()), true);
        }

        st = new StringTokenizer(br.readLine());
        while(m-->0) {
            map.put(Integer.parseInt(st.nextToken()), true);
        }

        // map.size() -> 합집합 개수이므로
        // total - map.size() 이렇게하면 교집합의 개수고
        // 합집한 개수 - 교집합 개수 = 대칭 차집합의 개수
        // map.size() - (total - map.size())
        // bw.write(map.size() - (total - map.size()) + ""); 이니까 아래처럼 된것
        bw.write(map.size() * 2 - total + "");




        /* 내코드
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        while(n-->0) {
            set1.add(Integer.parseInt(st.nextToken()));
        }
        Set<Integer> tmp1 = new HashSet<>(set1);

        st = new StringTokenizer(br.readLine());
        while(m-->0) {
            set2.add(Integer.parseInt(st.nextToken()));
        }
        Set<Integer> tmp2 = new HashSet<>(set2);

        tmp1.removeAll(tmp2);
        set2.removeAll(set1);

        bw.write(tmp1.size() + set2.size() + "");
        */

        bw.flush();
    }
}