package CS121;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class AscnareTranslation {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String enter = "";
		String code = "";
		String num = "";
		String decode = "";
		char c = 'c';
		int input = 0;
		int i = 0;
		int x = 0;
		int len = 0;
		int j = 0;
		boolean tof = true;

		do {
			tof = true;
			cls();
			title("Main Menu");
			System.out.println("1.) Code to Send to ASCnare");
			System.out.println("2.) Decode Messages from ASCnare");
			System.out.println("3.) Quit");
			System.out.print("Enter an Option (1-3): ");
			enter = in.nextLine();
			try {
				input = Integer.parseInt(enter);
				
			}// end of try
			catch (Exception err) {
				System.out.println();
				System.out.println("Error has occured!");
				input = 19;
			}// end of catch			
			
			switch (input) {
			
			// if user enters 1
			case 1:
				code = "";
				enter = "";
				cls();
				title("Code to Send to ASCnare");
				System.out.print("Please enter the line of text to code: ");
				enter = in.nextLine();
				enter = enter.toUpperCase();
				System.out.println("The original line of text was: "+enter);
				for (i=0; i<=enter.length()-1; i=i+1) {
					c = enter.charAt(i);
					x = (int) c;
					if (x<32||x>96) {
						x = 32;
					}
					code = code + x;
				}
				System.out.println("The coded text is: "+code); 
				System.out.println("Press Enter to Continue");
				enter = in.nextLine();
				break;

			// if user enters 2
			case 2:
				decode = "";
				enter = "";
				cls();
				title("Decode Messages from ASCnare");
				System.out.print("Please enter the line of text to decode: ");
				enter = in.nextLine();
				len = enter.length();
				System.out.println("The original line of text was: "+enter);
				for (i=0; i<len; i=i+2) {
					j=2;
					num = enter.substring(i, (i+2));
					x = Integer.parseInt(num);
					c = (char) x;
					decode = decode + c;
					j=j+1;
				}
				System.out.println("The decoded text is: "+decode); 
				System.out.println("Press Enter to Continue");
				enter = in.nextLine();
				break;
		
			// if the user enters a three
			case 3: 
				cls();
				System.out.println("Thanks for using my program");
				tof = false;
				break;
			
			// if the user enters something that isn't 1-3
			default:		
				System.out.println("Enter a Value Between 1 & 3");
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
		System.out.println("ASCnare Code/Decode Program");
		System.out.println(sub);
		System.out.println("By: Brennen Yingling");
		System.out.println();
	} // end of title and credits

}// end of title and credits class

