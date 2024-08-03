package Algorithm.cumulativesum_누적합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj17611_직각다각형 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Coord[] arr = new Coord[n + 1];
        for (int i = 0; i < n; i++) {
        StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i] = new Coord(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }
        arr[n] = arr[0];
        for (Coord coord : arr) {
            System.out.println("coord = " + coord);
        }
        int h = 0;
        int v = 0;
        Coord start = arr[0];
        if (start.x == 0) {
            h ++;
        }
        if (start.y == 0) {
            v++;
        }
        for (int i = 0; i < n; i++) {
            Coord now = arr[i];
            Coord next = arr[i + 1];
            if (now.x == next.x) {
                if(Math.abs(now.y-next.y) >= Math.abs(now.y)) v++;
            }
            if(now.y == next.y) {
                if(Math.abs(now.x-next.x) >= Math.abs(now.x)) h++;
            }
        }
        System.out.println("v = " + v +", h = " + h);
        System.out.println(Math.max(v,h));

    }

    public static class Coord {
        public int x=0;
        public int y=0;
        public Coord(int x, int y) {
            this.x = x;
            this.y = y;
        }
        @Override
        public String toString(){
            return "[ x : " + x + ", y : " + y + "]";
        }
    }
}
