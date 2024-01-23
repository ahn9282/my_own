package jajava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CafeOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean open = true;
		while (open) {
			int[] arr = new int[5];
			CafeMenu[] arrP = { CafeMenu.COFFE, CafeMenu.LATTE, CafeMenu.SHAKE, CafeMenu.CAKE, CafeMenu.BREAD };
			int sum = 0;
			int totalPrice = 0;
			try {
				System.out.println("Please select menu and quantity  ");
				System.out.print("1.Coffe : ");
				arr[0] = sc.nextInt();
				System.out.print("2. Latte : ");
				arr[1] = sc.nextInt();
				System.out.print("3. Shake : ");
				arr[2] = sc.nextInt();
				System.out.print("4. Cake : ");
				arr[3] = sc.nextInt();
				System.out.print("5.Bread : ");
				arr[4] = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Please, Insert only number");
				break;
			}
			System.out.print("You order ");
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > 0) {
					System.out.print(arrP[i].name + " " + arr[i] + " ");
					}
			}System.out.println();
			System.out.println("Cost :");
			for(int i =0; i <arr.length;i++) {
				if (arr[i] > 0) {
				System.out.print(arr[i] * arrP[i].cost +  " ");
				
				  sum += arr[i] * arrP[i].cost;}
			}System.out.println();
				
			
			System.out.println("Total cost is " + sum);
			System.out.println("TANK YOU!!");
			System.out.println();
		}
	}
}
