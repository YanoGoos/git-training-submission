package ch2;

public class Main5_8 {

	public static int add(int x, int y) {
		//戻り値をそのまま使う
		int ans = x +y;
		return ans;
	}
	public static void main(String[] args) {
		System.out.println(add(add(10,20),add(30,40)));

	}

}
