package ch2;
//Heroクラスを継承してSuperHeroを作成する
public class Main10_3 extends Main10_1 {
	boolean flying;
	
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった！");
	}
	public void land() {
		this.flying = false;
		System.out.println("着地した！");
	}
	
	//10-5 SuperHeroクラスにrun()を再定義する
	public void run() {
		System.out.println(this.name +  "は撤退した！");
	}/*
	//10-8 attacka()をオーバーライドしたSuperHero
	public void attack(Main_8_5 m) {
		System.out.println(this.name +  "の攻撃！");
		m.hp -= 5;
		System.out.println("5ポイントのダメージをあたえた！");
		if(this.flying) {
			System.out.println(this.name +  "の攻撃！");
			m.hp -= 5;
			System.out.println("5ポイントのダメージをあたえた！");
		}
	}
	*/
	//10-9 親クラスのattackを呼び出す
	public void attack(Main_8_5 m) {
		super.attack(m);
		
		if(this.flying) {
			super.attack(m);
		}
	}
	
	//10-10　コンストラクタの動作を確認する
	public Main10_3() {
		System.out.println("Main10_3のコンストラクタが動作");
	}

}
