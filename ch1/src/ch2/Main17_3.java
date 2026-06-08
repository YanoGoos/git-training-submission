package ch2;
//ザックリと例外を補足する
import java.io.FileWriter;
public class Main17_3 {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("data.txt");
			fw.write("hello!");
			fw.close();
		}catch(Exception e) {
			System.out.println("何らかのエラーが発生しました。");
		}

	}

}
