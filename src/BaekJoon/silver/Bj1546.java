package BaekJoon.silver;

import java.util.Scanner;

public class Bj1546 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr=new int[num];

        for(int i=0 ; i < num;i++){
            arr[i] = sc.nextInt();
        }
       long sum = 0;
        long max=0;
        for(int i=0 ; i < num;i++){
            if(arr[i]>max) max = arr[i];
            sum +=arr[i];
        }

        System.out.println(sum*100.0/num/max);

    }
}
