package ch2;

public class Main9_13 {

	public static void main(String[] args) {
		//コンストラクタをオーバーロードしたクラスの利用
		Main8_3 h1 = new Main8_3("ミナト");
		System.out.println(h1.name);
		Main8_3 h2 = new Main8_3();
		System.out.println(h2.name);

	}

}
