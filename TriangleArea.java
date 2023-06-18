package myPkg;

import java.util.Scanner;

public class TriangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float areatri, perimeter;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base:");
		float base=sc.nextFloat();
		System.out.println("Enetr the height:");
		float height= sc.nextFloat();
		System.out.println("Enter the side:");
		float side= sc.nextFloat();
        areatri = 0.5f * height * base;
		System.out.println("Area of triangle is "+areatri);
		perimeter = side + base + side;
		System.out.println("Perimeter of triangle is "+perimeter);
	}

}
