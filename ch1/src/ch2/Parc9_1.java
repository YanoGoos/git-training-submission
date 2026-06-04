package ch2;
//練習9-1
//Thiefクラス
public class Parc9_1 {
	String name;
	int hp;
	int mp;
	
	public Parc9_1(String name,int hp,int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	
	public Parc9_1(String name,int hp) {
		this.name = name;
		this.hp = hp;
		this.mp = 5;
	}
	public Parc9_1(String name) {
		this.name = "アサカ";
		this.hp = 40;
		this.mp = 5;
	}

}
