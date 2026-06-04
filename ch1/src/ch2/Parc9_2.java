package ch2;
//練習9-2
public class Parc9_2 {
	public static void heal(int hp) {
		hp += 10;
	}
	public static void heal(Parc9_1 thief) {
		thief.hp += 10;
	}
	public static void main(String[] args) {
		int baseHp =25;
		Parc9_1 t = new Parc9_1("アサカ",baseHp);
		heal(baseHp);
		System.out.println(baseHp + " : " + t.hp);
		heal(t);
		System.out.println(baseHp + " : " + t.hp);
	}
}
