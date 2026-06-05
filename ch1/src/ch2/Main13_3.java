package ch2;
//「王様クラス」の不具合
//King
public class Main13_3 {
	//13-7　王様クラスで利用されるnameフィールド
	void talk(Main13_1 h) {
		System.out.println("王様：ようこそ我が国へ、勇者" + h.getName() + "よ。");
		System.out.println("王様：長旅疲れたであろう。");
		System.out.println("王様：まずは城下を見てくるとよい。ではまた会おう。");
		h.bye();
		
	}

}
