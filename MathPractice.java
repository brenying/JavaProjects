package CS121;
import java.util.Scanner;

public class MathPractice {

	public static void main(String[] args) {
		// declare scanner
		Scanner in = new Scanner(System.in);
		
		// declare variables
		int ta = 0;
		int ca = 0;
		int ts = 0;
		int cs = 0;
		int tm = 0;
		int cm = 0;
		int td = 0;
		int cd = 0;
		double p = 0.0;
		double x = 0;
		double y = 0;
		double a = 0;
		int ans = 0;
		int diva = 0;
		int i = 0; // loop variable
		int input = 0;
		String enter = "";
		double temp = 0;
		boolean o = true;
		
		// menu
		do {
			o = true;
			cls();
			title("Main Menu");
			System.out.println("1.) Addition");
			System.out.println("2.) Subtraction");
			System.out.println("3.) Multiplication");
			System.out.println("4.) Division");
			System.out.println("5.) Report Card");
			System.out.println("6.) Exit");
			System.out.print("Enter your Option (1-6): ");
			try {
			input = in.nextInt();
			
			}
			catch (Exception err) {
				System.out.println("ID10T error has occured!");
				input = 9;
			}
			in.nextLine();
			do {
			switch (input) {
			case 1:
				
				// do something
				cls();
				title("Addition Problems");
				x = (int)(Math.random() * 16);
				y = (int)(Math.random() * 16);
				if (x < y) {
					temp = x;
					x = y;
					y = temp;
				} // end of if
				a = x+y;
				System.out.printf("%6.0f\n", x);
				System.out.print("+");
				System.out.printf("%5.0f\n", y);
				System.out.println("--------");
				System.out.print("    ");
				try {
				ans = in.nextInt();
				}
				catch (Exception err) {
					System.out.println("You entered an invalid response. Invalid answers are marked wrong.");
					ans = -1;
				}
				in.nextLine();
				
				if (ans == a) {
					ca = ca + 1;
					ta = ta + 1;
					System.out.println();
					System.out.println("Good job! That is Correct!");
				} // end of if
				else {
					ta = ta + 1;
					System.out.println();
					System.out.println("That is incorrect. The correct answer is: ");
					System.out.println();
					System.out.printf("%6.0f\n", x);
					System.out.print("+");
					System.out.printf("%5.0f\n", y);
					System.out.println("--------");
					System.out.printf("%6.0f\n", a);
				} // end of else
				
				System.out.println();
				System.out.println("Press Enter to Continue or Enter / to go to the menu");
				enter = in.nextLine();
				if (enter.equals("/")) {	
					o = false;
					break;
				}// end of if 
				else {
					o = true;
					break;
				} // end of else
			 
			
				
			case 2:
				// do something
				cls();
				title("Subtraction Problems");
				x = (int)(Math.random() * 16);
				y = (int)(Math.random() * 16);
				if (x < y) {
					temp = x;
					x = y;
					y = temp;
				} // end of if
				a = x-y;
				System.out.printf("%6.0f\n", x);
				System.out.print("-");
				System.out.printf("%5.0f\n", y);
				System.out.println("--------");
				System.out.print("    ");
				try {
					ans = in.nextInt();
					}
					catch (Exception err) {
						System.out.println("You entered an invalid response. Invalid answers are marked wrong.");
						ans = -1;
					}
					in.nextLine();
				
				if (ans == a) {
					cs = cs + 1;
					ts = ts + 1;
					System.out.println();
					System.out.println("Good job! That is Correct!");
				} // end of if
				else {
					ts = ts + 1;
					System.out.println();
					System.out.println("That is incorrect. The correct answer is: ");
					System.out.println();
					System.out.printf("%6.0f\n", x);
					System.out.print("-");
					System.out.printf("%5.0f\n", y);
					System.out.println("--------");
					System.out.printf("%6.0f\n", a);
				} // end of else
				
				System.out.println();
				System.out.println("Press Enter to Continue or Enter / to go to the menu");
			
				enter = in.nextLine();
				if (enter.equals("/")) {	
					o = false;
					break;
				}// end of if 
				else {
					o = true;
					break;
				} // end of else
				
			case 3:
				// do something
				cls();
				title("Multiplication Problems");
				x = (int)(Math.random() * 13);
				y = (int)(Math.random() * 13);
				if (x < y) {
					temp = x;
					x = y;
					y = temp;
				} // end of if
				a = x*y;
				System.out.printf("%6.0f\n", x);
				System.out.print("*");
				System.out.printf("%5.0f\n", y);
				System.out.println("--------");
				System.out.print("    ");
				try {
					ans = in.nextInt();
					}
				catch (Exception err) {
						System.out.println("You entered an invalid response. Invalid answers are marked wrong.");
						ans = -1;
				}
					in.nextLine();
				
				if (ans == a) {
					cm = cm + 1;
					tm = tm + 1;
					System.out.println();
					System.out.println("Good job! That is Correct!");
				} // end of if
				else {
					tm = tm + 1;
					System.out.println();
					System.out.println("That is incorrect. The correct answer is: ");
					System.out.println();
					System.out.printf("%6.0f\n", x);
					System.out.print("*");
					System.out.printf("%5.0f\n", y);
					System.out.println("--------");
					System.out.printf("%6.0f\n", a);
				} // end of else
				
				System.out.println();
				System.out.println("Press Enter to Continue or Enter / to go to the menu");
				enter = in.nextLine();
				if (enter.equals("/")) {	
					o = false;
					break;
				}// end of if 
				else {
					o = true;
					break;
				} // end of else
				
			case 4:
				// do something
				cls();
				title("Division Problems");
				diva = (int) (Math.random() * 12);
				y = (int)((Math.random() * 13) + 1);
				x = diva*y;
				a = x*y;
				System.out.printf("%1.0f", x);
				System.out.print(" / ");
				System.out.printf("%1.0f", y);
				System.out.print(" = ");

				try {
					ans = in.nextInt();
					}
					catch (Exception err) {
						System.out.println("You entered an invalid response. Invalid answers are marked wrong.");
						ans = -1;
					}
					in.nextLine();
				
				if (ans == diva) {
					cd = cd + 1;
					td = td + 1;
					System.out.println();
					System.out.println("Good job! That is Correct!");
				} // end of if
				else {
					td = td + 1;
					System.out.println();
					System.out.println("That is incorrect. The correct answer is: ");
					System.out.println();
					System.out.printf("%1.0f", x);
					System.out.print(" / ");
					System.out.printf("%1.0f", y);
					System.out.print(" = "+diva);
				} // end of else
				
				System.out.println();
				System.out.println("Press Enter to Continue or Enter / to go to the menu");
				enter = in.nextLine();
				if (enter.equals("/")) {	
					o = false;
					break;
				}// end of if 
				else {
					o = true;
					break;
				} // end of else
				
			case 5:
				// do something
				cls();
				
				System.out.printf("%47s\n", "Math  Practice");
				System.out.printf("%46s\n", "Report  Card");
				System.out.printf("%50s\n", "By: Brennen Yingling");
				System.out.println();
				System.out.printf("%20s%20s%20s%20s\n", "Subject", "Correct", "Total", "Percent" );
				Report("Addition", ca, ta);
				Report("Subtraction", cs, ts);
				Report("Multiplication", cm, tm);
				Report("Division", cd, td);
				System.out.printf("%52s", "Press Enter to Continue!");
				enter = in.nextLine();
				o = false;
				break;
				
			case 6:
				// do something
				cls();
				title("End of Program");
				System.out.println("That's all folks!!");
				o = false;
				break;
			

			default: 
				System.out.println("Choice must be between 1 & 6");
				System.out.println("Press Enter to Continue");
				enter = in.nextLine();
				o=false;
				break;
			
			}// end of switch
			} while (o == true);// end of while
	
		} while (input != 6); // end of do loop
		
		
	} // end of main
	//Report method
	public static void Report(String a, int b, int c) {
		System.out.printf("%20s", a);
		System.out.printf("%20d", b);
		System.out.printf("%20d", c);
		if (c == 0) {
			System.out.printf("%20s\n", "N/A");
		}// end of if
		else {
			double p = (b*100.0)/(c);
			System.out.printf("%20.1f\n", p);
		}// end of else
	}
	// clear screen method
	public static void cls() {
		for (int i = 0; i<=50; i = i+1) {
			System.out.println();
		} // end of for
	} // end of clear screen
	
	// title and credits method
	public static void title(String sub) {
		System.out.println("Math Practice Program");
		System.out.println(sub);
		System.out.println("By: Brennen Yingling");
		System.out.println();
	} // end of title and credits

} // end of class












