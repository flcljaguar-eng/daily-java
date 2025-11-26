package day07.q02;

public class Member {
	private int id;
	private String name;
	
	/*
	 * コンストラクタ
	 * 
	 * @param id
	 * @param name
	 */
	public Member(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public void show() {
		System.out.println(id+"*"+name);
	}
}
