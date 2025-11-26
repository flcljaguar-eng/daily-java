package day08.q01;

import day08.q02.Monster;

public class Sorcerer extends Magic{

	public Sorcerer(String name) {
		super(name);
		// TODO 自動生成されたコンストラクター・スタブ
	}
	@Override
	public void attack(int mp, Monster monster) {
		super.attack(mp,monster);
		double burn = mp * 0.5;
		int b = (int)burn;
		System.out.println("追加で"+ b +"のダメージを与えた。");
		
		monster.setHp(monster.getHp() - b);
	}


		
		
		

}
