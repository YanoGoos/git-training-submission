package ch2;
//練習17-3
public class Prac17_3 {

	public static void main(String[] args) {
		try {
			int i = Integer.parseInt("三");
		}catch (NumberFormatException e) {
			System.out.println("NumberFormatException例外をcatchしました");
		}

	}

}
