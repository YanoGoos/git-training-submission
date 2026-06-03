package ch2;

//練習8-1
//public class Cleric {
import java.util.Random;

public class Prac8_1 {

	//練習8-2
	String name;
	int hp = 50;
	final int maxHp = 50;
	int mp = 10;
	final int maxMp = 10;

	//練習8-3
	public void selfAid() {
		System.out.println(this.name + "はセルフエイドを唱えた！");
		this.hp = this.maxHp;
		this.mp -= 5;
		System.out.println("HPが最大まで回復した");
	}
	//練習8-4
	public int pray(int sec) {
		System.out.println(this.name + "は" + sec + "秒天に祈った！");
		
		int recover = new Random().nextInt(3) + sec;
		int recoverActual = Math.min(this.maxMp - this.mp, recover);
		
		this.mp += recoverActual;
		System.out.println("MPが" + recoverActual + "回復した");
		return recoverActual;
	}

}
