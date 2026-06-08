package ch2;
//try-cathc文でException系例外の発生に備える
import java.io.FileWriter;
import java.io.IOException;
public class Main17_2 {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("date.txt");
		}catch(IOException e) {
			System.out.println("エラーが発生しました。");
		}

	}

}
