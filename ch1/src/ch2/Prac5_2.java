package ch2;

public class Prac5_2 {
	//練習5-2
	public static void email(String title,String addlress,String text) {
	
		System.out.println(addlress + "に、以下のメールを送信しました");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
	}

	public static void main(String[] args) {
		String title = "メールのタイトル";
		String addlress ="メールの宛先アドレス";
		String text = "メールの本文";
		email(title,addlress,text);

	}

}
