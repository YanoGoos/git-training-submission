package ch2;
//Wizardクラスを通常の方法でインスタンス化
public class Main12_3 {
	public static void main(String[] args) {
		Main12_2_Wizard w = new Main12_2_Wizard();
		
		//12-4 Wizardにfireballを使わせる(エラー)
		//Character c = w;
		
		Main_8_5 m = new Main_8_5();
		//w.name "アサカ";
		w.attack(m);
		w.fireball(m);
		
	}

}
