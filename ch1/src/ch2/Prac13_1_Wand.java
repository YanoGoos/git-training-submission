package ch2;
//練習13-1
//練習13-2
public class Prac13_1_Wand {
	private String name;
	private double power;
	//練習13-3
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		if(name == null) {
			throw new IllegalArgumentException ("名前がnullである。処理を中断。");
		}
		if(name.length() <= 1) {
			throw new IllegalArgumentException ("名前が短すぎる。処理を中断。");
		}
		this.name = name;
	}
	
	public double getPower() {
		return  this.power;
	}
	
	public void setPower(double power) {
		if(power <= 0.5) {
			throw new IllegalArgumentException ("増幅率が小さすぎる。処理を中断。");
		}
		if(power >= 100) {
			throw new IllegalArgumentException ("増幅率が大きすぎる。処理を中断。");
		}
		this.power = power;
	}

}
