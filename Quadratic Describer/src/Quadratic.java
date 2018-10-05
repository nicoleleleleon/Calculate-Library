
public class Quadratic {
	public static String quadrDescriber (double a, double b, double c) {
		String equ = a + "x^2 + " + b + "x + " + c;
		System.out.println("The equation I will be describing is: " + equ);
		
		if (a>0) {
			String opening = "Up";
		}else if (a<0) {
			String opening = "Down";
		} else {
			String opening = "Linear equations don't have an \" opening \".";
		}
		System.out.println("Opens: " + opening);
		
		double axisSym = (-b)/(2*a);
		double vertex = a*(axisSym*axisSym)+(b*axisSym)+c;
		// use sqrt and abs value and discriminant to find xinter
		
				double xinter = 
		
	}

}
