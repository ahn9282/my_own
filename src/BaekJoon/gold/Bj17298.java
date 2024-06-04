package BaekJoon.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Bj17298 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
    int[] a= new int[n];
    int[] answer= new int[n];
        String s[] = br.readLine().split(" ");
        for(int i =0; i< n ; i++){
            a[i] = Integer.parseInt(s[i]);
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for(int i=1;i < n;i++){
            while(stack.isEmpty() && a[stack.peek()] < a[i]){
                answer[stack.pop()] = a[i];
            }
            stack.push(i);
        }
    }
}
