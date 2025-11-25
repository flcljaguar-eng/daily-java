package day07.q01;

public class Drink {
	int price;
	String name;
	
	public Drink(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}

	public Drink() {
		super();
		price = 120;
		name = "ビタミン麦茶";
	}
	
	public void show() {
		System.out.println(name +":"+ price +"です");
	}

}
