//Evan Olsen
import java.util.Scanner;

public class Lab2 {

	public static final double Acceleration = 9.8;
			
	public static void main(String[] args) {

		//v = u + at
		//S = ut + (1/2)at^2
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("What is the distance(S) traveled by the ball? With the formulas given.");
		
		//System.out.println("v = u + at");
		
		//System.out.println("S = ut + (1/2)at^2");
		
		System.out.println("Enter the initial velocity of the ball (in meters per second) at point A:");

		double v1 = key.nextDouble();
		
		System.out.println("How much time (in seconds) does the ball take to reach point B:");
		
		double v2 = key.nextDouble();
		
		System.out.println("Final Velocity of the ball =");
			System.out.println(v1 + Acceleration * v2 +" m/s");	
		
		//String value = key.nextLine();
			
		System.out.println("Distance traveled by the ball (S)= ");
			System.out.println(v1 * v2 + .5 * Acceleration * v2 * v2 +" meters");
			
			
		
			
		
		
		String value = key.nextLine();
		
		
		
		
		
		
		
	}

}
