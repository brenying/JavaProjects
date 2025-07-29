package CS121;
import java.util.Scanner;

public class Input_Average {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// declaring and initializing variables
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;
		int total = 0;
		double average = 0.0;
		
		// title & credits
		System.out.println("Input & Average");
		System.out.println("by");
		System.out.println("Brennen Yingling (This program asks the user for five number values and outputs the total and average.)");
		
		// getting numbers as inputs
		System.out.print("Please enter the first number:");
		num1 = input.nextInt();
		System.out.print("Please enter the second number:");
		num2 = input.nextInt();
		System.out.print("Please enter the third number:");
		num3 = input.nextInt();
		System.out.print("Please enter the fourth number:");
		num4 = input.nextInt();
		System.out.print("Please enter the fifth number:");
		num5 = input.nextInt();
		
		// output of the five numbers
		System.out.println("The 5 entered values were: "+num1+", "+num2+", "+num3+", "+num4+" and "+num5);
		
		// calculations
		total = num1+num2+num3+num4+num5;
		average = total/5.0;
		
		// Output of total and average
		System.out.println("The total is: "+total);
		System.out.println("The averge is: "+average);
		
	} // end of class

} // end of main
