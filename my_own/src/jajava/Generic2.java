package jajava;

public class Generic2 {

	public static void main(String[] args) {
		Product<TV, String> product1 = new Product<>();
		
		product1.setKind(new TV());
		product1.setmodel("스마트 TV");
		
		TV tv = product1.getKind();
		String tvModel = product1.getmodel();
		System.out.println(product1.getKind() + " " + product1.getmodel() + " " );
	}}
class TV{
	
}
class Car{
	
}
class Product<TV, Car>{
	private TV kind;
	private Car model;
	Product(){}
	public TV setKind(TV kind) {
		return this.kind;
	}
	public TV getKind() {
		return this.kind;
	}
	public Car getmodel() {
		return this.model;
	}
	public Car setmodel(String model) {
		return this.model;
	}
}
