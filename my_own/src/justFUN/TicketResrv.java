package justFUN;

import java.util.Scanner;

public class TicketResrv {
	// center : index[][1], index[][2] price + : $50
	// front : index[0][] price + : $70, index[1][] price + : $40
	// base price : $150
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] ticket = new int[4][5];
		int price = 150;
		Scanner sc = new Scanner(System.in);
		System.out.print("Which row do you select? : ");
		int row = sc.nextInt();
		System.out.print("Which column do you select? : ");
		int column = sc.nextInt();
		System.out.println("you choose a seats in " + row + " rows and " + column + " rows? ");
		for(int i =0; i<ticket.length;i++) {
			for(int j = 0; j <ticket[i].length;j++) {
				ticket[i][j] = 150;
				if(j==1 && j==2) {ticket[i][j] += 50;}
				if(i==0) {
					ticket[i][j] += 70;
				}else if(i==1) {
					ticket[i][j] += 40;
				}
			}
		}
		
		System.out.println("You have to pay: $" + ticket[row-1][column-1]);
	}
}
