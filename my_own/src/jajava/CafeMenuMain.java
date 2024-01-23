package jajava;

public class CafeMenuMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		select(CafeMenu.BREAD);
		select(CafeMenu.CAKE);
		System.out.println(CafeMenu.SHAKE.cost);
		
	}
public static void select(CafeMenu a) {
	if (CafeMenu.BREAD == a) {
        System.out.println("빵");
    } else if (CafeMenu.COFFE == a) {
        System.out.println("커피");
    } else if (CafeMenu.SHAKE== a) {
        System.out.println("쉐이크");
    } else if (CafeMenu.LATTE == a) {
        System.out.println("라떼");
    } else if (CafeMenu.CAKE == a) {
    	System.out.println("케이크");
    } else {
        System.out.println("존재하지않음");
    }
}
}
