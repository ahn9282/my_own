package jajava;

public class Generic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Box<String> box = new Box<>();
box.content = "String";
String str = box.content;
System.out.println(box.content);

Box<Integer> box2 = new Box<>();
box2.content = 123;
Integer c = box2.content;
System.out.println(c);

	}

}
class Box<T>{
	public T content;
}
