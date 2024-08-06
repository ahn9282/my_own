package Algorithm.cumulativesum_누적합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj17611_직각다각형 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] x = new int[1000001];
        int[] y = new int[1000001];
        int num = 500000;

        StringTokenizer st = new StringTokenizer(br.readLine());
        int startX = Integer.parseInt(st.nextToken()) + num;
        int startY = Integer.parseInt(st.nextToken()) + num;
        int firstX = startX;
        int firstY = startY;
        for (int i = 1; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int nextX = Integer.parseInt(st.nextToken()) + num;
            int nextY = Integer.parseInt(st.nextToken()) + num;
            if(startX == nextX){
                y[Math.min(startY, nextY)]++;
                y[Math.max(startY, nextY)]--;
            }else{
                x[Math.min(startX, nextX)]++;
                x[Math.max(startX, nextX)]--; 
            }
            startX = nextX;
            startY = nextY;
            
        }
        if(startX == firstX){
            y[Math.min(startY, firstY)]++;
            y[Math.max(startY, firstY)]--;
        }else{
            x[Math.min(startX, firstX)]++;
            x[Math.max(startX, firstX)]--;
        }

        int h = 0;
        int v = 0;
        for (int i = 1; i < 1000001; i++) {
            x[i] += x[i - 1];
            y[i] += y[i - 1];
            v = Math.max(y[i], v);
            h = Math.max(x[i], h);
        }
        System.out.println(Math.max(v,h));
    }
}
