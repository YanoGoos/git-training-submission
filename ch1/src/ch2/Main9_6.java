package ch2;

public class Main9_6 {
	//勇者と魔法使いを生み出す

	public static void main(String[] args) {
		Main8_3 h1 = new Main8_3();
		h1.name = "ミナト"; 
		h1.hp = 100;
		Main8_3 h2 = new Main8_3();
		h2.name = "アサカ"; 
		h2.hp = 100;
		Main9_5 w = new Main9_5();
		w.name = "スガワラ"; 
		w.hp = 50;
		w.heal(h1);
		w.heal(h2);
		w.heal(h2);

	}

}
