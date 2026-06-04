package ch2;
//練習10-3
public class Prac10_3 {
	int hp = 50;
	char suffix;
	public Prac10_3(char suffix) {
		this.suffix = suffix;
	}
	public void attack(Main8_3 h) {
		System.out.println("キノコ" + this.suffix + "の攻撃");
		System.out.println("10のダメージ" );
		h.hp -= 10;
	}

}
