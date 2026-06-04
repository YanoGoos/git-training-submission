package ch2;
//コンストラクタを呼び出せない状況(エラー)
public class Main10_11_Item {
	String name;
	int price;
	public Main10_11_Item(String name) {
		this.name = name;
		this.price = 0;
	}
	public Main10_11_Item(String name,int price) {
		this.name = name;
		this.price = price;
	}

}
