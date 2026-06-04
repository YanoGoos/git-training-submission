package ch2;
//練習10-3
public class Prac10_3_PoisonMatango extends Prac10_3{
	int poisonCount = 5;
	public Prac10_3_PoisonMatango(char suffix) {
		super(suffix);
	}
	
	public void attack(Main8_3 h) {
		super.attack(h);
		if(poisonCount > 0 ) {
			System.out.println("さらに独の胞子をばらまいた！");
			
			int damage = h.hp / 5;
			h.hp -= damage;
			System.out.println(damage + "のダメージ" );
			poisonCount--;
		}
		
	}

}
