package ch2;
//パーティーが宿屋に止まってHPを回復する
public class Main12_6 {

	public static void main(String[] args) {
		Main8_3 h1 = new Main8_3();
		Main8_3 h2 = new Main8_3();
		//Parc9_1 t1 = new Parc9_1();
		Main12_2_Wizard w1 = new Main12_2_Wizard();
		Main12_2_Wizard w2 = new Main12_2_Wizard();
		h1.hp += 50;
		h2.hp += 50;
		//t1.hp += 50;
		w1.hp += 50;
		w2.hp += 50;

	}

}
