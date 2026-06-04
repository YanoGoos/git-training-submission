package ch2;
//多態性と配列を組み合わせて宿屋に泊まる
public class Main12_7 {

	public static void main(String[] args) {
		Main11_8[] c = new Main11_8[5];
		c[0] = new Main11_3();
		c[1] = new Main11_3();
		c[2] = new Parc9_1(null);
		c[3] = new Main12_2_Wizard();
		c[4] = new Main12_2_Wizard();

	}

}
