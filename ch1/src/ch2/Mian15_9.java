package ch2;
//桁を揃えてキャラクターを表示する
public class Mian15_9 {

	public static void main(String[] args) {
		Main15_9_Hero hero = new Main15_9_Hero();
		hero.name = "minato";
		hero.job = "hero";
		hero.gold = 280;
		
		final String FORMAT = "%-9s %-13s 所持金%,6d";
		String s = String.format(FORMAT, hero.getName(),hero.getJob(),hero.getGold());
		System.out.println(s);

	}

}
