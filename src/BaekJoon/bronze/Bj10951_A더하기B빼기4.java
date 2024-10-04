package BaekJoon.bronze;

import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Bj10951_A더하기B빼기4 {
    private static StringTokenizer st;
    private static String str;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();

            if (str.isEmpty())  break;

            String[] arr = str.split(" ");

            int A = Integer.parseInt(arr[0]);
            int B = Integer.parseInt(arr[1]);
            System.out.println(A + B);
        }

        sc.close();
    }
}
