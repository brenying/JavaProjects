package CS121;
import java.util.Scanner;
public class Diagonals {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// declare variables
		int d = 0;
		int answer = 0;
		
		// title & credits
		System.out.println("Diagonal Program");
		System.out.println("by: Brennen Yingling");
		System.out.println("");
		
		// explains what the program does
		System.out.println("This program will determine the number of diagonals that are in an 'x' sided figure. The number of sides must be greater than 3.");
		
		// gets input
		System.out.print("Please enter the number of sides: ");
		d = input.nextInt();
		
		// calculations
		answer = d*(d-3)/2;
		
		// output
		System.out.println("The number of diagonals in a "+d+ " sided figure is "+answer);
		input.close();

	} // end of main

} // end of class
