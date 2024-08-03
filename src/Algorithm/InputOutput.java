package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputOutput {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split("");
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Integer.parseInt(arr[i]);
            System.out.println("arr1 value= " + arr1[i]);
        }

        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        String[] arr2 = br2.readLine().split(" ");
        int[] arr2_2 = new int[arr2.length];
        for (int i = 0; i < arr2_2.length; i++) {
            arr2_2[i] = Integer.parseInt(arr2[i]);
            System.out.println("arr2_2 value= " + arr2_2[i]);

        }
    }
}
