package ch2;

public class Prac5_3 {
	//練習5-3
	public static void email(String adress,String text) {
		System.out.println(adress + "に、以下のメールを送信しました");
		System.out.println("件名:無題");
		System.out.println("本文:" + text);
	}
	public static void email(String title,String adress,String text) {
		System.out.println(adress + "に、以下のメールを送信しました");
		System.out.println("件名:" + title);
		System.out.println("本文:" + text);
	}

	public static void main(String[] args) {

		String adress = "メールの宛先アドレス";
		String text = "メールの宛先アドレス";
		email(adress,text);
	}

}
