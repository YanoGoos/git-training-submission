package ch2;

public class Prac5_4 {
	//練習5-4
	public static double calcTriangleArea(double bottom,double height) {
		double Triangle = (bottom * height) /2;
		return Triangle;
	}
	public static double calcCircleArea(double radius) {
		double Circle = radius * radius * 3.14;
		return Circle;
	}

	public static void main(String[] args) {
		double Triangle = calcTriangleArea(10.0,5.0);
		double Circle = calcCircleArea(5.0);
		
		System.out.println(Triangle);
		System.out.println(Circle);

	}

}
