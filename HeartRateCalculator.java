package CS121;
import java.util.Scanner;

public class HeartRateCalculator {

	public static void main(String[] args) {
		// set up scanner
		Scanner input = new Scanner(System.in);
		
		// declare variables
		int age = 0;
		String name = "";
		double low = 0;
		double high = 0;
		double max = 0;
		
		// title and credits
		System.out.println("Heart Rate Calculator");
		System.out.println("by: Brennen Yingling");
		System.out.println();
		
		// instructions
		System.out.println("The user enters the name and age of the client and the program will output the name, age, low heart rat, high heart rate, and max heart rate.");
		System.out.println();
		
		// get input
		System.out.print("Enter the client's name: ");
		name = input.nextLine();
		System.out.print("Enter the client's age (rounded to the nearest whole number): ");
		age = input.nextInt();
		input.nextLine();
		
		// calculations
		low = (-.7)*age + 154;
		high = (-.85)*age +187;
		max = (-1)*age + 220;
		
		// output
		System.out.println(name+"'s max heart rate is: "+max);
		System.out.println("Warning:  Anything over "+max+" would be dangerous!");
		System.out.println("Your target Heart Rate for training should be between "+low+" and "+high);
		
		// close scanner
		input.close();
		
		
		
	} // end of main

} // end of class
