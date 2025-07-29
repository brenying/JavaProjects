package CS121;

import java.util.Scanner;

public class Encryption {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String enter = "";
		String code = "";
		String num = "";
		String decode = "";
		String hex = "";
		char c = 'c';
		int input = 0;
		int i = 0;
		int x = 0;
		int len = 0;
		int j = 0;
		int cypher = 0;
		boolean tof = true;

		do {
			tof = true;
			cls();
			title("Main Menu");
			System.out.println("1). Enter Encryption Cypher");
			System.out.println("2). Encrypt A Message");
			System.out.println("3.) Decrypt A Message");
			System.out.println("4.) Quit");
			System.out.print("Enter an Option (1-4): ");
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
				cls();
				title("Encryption Cypher");
				System.out.println("Please be aware if a number is not entered  or not between 1 & 128 it will automatically be a 0");
				System.out.print("Please Enter the Encryption Cypher: ");
				enter = in.nextLine();
				try {
					cypher = Integer.parseInt(enter);
					
				}// end of try
				catch (Exception err) {
					System.out.println();
					System.out.println("Not a Valid input (automatically 0)");
					cypher = 0;
				}// end of catch		
				if (cypher < 1 || cypher > 128) {
					cypher = 0;
				}
				System.out.println("Press Enter to Continue");
				enter = in.nextLine();
				break;
				
			case 2:
				hex = "";
				code = "";
				enter = "";
				cls();
				title("Encrypt a Message");
				System.out.print("Please enter the line of text to code: ");
				enter = in.nextLine();
				System.out.println("The original line of text was: "+enter);
				for (i=0; i<=enter.length()-1; i=i+1) {
					c = enter.charAt(i);
					x = (int) c;
					if (x<1||x>127) {
						x = 32;
					}
					x = x + cypher;
					hex = Integer.toHexString(x);
					
				
					code = code + hex;
				}
				System.out.println("The coded text is: "+code); 
				System.out.println("Press Enter to Continue");
				enter = in.nextLine();
				break;

				// if user enters 2
			case 3:
			hex = "";
			decode = "";
			enter = "";
			cls();
			title("Decrypt A Message");
			System.out.print("Please enter the line of text to decrypt: ");
			enter = in.nextLine();
			len = enter.length();
			System.out.println("The original line of text was: "+enter);
			for (i=0; i<len; i=i+2) {
				hex = enter.substring(i, (i+2));
				x = Integer.parseInt(hex, 16);
				x = x - cypher;
				c = (char) x;
				
				
				decode = decode + c;
			}
			System.out.println("The decoded text is: "+decode); 
			System.out.println("Press Enter to Continue");
			enter = in.nextLine();
				break;
		
				
			case 4: 
				cls();
				System.out.println("Thanks for using my program");
				tof = false;
				break;
				
			default:		
				System.out.println("Enter a Value Between 1 & 4");
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
		System.out.println("Encryption Program");
		System.out.println(sub);
		System.out.println("By: Brennen Yingling");
		System.out.println();
	} // end of title and credits

}// end of class