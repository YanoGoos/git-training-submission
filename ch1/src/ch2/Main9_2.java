package ch2;

public class Main9_2 {
	//2つのHero型変数を利用する

	public static void main(String[] args) {
		Main8_3 h1;
		
		h1 = new Main8_3();
		h1.hp = 100;
		Main8_3 h2;
		h2 = h1;
		h2.hp =200;
		System.out.println(h1.hp);

	}

}
