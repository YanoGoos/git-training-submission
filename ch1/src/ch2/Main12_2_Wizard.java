package ch2;

public class Main12_2_Wizard extends Main12_2_Character{
	int mp;
	public void attack(Main12_5_Monster m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵に3ポイントのダメージ");
		m.hp -= 3;
	}
	public void fireball(Main12_5_Monster m) {
		System.out.println(this.name + "は火の玉を放った！");
		System.out.println("敵に20ポイントのダメージ");
		m.hp -= 20;
		this.mp -= 5;
	}

}
