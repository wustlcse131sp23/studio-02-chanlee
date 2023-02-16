package fall2018;

import java.util.Scanner;

public class fall2018no7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.println("Input width");
		double width = in.nextDouble();
		System.out.println("Input height");
		double height = in.nextDouble();

		double area = width * height;

		while (area > 0) {
			System.out.println("Area: " + area);
			System.out.println("Input new width");
			width = in.nextDouble();
			System.out.println("Input new height");
			height = in.nextDouble();
			area = width * height;
			if (area == 0) {
				System.out.println("Area: 0");
				break;
			}
		}
	}
}