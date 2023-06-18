package myPkg;

import java.util.Scanner;

public class RectangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float areare,perimeter;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length:");
		float length = sc.nextFloat();
		System.out.println("Enter the width:");
		Float width = sc.nextFloat();
		areare = length * width;
		System.out.println("Area of rectangle is "+areare);
		perimeter = 2 * length * width;
		System.out.println("Perimeter of rectangle is "+perimeter);
	}

}
