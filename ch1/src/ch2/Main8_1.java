package ch2;

public class Main8_1 {
	//8-1 mainメソッドを作る
	public static void main(String[] args) {
		//(以下の内容をJavaで記述していく)
		//勇者よ、この仮想世界に生まれよ！
		//お化けキノコよ、この仮想世界に生まれよ！
		//勇者よ、戦え！
		//お化けキノコよ、逃げろ！
		
		//9-4 剣を装備した勇者を生み出す
		Main9_3 s = new Main9_3();
		s.name = "炎の剣";
		s.damage =10;
		
		//8-10「神様のクラス」を作る
		//8-11 勇者インスタンスを生成
		Main8_3 h = new Main8_3() ;
		
		//8-12 勇者インスタンスを生成して初期値を代入
		h.name = "ミナト";
		h.hp = 100;
		
		//9-4 剣を装備した勇者を生み出す
		h.sword =s;
		System.out.println("現在の武器は" + h.sword.name);
		
		//8-16 仮想世界に勇者とお化けキノコ2匹を生み出す
		Main_8_5 m1 = new Main_8_5();
		m1.hp = 50;
		m1.suffix = 'A';
		
		Main_8_5 m2 = new Main_8_5();
		m2.hp = 48;
		m2.suffix = 'B';
		
		h.slip();
		m1.run();
		m2.run();
		h.run();
		/*
		System.out.println("勇者" + h.name + "を生み出しました！");
		//8-13 仮想世界に勇者を生み出すプログラム
		h.sit(5);
		h.slip();
		h.sit(25);
		h.run();
		*/

	}

}
