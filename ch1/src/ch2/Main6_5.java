package ch2;
//Clacをcalcapp.mainに所属させる
public class Main6_5 {
	public static void main(String[] args) {
		int a = 10; int b = 2;
		int total = Main6_2.tasu(a,b);
		int delta = Main6_2.hiku(a,b);
		System.out.println("足すと" + total + "引くと" + delta);

	}
}
