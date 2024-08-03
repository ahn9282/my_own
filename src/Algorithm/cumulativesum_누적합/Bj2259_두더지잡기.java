package Algorithm.cumulativesum_누적합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj2259_두더지잡기 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        double S = Double.parseDouble(st.nextToken());
    int result = 0;
    int fail = 0;
        int nowX = 0;
        int nowY = 0;
        for(int i =0 ; i < N ; i++){
         st = new StringTokenizer(br.readLine());

        int x  =  Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

           double distance = Math.sqrt(Math.pow(Math.abs(x - nowX), 2) + Math.pow(Math.abs(y - nowY), 2));
            long time = Long.parseLong(st.nextToken());
            System.out.print("거리 : " + distance+"를 초당" +S+"의 속도로 " +"현재 위치("+nowX+","+nowY+ ")"+time +"초 내 ");
            if(distance/S <= time) {
                System.out.println("도착");
                result++;
                nowX = x;
                nowY = y;
            }else {
                System.out.println("실패 ");
                fail++;
            }
        }
        System.out.println("success = " + result+", fail = " + fail);
    }
}
