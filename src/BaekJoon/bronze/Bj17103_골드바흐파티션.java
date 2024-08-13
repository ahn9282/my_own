package BaekJoon.bronze;

import java.io.*;

public class Bj17103_골드바흐파티션 {
    static boolean[] arr = new boolean[1000001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        arr[2] = true;
        arr[3] = true;
        arr[5] = true;
        arr[7] = true;
        arr[11] = true;
        arr[13] = true;
        for (int i = 0; i < N; i++) {
            int now = Integer.parseInt(br.readLine());
            int mid = now / 2;
            if (mid % 2 == 0) mid++;
            int count = 0;
            for (int j = mid; j < now - 1; j += 2) {
                if (qasd(j)) {
                    int q = now - j;
                    if (qasd(q)) count++;
                }
            }
            bw.write(count + "\n");
        }
        br.close();
        bw.flush();
        bw.close();

    }

    public static boolean qasd(int num) {
        if(arr[num])return true;
        if (num == 2 || num == 3) return true;
        if (num == 1) return false;
        if (num % 2 == 0 || num % 3 == 0) return false;
        for (int i = 5; i * i <= num; i += 2) {
            if (num % i == 0) return false;
        }
        arr[num] = true;
        return true;
    }
}
