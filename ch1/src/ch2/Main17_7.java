package ch2;

import java.io.FileWriter;

//tryブロック内でnewすると・・・(エラー)
public class Main17_7 {

	public static void main(String[] args) {
		FileWriter fw;
		try {
			fw = new FileWriter("data.txt");
			fw.write("hello!");
		}catch(Exception e) {
			System.out.println("何らかの例外が発生しました。");
		}finally {
			fw.close();
		}

	}

}
