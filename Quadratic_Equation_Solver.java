package CS121;
import java.util.Scanner;
public class Quadratic_Equation_Solver {

	public static void main(String[] args) {
		// declare scanner
		Scanner input = new Scanner(System.in);
		
		// declare variables
		double a = 0.0;
		double b = 0.0;
		double c = 0.0;
		double x1 = 0.0;
		double x2 = 0.0;
		
		// title & credits
		System.out.println("Quadratic Equation Solver");
		System.out.println("By: Brennen Yingling");
		System.out.println();
		
		// instructions
		System.out.println("The user will input a (coefficient of the x^2 term), b (the number next to and multiplied by the x), & c (the constant term).");
		System.out.println("The program will then check the discriminant to see how many roots there will be (2 real, 1 real, 0 real roots).");
		System.out.println("ax^2 + bx + c = 0");
		System.out.println();
		
		// input
		System.out.print("Please enter A (the coefficient of the x^2 term): ");
		a = input.nextDouble();
		System.out.print("Please enter B (the number next to and multiplied by the x): ");
		b = input.nextDouble();
		System.out.print("Please enter C (the constant term): ");
		c = input.nextDouble();
		System.out.println();
		
		// calculations & output
		if ((b*b) - (4*a*c) > 0) {
			x1 = (-b+Math.sqrt(b*b-4*a*c))/(2*a);
			x2 = (-b-Math.sqrt(b*b-4*a*c))/(2*a);
			System.out.println("2 Real Roots");
			System.out.println("X = "+x1);
			System.out.println("Or");
			System.out.println("X = "+x2);
		}// end of if
		if ((b*b) - (4*a*c) == 0) {
			x1 = (-b+Math.sqrt(b*b-4*a*c))/(2*a);
			System.out.println("1 Real Root");
			System.out.println("X = "+x1);
		} // end of if
		if ((b*b) - (4*a*c) < 0) {
			System.out.println("No Real Solution");
		} // end of if
		
		// close scanner
		input.close();
		
	} // end of main

} // end of class
