package lineComp;

import java.util.Scanner;
import java.lang.Math;

public class linecomparison {

	public static void main(String[] args) {
		
		System.out.println("Enter co-ordinates for first line: ");
		
		int x1,y1,x2,y2;
		Scanner in = new Scanner(System.in);
		
		// Taking co-ordinates from user
		System.out.println("Enter x1 value: ");
		x1 = in.nextInt();
		
		System.out.println("Enter y1 value: ");
		y1 = in.nextInt();
		
		System.out.println("Enter x2 value: ");
		x2 = in.nextInt();
		
		System.out.println("Enter y2 value: ");
		y2 = in.nextInt();
		
		// Calculating length of line
		double value1 = Math.floor(((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1)) );
		
		System.out.println("The length of first line is: ");
		
		double finalvalue1 = Math.sqrt(value1);
		System.out.println(finalvalue1); 
		
		
		
		
		System.out.println("Enter co-ordinates for Second line: ");
		int x11,y11,x22,y22;
		Scanner in1 = new Scanner(System.in);
		
		// Taking co-ordinates from user
		System.out.println("Enter x1 value: ");
		x11 = in.nextInt();
		
		System.out.println("Enter y1 value: ");
		y11 = in.nextInt();
		
		System.out.println("Enter x2 value: ");
		x22 = in.nextInt();
		
		System.out.println("Enter y2 value: ");
		y22 = in.nextInt();
		
		// Calculating length of line
		double value2 = Math.floor(((x22-x11)*(x22-x11)) + ((y22-y11)*(y22-y11)) );
		
		System.out.println("The length of second line is: ");
		double finalvalue2 = Math.sqrt(value2);
		System.out.println(finalvalue2); 
		
		// storing length values as strings
		String s1 = String.valueOf(finalvalue1);
		String s2 = String.valueOf(finalvalue2);
	 	boolean check = s1.equals(s2);
		if (check == true) {
			System.out.println("The lengths of both lines are equal.");
		} else {
			System.out.println("The lengths of both lines are not equal.");
		}
		
	}

}