
public class Quadratic {
	public static String quadrDescriber (double a, double b, double c) {
		//asking for coefficients
	//	System.out.println("Hello! Welcome to Quadratic Describer.\n Please give me values for the coefficients a, b, and c!");
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		System.out.println("c:" + c);
		//the full equation I will be analyzing
		String equ = a + "x^2 + " + b + "x + " + c;
		System.out.println("The equation I will be describing is: " + equ);
		//a coefficient determines opening
		String opening;
		if (a>0) {
			opening = "Up";
		}else if (a<0) {
			opening = "Down";
		} else {
			opening = "Linear equations don't have an \" opening \".";
		}
		System.out.println("Opens: " + opening);
		
		// the x value for axis of symmestry equation
		double axisSym = (-b)/(2*a);
		//round2
		double guess= 1.00;
		double diff= 1;
			while(diff>=.005) { //difference between the estimate and true
				guess= ((axisSym/guess)+guess)/2;
				//find absvalue of difference
				if(axisSym-(guess*guess)<=0) {
					diff = (axisSym-(guess*guess))*(-1);
				}else{
					diff = (axisSym-(guess*guess));
				} 
				axisSym = guess;
		System.out.println("Axis of Symmetry: " + axisSym);
		
		//plug x into equation to get y value (vertex)
		double vertex = a*(axisSym*axisSym)+(b*axisSym)+c;
		System.out.println("Vertex: (" + axisSym + "," + vertex + ")");
		
		// use sqrt and abs value and discriminant to find xinter using quad equation
		double discrim = (b * b) - 4*(a*c);
		if (discrim < 0) {
			System.out.println("X-intercept: There are no real solutions");
		}else {
		guess= 1.00;
		diff= 1;
			while(diff>=.005) { //difference between the estimate and true
				guess= ((discrim/guess)+guess)/2;
				//find absvalue of difference
				if(discrim-(guess*guess)<=0) {
					diff = (discrim-(guess*guess))*(-1);
				}else{
					diff = (discrim-(guess*guess));
				}
			}
			double rtDiscrim = guess; 
			//find 1 or 2 values of x
			double x1 = ((-1)*b + rtDiscrim)/(2*a);
			double x2 = ((-1)*b - rtDiscrim)/(2*a);
			//round x1 and x2
			int lastNum= (int)(x1*1000%10);
			int answer= (int)(100*x1);
			if(lastNum>= 5) {
				x1=((answer+1)/100.0);
			}else {
				x1=answer/100.0;
			}
			lastNum= (int)(x2*1000%10);
			answer= (int)(100*x2);
			if(lastNum>= 5) {
				x2=((answer+1)/100.0);
			}else {
				x2=answer/100.0;
			}
			System.out.println("X-intercept(s):" + x1 + " and " + x2);
		}
			//to find  y-intercept just need to plug 0 into the equation, which cancels out first two terms
			System.out.println("Y-intercept: (0," + c + ")");
				
			}return "";
	}
}
