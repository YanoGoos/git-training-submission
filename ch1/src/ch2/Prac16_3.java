package ch2;
//練習16-3
import java.util.HashMap;
import java.util.Map;

public class Prac16_3 {

	public static void main(String[] args) {
		Prac16_2_Hero h1 = new Prac16_2_Hero("斎藤");
		Prac16_2_Hero h2 = new Prac16_2_Hero("鈴木");
		Map<Prac16_2_Hero,Integer> Heros = new HashMap<Prac16_2_Hero,Integer>();
		Heros.put(h1,3);
		Heros.put(h2,7);
		for(Prac16_2_Hero key : Heros.keySet()) {
			int Value = Heros.get(key);
			System.out.println(key.getName() + "が倒した敵＝"+ Value);
		}

	}

}
