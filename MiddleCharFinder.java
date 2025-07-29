package CS121;

import java.util.Scanner;

public class MiddleCharFinder {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean tof = true;
		String enter = "";
		int i = 0;
		int l = 0;
		int k = 0;
		do {
			tof = true;
			enter = "";
			cls();
			title();
			System.out.print("Please enter a line of input or / to exit: ");
			enter = in.nextLine();
			if (enter.equals("/")) {
				tof = false;
				break;
			}// end of if
			
			if (enter.length() % 2 == 0) {
				System.out.println("The middle is: "+ enter.substring((enter.length()/2)-1, ((enter.length()/2)-1)+2));
				for (i=0; i<=enter.length()-1; i=i+1) {
					System.out.printf("%3s", enter.charAt(i));
				}
					System.out.println();
					k = ((3*enter.length())/2)+2;
					System.out.printf("%"+k+"s", enter.substring((enter.length()/2)-1, ((enter.length()/2)-1)+2));
					System.out.println();
					System.out.println("Press Enter to Continue");
					enter = in.nextLine();                             
				
			} // end of if
			
			if (enter.length() % 2 != 0) {
				System.out.println("The middle is: "+ enter.charAt(((enter.length()/2))));
				for (i=0; i<=enter.length()-1; i=i+1) {
					System.out.printf("%3s", enter.charAt(i));
				}
				l = ((3*enter.length())/2)+2;
				System.out.println();
					System.out.printf("%"+l+"s", enter.charAt(enter.length()/2));
					System.out.println();
					System.out.println("Press Enter to Continue");
					enter = in.nextLine();                             
				
			}// end of else
			
			
		} while(tof);
		cls();
		System.out.println("Thanks for using my program");

	}
	// clear screen method
	public static void cls() {
		for (int i = 0; i<=50; i = i+1) {
			System.out.println();
		} // end of for
	} // end of clear screen

// title & credits method
public static void title() {
	System.out.println("Middle Character(s) Finder");
	System.out.println("By: Brennen Yingling");
	System.out.println();
}// end of title & credits
}
