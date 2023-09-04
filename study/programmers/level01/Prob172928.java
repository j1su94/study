package programmers.level01;

import java.util.Arrays;
import java.util.StringTokenizer;

class Prob172928 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String[] park = {"SOO", "OOO", "OOO"};
        String[] routes = {"E 2", "S 2", "W 1"};

        System.out.println(Arrays.toString(sol.solution(park, routes)));
    }

    static class Solution {
        public int[] solution(String[] park, String[] routes) {
            String[][] parks = new String[park.length][];
            StringTokenizer st;

            int x = -1, y = -1;

            for(int i=0; i<park.length; i++) {
                if(park[i].indexOf("S") > -1) {
                    x = i;
                    y = park[i].indexOf("S");

                    park[i].replace("S", "O");
                }

                parks[i] = park[i].split("");
            }

            String ewsn = "";
            int cnt = 0;
            int[] arr;

            for(int i=0; i<routes.length; i++) {
                st = new StringTokenizer(routes[i]);

                ewsn = st.nextToken();
                cnt = Integer.parseInt(st.nextToken());

                arr = setXY(ewsn, x, y, cnt, parks);
                x = arr[0];
                y = arr[1];

                System.out.println(Arrays.toString(arr));
            }

            int[] answer = {x, y};

            return answer;
        }

        public int[] setXY(String ewsn, int x, int y, int cnt, String[][] parks) {
            int tmpX = 0, tmpY = 0;

            switch(ewsn) {
                case "E":
                    tmpY += cnt;
                    break;
                case "W":
                    tmpY -= cnt;
                    break;
                case "S":
                    tmpX += cnt;
                    break;
                case "N":
                    tmpX -= cnt;
                    break;
            }

            if(x+tmpX > parks.length-1 || x+tmpX < 0 || y+tmpY > parks[0].length-1 || y+tmpY < 0) {
                return new int[]{x, y};
            }

            int min = Math.min(x, x+tmpX);
            int max = Math.max(x, x+tmpX);

            for(int i=min; i<=max; i++) {
                if("X".equals(parks[i][y])) {
                    return new int[]{x, y};
                }
            }

            min = Math.min(y, y+tmpY);
            max = Math.max(y, y+tmpY);
            for(int i=min; i<=max; i++) {
                if("X".equals(parks[x][i])) {
                    return new int[]{x, y};
                }
            }

            return new int[]{x+tmpX, y+tmpY};
        }
    }
}