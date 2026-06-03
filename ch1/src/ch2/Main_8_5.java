package ch2;
//8-5 フィールドを宣言すると同時に初期値も設定
public class Main_8_5 {
	int hp;
	//8-6 フィールドを定数として宣言
	final int LEVEL = 10;
	//8-15 お化けキノコクラスの定義
	char suffix;
	public void run() {
		System.out.println("お化けキノコ" + this.suffix + "は逃げ出した！");
	}

}
