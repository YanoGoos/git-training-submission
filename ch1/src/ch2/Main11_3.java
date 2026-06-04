package ch2;
//未来の開発者が作成するHeroクラス
//11-4 オーバーライドを忘れたHeroクラス
public class Main11_3 extends Main11_8{
	public void attack(Main_8_5 m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵に10ポイントのダメージをあたえた！");
		m.hp -=10;
	}

}
