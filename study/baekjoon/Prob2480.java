package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Prob2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();                        // 입력받은 데이터

        /* 참고코드 */
        StringTokenizer st = new StringTokenizer(line);
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int result;

        if(a==b && b==c) {                      // 세 수가 같을 때
            result = 10000 + a * 1000;
        } else if(a==b || b==c) {
            result = 1000 + b * 100;
        } else if(c==a) {
            result = 1000 + c * 100;
        } else {
            result = Math.max(Math.max(a, b), c) * 100;
        }

        System.out.println(result);

        /* 내코드
        StringTokenizer st = new StringTokenizer(line);

        List<Integer> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        int a;
        map.put("max", 0);

        while(st.hasMoreTokens()) {
            a = Integer.parseInt(st.nextToken());
            if(!list.contains(a)) {
                list.add(a);
                if(map.get("max") < a) {
                    map.put("max", a);
                }
            } else {
                map.put("dupl", a);
            }
        }

        switch (list.size()) {
            case 1:
                System.out.println(10000 + map.get("dupl") * 1000);
                break;
            case 2:
                System.out.println(1000 + map.get("dupl") * 100);
                break;
            case 3:
                System.out.println(map.get("max") * 100);
                break;
        }*/
    }


}