package ch2;
//練習17-2
public class Prac17_2 {

	public static void main(String[] args) {
	try {
		String s = null;
		System.out.println(s.length());
		
	}catch (NullPointException e) {
		System.out.println("NullPointException例外をcatchしました");
		System.out.println("ーースタックトレース(ここから)ーー");
		e.printStackTrace();
		System.out.println("ーースタックトレース(ここまで)ーー");
	}

	}

}
