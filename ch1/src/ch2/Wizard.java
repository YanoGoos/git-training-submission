package ch2;

public class Wizard {
	String name;
	int hp;
	public void heal (Main8_3 h) {
		h.hp += 10;
		System.out.println(h.name + "のHPを10回復した！");
	}

}
