package ch2;
//8-3 中身のないHeroクラスを作成
public class Main8_3 {
	//8-4 Heroクラスに名前とHPを変数として宣言
	String name;
	int hp;
	
	//9-10 コンストラクタで引数を追加情報として受け取る
	public Main8_3(String name) {
		this.hp = 100;
		this.name =name;
	}
	/*
	//9-12 コンストラクタのオーバーロード
	public Main8_3() {
		this.hp = 100;
		this.name ="ダミー";
	}
	*/
	/*
	//9-15 別のコンストラクタを呼び出す(エラー)
	public Main8_3() {
		this.Main8_3("ダミー");
	}
	*/
	/*
	//9-15 別のコンストラクタを呼び出す(エラー)
	public Main8_3() {
		this("ダミー");
	}
	*/
		
	//9-3 Sword型フィールドを持つHeroクラス
	Main9_3 sword;
	public void attack() {
		System.out.println(this.name + "は攻撃した！");
		System.out.println("敵に5ポイントのダメージをあたえた！");
	}
	
	//9-8 生まれた直後の動作を定義したHeroクラス
	public Main8_3() {
		this.hp = 100;
	}

	//8-7「眠る」操作に含まれる要素を記述
	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した！");
	}
	//8-8 メソッド「座る」「転ぶ」「逃げる」を追加
	public void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + "は、" + sec + "秒座った！");
		System.out.println("HPが" + sec +  "ポイント回復した");
	}
	public void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は、転んだ！");
		System.out.println("5のダメージ！");
	}
	public void run() {
		System.out.println(this.name + "は、逃げ出した！");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは" + this.hp + "でした");
	}
}
