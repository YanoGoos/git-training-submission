package ch2;
//練習6-1後半
public class Prac6_1_Kouhan {
	public static void callDeae() {
		System.out.println("えぇい、こしゃくな。くせ者だ！であえい！");
	}
	public static void showMondokoro() throws Exception {
		System.out.println("飛車さん、角さん。もういいでしょう。");
		System.out.println("この紋所が目に入らぬか！");
		Thread.sleep(3000);
		Prac6_1_Zenhan.doTogame();
	}

}
