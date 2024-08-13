package BaekJoon.bronze;

import java.io.*;

public class Bj4948_베르트랑공준 {
    public static boolean[] arr = new boolean[3000000];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        arr[2] = true;
        arr[3] = true;
        while(true){
            int now = Integer.parseInt(br.readLine());

            if(now == 0)break;
            int count = 0;
            for (int i = now + 1; i <= now * 2; i++) {
                if(primeP(i)){
                    count++;
                }
            }
            bw.write(count + "\n");

        }
        br.close();
        bw.flush();
        bw.close();
    }

    public static boolean primeP(int num) {
        if(arr[num]) return true;
        if(num ==2 || num == 3) return true;
        if(num %2 == 0 || num %3 == 0) return false;
        if(num == 1) return false;
        for (int i = 5; i * i <= num; i += 2) {
            if(num % i ==0) return false;
        }
        arr[num] = true;
        return true;
    }
}
