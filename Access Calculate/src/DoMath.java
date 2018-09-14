//calls various methods in the calculate library
//client code (code that uses other code)
//@author Nicole Leon
//@version 0, 9/12/18

public class DoMath {
	public static void main (String[] args) {
		System.out.println("The square is " + Calculate.square(-3)); //Gets info from Calculate class
		
		System.out.println("The cube is " + Calculate.cube(-2));
		
		System.out.println("The averaege is " + Calculate.average(5,9));
		
		System.out.println("The degrees is " + Calculate.toDegrees(6));
		
		System.out.println("The Radians is " + Calculate.toRadians(180));
		
		System.out.println("The discriminant is " + Calculate.discriminant(1,5,6));
		
		System.out.println("The improper fraction is " + Calculate.toImproperFrac(1,2,3));
		
		System.out.println("The mixed number is " + Calculate.toMixedNum(7,2));
		
		System.out.println("The foil is " + Calculate.foil(2, 3, 6, -7, "n"));
		
		System.out.println("The numbers are evenly divisble:" + Calculate.isDivisibleBy(10,5));
		
		System.out.println("The absolute value is " + Calculate.absValue(-2));
	
	}
}

