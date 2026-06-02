package ch2;

public class Main3_9 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//for文のループを２重にして九九の表を出力する
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.print(i * j);
				System.out.print(" ");
			}
			System.out.println("");
		}

	}

}
