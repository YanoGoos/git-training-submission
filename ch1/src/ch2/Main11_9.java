package ch2;
//抽象メソッドのオーバーライド忘れ(エラー)
//Dancer
public class Main11_9 extends Main11_8{
	public void dance() {
		System.out.println(this.name + "は情熱的に踊った");
	}
	//11-10 抽象メソッドを正しくオーバーライド
	public void attack(Main_8_5 m) {
		System.out.println(this.name + "の攻撃");
		System.out.println("敵に3ポイントのダメージ");
		m.hp -= 3;
	}

}
