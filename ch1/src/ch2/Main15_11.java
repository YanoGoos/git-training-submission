package ch2;
//現在日時を表示する
import java.util.Date;

public class Main15_11 {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		System.out.println(now.getTime());
		Date past = new Date(1600705435827L);
		System.out.println(past);

	}

}
