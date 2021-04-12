package lineComp;

import java.util.Scanner;
import java.lang.Math;

public class linecomparison {

	public static void main(String[] args) {
		
		int x1,y1,x2,y2,length;
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
		double value = Math.floor(((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1)) );
		
		System.out.println("The length of line is: ");
		System.out.println(Math.sqrt(value)); 

	}

}
