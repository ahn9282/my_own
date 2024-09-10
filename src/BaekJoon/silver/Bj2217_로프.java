package BaekJoon.silver;

import java.util.Arrays;
import java.util.Scanner;

public class Bj2217_로프 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            arr[i] = a;
        }
        Arrays.sort(arr);
        int answer = 0;
        int count = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            answer = Math.max(arr[i] * count, answer);
            count++;
        }
        System.out.println(answer);
    }
}
