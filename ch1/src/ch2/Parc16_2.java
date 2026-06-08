package ch2;
//練習16-2
import java.util.ArrayList;
import java.util.List;
public class Parc16_2 {

	public static void main(String[] args) {
		Prac16_2_Hero h1 = new Prac16_2_Hero("斎藤");
		Prac16_2_Hero h2 = new Prac16_2_Hero("鈴木");
		List<Prac16_2_Hero> list = new ArrayList<Prac16_2_Hero>();
		list.add(h1);
		list.add(h2);
		for(Prac16_2_Hero h : list) {
			System.out.println(h.getName());
		}
	

	}

}
