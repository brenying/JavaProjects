package CS121;
import java.util.Scanner;;

public class FinalProject {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean tof = true;
		String enter = "";
		int input = 0;
		double o = 0.0;
		double g = 0.0;
		double p = 0.0;
		double kg = 0.0;
		double i = 0.0;
		double c = 0.0;
		double m = 0.0;
		double km = 0.0;
		
	

		
			do {
			cls();
			title("Main Menu");
			System.out.println("1.) Ounces to Grams");
			System.out.println("2.) Grams to Ounces");
			System.out.println("3.) Pounds to Kilograms");
			System.out.println("4.) Kilograms to Pounds");
			System.out.println("5.) Inches to Centimeters");
			System.out.println("6.) Centimeters to Inches");
			System.out.println("7.) Miles to Kilometers");
			System.out.println("8.) Kilometers to Miles");
			System.out.println("9.) Quit");
			System.out.print("Enter an Option (1-9): ");
			enter = in.nextLine();
			try {
				input = Integer.parseInt(enter);
				
			}// end of try
			catch (Exception err) {
				System.out.println();
				System.out.println("ID10T error has occured!");
				input = 19;
			}// end of catch			
			
			switch (input) {
	
			// if user enters 1
			case 1:
				tof = true;
				do {
				cls();
				title("Ounces to Grams");
				System.out.println();
				System.out.print("Please enter the number of ounces you would like to convert: ");
				enter = in.nextLine();
				try {
					o = Double.parseDouble(enter);
					
				}// end of try
				catch (Exception err) {
					System.out.println();
					System.out.println("ID10T error has occured!");
					System.out.println("Press Enter to go to Main Menu");
					enter = in.nextLine();
					tof = false;
					break;
				}// end of catch
				g = 28.35*o;
				System.out.println();
				System.out.printf("%20s", "Ounces");
				System.out.printf("%20s\n", "Grams");
				System.out.printf("%20.4f", o);
				System.out.printf("%20.4f\n", g);
				System.out.println();
				System.out.println("Press Enter to Return to Main Menu");
				enter = in.nextLine();
					break;
				} while (tof);
				tof = true;
				break; 

				// if user enters 2
			case 2:
				tof = true;
				do {
				cls();
				title("Grams to Ounces");
				System.out.println();
				System.out.print("Please enter the number of grams you would like to convert: ");
				enter = in.nextLine();
				try {
					g = Double.parseDouble(enter);
					
				}// end of try
				catch (Exception err) {
					System.out.println();
					System.out.println("ID10T error has occured!");
					System.out.println("Press Enter to go to Main Menu");
					enter = in.nextLine();
					tof = false;
					break;
				}// end of catch
				o = g/28.35;
				System.out.println();
				System.out.printf("%20s", "Grams");
				System.out.printf("%20s\n", "Ounces");
				System.out.printf("%20.4f", g);
				System.out.printf("%20.4f\n", o);
				System.out.println();
				System.out.println("Press Enter to Return to Main Menu");
				enter = in.nextLine();
					break;
				} while (tof);
				tof = true;
				break;
				
				// if user enters 3 
			case 3:
				tof = true;
				do {
				cls();
				title("Pounds to Kilograms");
				System.out.println();
				System.out.print("Please enter the number of Pounds you would like to convert: ");
				enter = in.nextLine();
				try {
					p = Double.parseDouble(enter);
					
				}// end of try
				catch (Exception err) {
					System.out.println();
					System.out.println("ID10T error has occured!");
					System.out.println("Press Enter to go to Main Menu");
					enter = in.nextLine();
					tof = false;
					break;
				}// end of catch
				kg = p/2.205;
				System.out.println();
				System.out.printf("%20s", "Pounds");
				System.out.printf("%20s\n", "Kilograms");
				System.out.printf("%20.4f", p);
				System.out.printf("%20.4f\n", kg);
				System.out.println();
				System.out.println("Press Enter to Return to Main Menu");
				enter = in.nextLine();
					break;
				} while (tof);
				tof = true;
				break;

				// if user enters 4 
			case 4:
				tof = true;
				do {
				cls();
				title("Kilograms to Pounds");
				System.out.println();
				System.out.print("Please enter the number of kilograms you would like to convert: ");
				enter = in.nextLine();
				try {
					kg = Double.parseDouble(enter);
					
				}// end of try
				catch (Exception err) {
					System.out.println();
					System.out.println("ID10T error has occured!");
					System.out.println("Press Enter to go to Main Menu");
					enter = in.nextLine();
					tof = false;
					break;
				}// end of catch
				p = 2.205*kg;
				System.out.println();
				System.out.printf("%20s", "Kilograms");
				System.out.printf("%20s\n", "Pounds");
				System.out.printf("%20.4f", kg);
				System.out.printf("%20.4f\n", p);
				System.out.println();
				System.out.println("Press Enter to Return to Main Menu");
				enter = in.nextLine();
					break;
				} while (tof);
				tof = true;
				break;

				// if user enters 5
			case 5:
				tof = true;
				do {
				cls();
				title("Inches to Centimeters");
				System.out.println();
				System.out.print("Please enter the number of inches you would like to convert: ");
				enter = in.nextLine();
				try {
					i = Double.parseDouble(enter);
					
				}// end of try
				catch (Exception err) {
					System.out.println();
					System.out.println("ID10T error has occured!");
					System.out.println("Press Enter to go to Main Menu");
					enter = in.nextLine();
					tof = false;
					break;
				}// end of catch
				c = i*2.54;
				System.out.println();
				System.out.printf("%20s", "Inches");
				System.out.printf("%20s\n", "Centimeters");
				System.out.printf("%20.4f", i);
				System.out.printf("%20.4f\n", c);
				System.out.println();
				System.out.println("Press Enter to Return to Main Menu");
				enter = in.nextLine();
					break;
				} while (tof);
				tof = true;
				break;
				
				// if user enters 6
			case 6:
				tof = true;
				do {
				cls();
				title("Centimeters to Inches");
				System.out.println();
				System.out.print("Please enter the number of centimeters you would like to convert: ");
				enter = in.nextLine();
				try {
					c = Double.parseDouble(enter);
					
				}// end of try
				catch (Exception err) {
					System.out.println();
					System.out.println("ID10T error has occured!");
					System.out.println("Press Enter to go to Main Menu");
					enter = in.nextLine();
					tof = false;
					break;
				}// end of catch
				i = c/2.54;
				System.out.println();
				System.out.printf("%20s", "Centimeters");
				System.out.printf("%20s\n", "Inches");
				System.out.printf("%20.4f", c);
				System.out.printf("%20.4f\n", i);
				System.out.println();
				System.out.println("Press Enter to Return to Main Menu");
				enter = in.nextLine();
					break;
				} while (tof);
				tof = true;
				break;
				
				// if user enters 7
			case 7:
				tof = true;
				do {
				cls();
				title("Miles to Kilometers");
				System.out.println();
				System.out.print("Please enter the number of miles you would like to convert: ");
				enter = in.nextLine();
				try {
					m = Double.parseDouble(enter);
					
				}// end of try
				catch (Exception err) {
					System.out.println();
					System.out.println("ID10T error has occured!");
					System.out.println("Press Enter to go to Main Menu");
					enter = in.nextLine();
					tof = false;
					break;
				}// end of catch
				km = m/.6214;
				System.out.println();
				System.out.printf("%20s", "Miles");
				System.out.printf("%20s\n", "Kilometers");
				System.out.printf("%20.4f", m);
				System.out.printf("%20.4f\n", km);
				System.out.println();
				System.out.println("Press Enter to Return to Main Menu");
				enter = in.nextLine();
					break;
				} while (tof);
				tof = true;
				break;
				
				// if user enters 8
			case 8:
				tof = true;
				do {
				cls();
				title("Kilometers to Miles");
				System.out.println();
				System.out.print("Please enter the number of kilometers you would like to convert: ");
				enter = in.nextLine();
				try {
					km = Double.parseDouble(enter);
					
				}// end of try
				catch (Exception err) {
					System.out.println();
					System.out.println("ID10T error has occured!");
					System.out.println("Press Enter to go to Main Menu");
					enter = in.nextLine();
					tof = false;
					break;
				}// end of catch
				m = km*.6214;
				System.out.println();
				System.out.printf("%20s", "Kilometers");
				System.out.printf("%20s\n", "Miles");
				System.out.printf("%20.4f", km);
				System.out.printf("%20.4f\n", m);
				System.out.println();
				System.out.println("Press Enter to Return to Main Menu");
				enter = in.nextLine();
					break;
				} while (tof);
				tof = true;
				break;
				
				// if user enters 9
			case 9: 
				cls();
				System.out.println("Thanks for using my program");
				tof = false;
				break;
				
			default:
				
				System.out.println("Enter a Value Between 1 & 9");
				System.out.println("Press Enter to Continue");
				enter = in.nextLine();
				break;
		
			} // end of switch
			} while (tof);

		
		
		
		
	}// end of main
	
	// clear screen method
	public static void cls() {
		for (int i = 0; i<=50; i = i+1) {
			System.out.println();
		} // end of for
	} // end of clear screen
	
	// title and credits method
	public static void title(String sub) {
		System.out.println("Conversion Program");
		System.out.println(sub);
		System.out.println("By: Brennen Yingling");
		System.out.println();
	} // end of title and credits
	
}// end of class
