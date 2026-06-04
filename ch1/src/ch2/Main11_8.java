package ch2;
//Characterクラスを作成(未完成)
//11-8 Characterを抽象クラスとして宣言する
public abstract class Main11_8 {
	String name;
	int hp;
	public void run() {
		System.out.println(this + "は逃げ出した");
	}
	//11-2 attackメソッドの中身を空にしておく
	//11-7 attack()を抽象メソッドとして宣言する
	public abstract void attack(Main_8_5 m);//Matango

}
