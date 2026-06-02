package ch2;

public class Prac3_6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//練習3-6
		System.out.print("【数あてゲーム】");
		int ans = new java.util.Random().nextInt(10);
		for(int i = 0; i < 5; i++) {
			System.out.println("0～9の数字を入力してください");
			int num = new java.util.Scanner(System.in).nextInt();
			if(ans == num) {
				System.out.println("アタリ！");
				break;
			} else {
				System.out.println("違います");
			}
			System.out.println("ゲームを終了します");
		}
		

	}

}
