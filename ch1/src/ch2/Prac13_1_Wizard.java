package ch2;
//練習13-1
public class Prac13_1_Wizard {
	private int hp;
	private int mp;
	private String name;
	private Prac13_1_Wand wand;
	public void heal(Hero h) {
		int basePoint = 10;
		int recovPoint = (int) (basePoint * this.getWand().getPower());
		h.setHp(h.getHp() + recovPoint);
		System.out.println(h.getName() + "のHPを" + recovPoint + "回復した！");
	}
	//練習13-3
	public int getHp() {
		return this.hp;
	}
	public void setHp(int hp) {
		if(hp <= 0) {
			this.hp = 0;
		}else {
			this.hp = hp;
		}
	}
	public int getMp() {
		return this.mp;
	}
	public void setMp(int mp) {
		if(mp < 0) {
			throw new IllegalArgumentException ("MPが少なすぎる。処理を中断。");
		}
		this.mp = mp;
	}
	public String getName() {
		if(name == null) {
			throw new IllegalArgumentException ("名前がnullである。処理を中断。");
		}
		if(name.length() < 3) {
			throw new IllegalArgumentException ("名前が短すぎる。処理を中断。");
		}
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Prac13_1_Wand getWand() {
		return this.wand;
	}
	public void setWand(Prac13_1_Wand wand) {
		if(wand == null) {
			throw new IllegalArgumentException ("杖は必ず装備する。処理を中断。");
		}
		this.wand = wand;
	}

}
