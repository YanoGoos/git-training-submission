package ch2;
//オリジナル例外を利用する
public class Main17_13 {

	public static void main(String[] args) {
		try {
			throw new Main17_12_UnsupportMusicFileException("未対応のファイルです");
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
