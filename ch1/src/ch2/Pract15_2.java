package ch2;
//練習15-2
public class Pract15_2 {

	public static void main(String[] args) {

	}
	
	public String concotPath(String folder, String file) {
		if(!folder.endsWith("\\")) {
			folder += "\\";
		}
		return folder + file;
	}

}
