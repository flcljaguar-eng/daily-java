package day08.q02;

public class Monster {
	private String name;
	private int hp;
	
	public Monster(String name, int hp) {
		super();
		this.name = name;
		this.hp = hp;
		System.out.println(name + "が現れた！！");
		toString();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	@Override
	public String toString() {
		return "Monster [name=" + name + ", hp=" + hp + "]";
	}


}	
