package jajava;

public enum CafeMenu {
	COFFE("Coffe", 3500), 
	LATTE("Latte", 4000), 
	CAKE("Cake", 6000), 
	SHAKE("shake", 5500), 
	BREAD("Bread", 7000);
	int cost;
	String name;
	CafeMenu(String name,int cost){
		this.cost = cost;
		this.name = name;
	}
}
