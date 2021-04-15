package lineComp;

	public class UC4 {
		
			//length method to calculate length 
			static double length(double w,double x,double y,double z,int e) {
				
				double value = Math.floor(((w-y)*(w-y)) + ((z-x)*(z-x)) );
				double finalvalue=(Math.sqrt(value));
				System.out.println(e+".The length of line is: "+finalvalue);
				return finalvalue;
			}
			
			//comparing method to compare lines			
			static void comparing(String a,String b) {
				
				int compare= a.compareTo(b);
				
				if (compare > 0) {
					System.out.println("First line length is greater than second,which has length="+a);
				} else if(compare < 0){
					System.out.println("Second line length is greater than first,which has length="+b);
				}else {
					System.out.println("Both lines are equal.");
				}
			}
			
			
		public static void main(String[] args) {
			
			// initializing variables
			int x1=2 , y1=2 , x2=6 , y2=6, n=1;
			int x12=2 , y12=2 , x22=9 , y22=9, m=2;
			
			//method for 
			double line1 =length(x1,y1,x2,y2,n);
			double line2 =length(x12,y12,x22,y22,m);
			
			// casting double values into string
			String s1 = String.valueOf(line1);
			String s2 = String.valueOf(line2);
			
			// method to compare lengths
			comparing(s1,s2);
	}	

}