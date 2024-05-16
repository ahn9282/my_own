package BaekJoon.silver;

import java.util.Scanner;

public class Bj11720 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        String num2 = sc.next();
        char[] cNum = num2.toCharArray();

        int result = 0;

        for (int i = 0; i < cNum.length; i++) {
           result += cNum[i] - '0';

        }
        System.out.println(result);
    }
}
