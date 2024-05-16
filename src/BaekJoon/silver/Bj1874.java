 package BaekJoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

 public class Bj1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Stack<Integer> stack = new Stack<>();
        int num = 1;
        boolean result = true;
        StringBuffer bf = new StringBuffer();
        for (int i = 0; i< arr.length; i++) {
            int seq = arr[i];
            if (seq >= num) {
                while (seq >= num) {
                    stack.push(num++);
                    bf.append("+\n");
                }
                stack.pop();
                bf.append("-\n");
            }else{
                int s = stack.pop();
                if (s > seq) {
                    System.out.println("NO");
                    result = false;
                    break;
                }else{
                    bf.append("-\n");
                }
            }

        }
        if (result == true) {
            System.out.println(bf.toString());
        }
    }
}
