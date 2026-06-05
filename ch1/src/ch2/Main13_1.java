package ch2;
//アクセス制限されていないHeroクラス
public class Main13_1 {
	//13-4 hpフィールドをprivateにｓたHeroクラス
	private int hp;
	private String name;
	private Main13_1_Sword sword;
	
	//13-8 HeroクラスにgetNameメソッドを追加
	public String getName() {
		return this.name;
	}
	
	//13-10 Heroクラスにsetterメソッドを追加
	//13-13 setterメソッドの中で値の妥当性をチェックする
	public void setName(String name) {
		if(name == null) {
			throw new IllegalArgumentException ("名前がnullである。処理を中断。");
		}
		if(name.length() <= 1) {
			throw new IllegalArgumentException ("名前が短すぎる。処理を中断。");
		}
		if(name.length() >= 8) {
			throw new IllegalArgumentException ("名前が長すぎる。処理を中断。");
		}
		this.name = name;
	}
	
	public void bye() {
		System.out.println("勇者は別れを告げた");
	}
	//13-5 dieメソッドをprivateとして指定する
	private void die() {
		System.out.println(this.name + "は死んでしまった！");
		System.out.println("GAME ORVERです。");
	}
	//13-6　attackメソッドはpublicとして指定する
	void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は眠って回復した！");
	}
	//13-6　attackメソッドはpublicとして指定する
	public void attack(Main13_1_Matango m) {
		System.out.println(this.name+ "の攻撃！");
		System.out.println("お化けキノコ" + m.suffix + "から2ポイントの反撃を受けた");
		this.hp -= 2;
		
		if(this.hp <= 0) {
			this.die();
		}
	}

}
