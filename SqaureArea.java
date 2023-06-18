package myPkg;

import java.util.Scanner;

public class SqaureArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int areasq,perimeter;
		System.out.println("Enter the side ");
		int side = sc.nextInt();
		areasq = side*side;
		System.out.println("Area of Square is "+areasq);
		perimeter = 4 * side;
		System.out.println("Perimeter od square is "+perimeter);
		
	}

}
