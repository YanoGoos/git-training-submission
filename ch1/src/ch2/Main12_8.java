package ch2;
//攻撃する相手ごとにattack()を作成
public class Main12_8 extends Main12_2_Character{
	public void attack(Main_8_5 m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵に10ポイントのダメージをあたえた！");
		m.hp -= 10;
	}
	public void attack(Goblin g) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵に10ポイントのダメージをあたえた！");
		g.hp -= 10;
	}

}
