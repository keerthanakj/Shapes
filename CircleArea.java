package myPkg;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float PI=3.14159f;
		float areaci,circumfer;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius:");
		float r = sc.nextFloat();
		areaci = PI * r * r;
		System.out.println("Area of Circle "+areaci);
		circumfer = 2 * PI * r;
		System.out.println("Circumference of circle is "+circumfer);
	}

}
