package BaekJoon.silver;

import java.io.*;
import java.util.Scanner;

public class Bj1789_수들의합 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        int answer = 0;
        long sum = 0;
        for (int i = 1; i < n; i++) {
           if(sum > n)break;
           sum +=i;
           answer++;
        }
        System.out.println(answer - 1);
        sc.close();
    }
}
