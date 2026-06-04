package ch2;
//インターフェイスを継承したクラスの定義
//KyotoCleaningShop
public class Main11_15 implements CleanigService{
	String ownerName;
	String address;
	String phone;
	
	public Shirt washShirt(Shirt s) {
		return s;
	}
	
	public Towl washTowl(Towl t) {
		return t;
	}
	
	public Coat washShirt(Coat c) {
		return c;
	}

}
