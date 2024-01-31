package jajava;

public class CountMeasure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] number = {6,25,36,29,120};
	int[] arr= new int[number.length];
	for(int j=0 ; j < number.length;j++) {
		int cnt = 0;
	for(int i=1; i*i <= number[j]; i++) {
		if(i*i ==number[j])cnt++;
		else if(number[j] % i ==0)cnt+=2;
	}
	arr[j] =cnt;
	}
		for(int i=0;i<arr.length;i++) {
			System.out.println(number[i] + " : " + arr[i]);
		}
	}

}
