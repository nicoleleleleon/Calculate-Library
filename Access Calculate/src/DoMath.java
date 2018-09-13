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
		
		System.out.println("The improper fraction is " + Calculate.toImproperFrac(6,6,6));
	
	
	}
}

