package ch2;
//Monsterなら何でも攻撃できるattackメソッド
//Hero
public class Main12_9 extends Main12_2_Character{
	public void attack(Main12_5_Monster m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵に10ポイントのダメージをあたえた！");
		m.hp -=10;
	}
	

}
