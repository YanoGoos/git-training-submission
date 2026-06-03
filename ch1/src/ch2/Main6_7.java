package ch2;

public class Main6_7 {
	//別のパッケージにあるクラスを呼び出す

	public static void main(String[] args) {
		int a = 10; int b =2;
		int total = ch2.Main6_6.tasu(a,b);
		int delta = ch2.Main6_6.hiku(a,b);
		System.out.println("足すと" + total + "引くと" + delta);

	}

}
