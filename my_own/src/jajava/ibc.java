package jajava;

public class ibc {
	static int count = 0;
	class B {
		B() {
			System.out.println("It is B!!" + count);
			count++;
		}
	}

	B field = new B();

	ibc() {
		System.out.println("ibc!!");
		B b = new B();
	}


	public static void main(String[] args) {
		ibc a = new ibc(); // When generate ibc, first B object is generated and ibc's constryctor is started

		ibc.B b = a.new B(); // class B of ibc'class
	}
}
