
public class e10117 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[4][3];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = (int) (Math.random() * 100) + 1;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		int num =9;
		for (int i = 1; i <= num; i++) {
			for (int j = (num-i); j >= 0; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (2 * i )- 1; j++) {

				System.out.print("*");
			}
			System.out.println();
		}
	}
}
