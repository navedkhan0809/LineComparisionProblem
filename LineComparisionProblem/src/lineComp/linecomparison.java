package lineComp;

import java.util.Scanner;
import java.lang.Math;

public class linecomparison {

	public static void main(String[] args) {
		
		//coordinates for first value 
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
		
		double finalvalue1 = Math.sqrt(value1);
		System.out.println("The length of first line is: "+finalvalue1);
		
		
		//coordinates for second value 
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
		
		double finalvalue2 = Math.sqrt(value2);
		System.out.println("The length of second line is: "+finalvalue2);
		
		Double obj1  = new Double(finalvalue1);
		Double obj2  = new Double(finalvalue2);
		
		int compare= obj1.compareTo(obj2);
		
		if (compare > 0) {
			System.out.println("First line length is greater than second,which has length="+obj1);
		} else if(compare < 0){
			System.out.println("Second line length is greater than first,which has length="+obj2);
		}else {
			System.out.println("Both lines are equal.");
		}
					
	}

}