package BaekJoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Bj1427 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        int[] arr = new int[str.length()];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str.substring(i, i + 1));
        }

        for (int i = 0; i < n; i++) {
            int max = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[max])
                    max = j;

                }
                if (arr[i] < arr[max]) {
                   int  temp = arr[i];
                    arr[i] = arr[max];
                    arr[max] = temp;
            }
        }
        for (int i1 : arr) {
            System.out.print(i1);
        }
    }
}
