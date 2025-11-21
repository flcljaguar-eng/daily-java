package day06.q02;

/**
 * 預金者クラス
 */
public class Depositor {
	private String name;
	
	public String getName() {
		return name;
	}

	public int getMoney() {
		return money;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	private int money;
	
	public void showData() {
		System.out.println("預金者情報を表示します");
		System.out.println("name:"+ getName());
		System.out.println("money:"+ getMoney());
	}

}
