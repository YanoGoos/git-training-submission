package ch2;
//「戦う」と「逃げる」しかできないHeroクラス
public class Main10_1 {
	String name ="ミナト";
	int hp = 100;
	
	public void attack(Main_8_5 m) {
		System.out.println(this.name + "の攻撃！");
		m.hp -= 5;
		System.out.println("5ポイントのダメージをあたえた！");
	}
	
	//10-7 slip()はオーバーライドできないHeroクラス
	public final void slip() {
		this.hp -= 5;
		System.out.println(this.name +  "は転んだ！");
		System.out.println("5のダメージ");
	}
	
	public void run() {
		System.out.println(this.name +  "は逃げ出した！");
	}
	
	//10-10　コンストラクタの動作を確認する
	public Main10_1(){
		System.out.println("Main10_1のコンストラクタが動作");
	}

}
