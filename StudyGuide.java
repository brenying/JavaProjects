package CS121;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StudyGuide {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);
		String enter = "";
		int input = 0;
		int cnt = 0;
		int i = 0;
		int j = 0;
		int found = 1;
		int answer = 0;
		double ca = 0.0;
		double wa = 0.0;
		double tot = 0.0;
		double per = 0.0;
		double x = 0.0;
		double y = 0.0;
		boolean tof = true;
		String [][] q = new String [101][6];
		String [] d = new String [6];
		int [] p = new int [6];
		
		
		do {
			tof = true;
			cls();
			title("Main Menu");
			System.out.println("1.) Add Questions");
			System.out.println("2.) Edit Questions");
			System.out.println("3.) Delete Question");
			System.out.println("4.) Practice");
			System.out.println("5.) Report Menu");
			System.out.println("6.) Save Data");
			System.out.println("7.) Load Data");
			System.out.println("8.) Quit");
			System.out.print("Enter an Option (1-8): ");
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
				tof = true;
				do {
					title("Append Option");
					System.out.println("Enter the information, / at any time to return to main menu.");
					System.out.println();
					if (cnt == 0) {
						System.out.println("Last question entered: No questions entered yet");
					}// end of if
					if (cnt != 0) {
					System.out.println("Last question entered: "+q[cnt][1]);
					}// end of if
					System.out.print("Study Guide Question: ");
					d[1] = in.nextLine();
					if (d[1].equals("/")) {
						tof = false;
						break;
					}// end of if
					System.out.print("Correct Answer: ");
					d[2] = in.nextLine();
					if (d[2].equals("/")) {
						tof = false;
						break;
					}// end of if
						System.out.print("Enter the #1 wrong answer: ");
						d[3] = in.nextLine();
						if (d[3].equals("/")) {
							tof = false;
							break;
						}// end of if
						System.out.print("Enter the #2 wrong answer: ");
						d[4] = in.nextLine();
						if (d[4].equals("/")) {
							tof = false;
							break;
						}// end of if
						System.out.print("Enter the #3 wrong answer: ");
						d[5] = in.nextLine();
						if (d[5].equals("/")) {
							tof = false;
							break;
						}// end of if
					cnt = cnt +1;
					q[cnt][1] = d[1];
					q[cnt][2] = d[2];
					q[cnt][3] = d[3];
					q[cnt][4] = d[4];
					q[cnt][5] = d[5];
					
				} while(tof);  
				tof = true;
				break;

				// if user enters 2
			case 2:
				tof = true;
				do {
				found = 0;
				cls();
				title("Edit Option");
				System.out.print("Enter a keyword to search a question: ");
				enter = in.nextLine();
				for (i=1; i<=cnt; i=i+1) {
					if (q[i][1].toUpperCase().contains(enter.toUpperCase())) {
						System.out.println(q[i][1]);
						System.out.println("Is this the correct item (y/n)?");
						d[0] = in.nextLine();
						if (d[0].equals("Y") || d[0].equals("y")) {
							found = i;
							i = cnt;
						}// end of if
					}// end if
				}// end for
				if (found == 0) {
					System.out.println("No item found to edit, press enter to try again or / for menu.");
					d[0] = in.nextLine();
					if (d[0].equals("/")) {
						break;
					}// end if
				}// end of if
				if (found >= 1 && found <= cnt) {
					System.out.println("Press enter to accept the value or enter the corrected value");
					System.out.println(q[found][1]);
					enter = in.nextLine();
					if (enter.equals("")) {
						q[found][1] = q[found][1];
					}// end if
					else {
						q[found][1] = enter;
						
					}// end else
				}// end if
				if (found >= 1 && found <= cnt) {
					System.out.println("Press enter to accept the value or enter the corrected value");
					System.out.println(q[found][2]);
					enter = in.nextLine();
					if (enter.equals("")) {
						q[found][2] = q[found][2];
					}// end if
					else {
						q[found][2] = enter;
						
					}// end else
				}// end if
				if (found >= 1 && found <= cnt) {
					System.out.println("Press enter to accept the value or enter the corrected value");
					System.out.println(q[found][3]);
					enter = in.nextLine();
					if (enter.equals("")) {
						q[found][3] = q[found][3];
					}// end if
					else {
						q[found][3] = enter;
						
					}// end else
				}// end if
				if (found >= 1 && found <= cnt) {
					System.out.println("Press enter to accept the value or enter the corrected value");
					System.out.println(q[found][4]);
					enter = in.nextLine();
					if (enter.equals("")) {
						q[found][4] = q[found][4];
					}// end if
					else {
						q[found][4] = enter;
						
					}// end else
				}// end if
				if (found >= 1 && found <= cnt) {
					System.out.println("Press enter to accept the value or enter the corrected value");
					System.out.println(q[found][5]);
					enter = in.nextLine();
					if (enter.equals("")) {
						q[found][5] = q[found][5];
					}// end if
					else {
						q[found][5] = enter;
						
					}// end else
				}// end if
				} while (tof);
				tof = true;
				break;
				
				// if user enters 3 
			case 3:
				found = 0;
				tof = true;
				do {
					cls();
					title("Delete Option");
					System.out.print("Enter a keyord to search a question: ");
					enter = in.nextLine();
					for (i=1; i<=cnt; i=i+1) {
						if (q[i][1].toUpperCase().contains(enter.toUpperCase())) {
							System.out.println(q[i][1]);
							System.out.println("Is this the correct item (y/n)?");
							d[0] = in.nextLine();
							if (d[0].equals("Y") || d[0].equals("y")) {
								found = i;
								i = cnt;
							}// end of if
						}// end if
					}// end for
					if (found == 0) {
						System.out.println("No item found to edit, press enter to try again or / for menu.");
						d[0] = in.nextLine();
						if (d[0].equals("/")) {
							break;
						}// end if
					}// end of if
					for (i=found; i<cnt; i=i+1) {
						q[i][1] = q[i+1][1];
						q[i][2] = q[i+1][2];
						q[i][3] = q[i+1][3];
						q[i][4] = q[i+1][4];
						q[i][5] = q[i+1][5];
					}// end of for
					cnt = cnt -1;
					System.out.print("Enter a / to return to menu, or enter to delete more: ");
					enter = in.nextLine();
					if (enter.equals("/")) {
						tof = false;
						break;
					}// end if
				} while (tof);
				tof = true;
				break;

				// if user enters 4 
			case 4:
				// if p[i] = 1 then then user selected the correct answer
				tof = true;
				do {
					cls();
					title("Practice");
					
					x = (int)(Math.random()*cnt+1);
					d[0] = q[(int) x][1];
					d[1] = q[(int) x][2];
					d[2] = q[(int) x][3];
					d[3] = q[(int) x][4];
					d[4] = q[(int) x][5];
					for (i=1; i<=4; i=i+1) {
						p[i] = 0;
					}// end for
					for (i=1;i<=4; i=i+1) {
						y = (int)(Math.random()* 4+1);
						if (y==p[1]||y==p[2]||y==p[3]||y==p[4]) {
							i=i-1;
						}// end of if
						else {
							p[i]=(int) y;
						}// end else
					}// end of for
					
					if (cnt < 1) {
						System.out.println("No questions have been entered yet.");
						System.out.println("Press enter");
						enter = in.nextLine();
						break;
					}// end of if
					else {
					System.out.println(d[0]);
					for (i=1; i<=4; i=i+1) {
						System.out.println(i+" - "+d[p[i]]);
					}// end for
					System.out.print("Enter your answer (1-4): ");
					enter = in.nextLine();
					try {
						input = Integer.parseInt(enter);
						
					}// end of try
					catch (Exception err) {
						System.out.println();
						System.out.println("Not Valid");
						input = 19;
					}
					if (p[input] == 1) {
						System.out.println("Good Job! - That is Correct");
						ca = ca+1;
					}// end if
					else {
						System.out.println("Sorry, the correct answer is: ");
						System.out.println(d[p[1]]);
						wa=wa+1;
					}// end else
					System.out.println("Press enter to continue, / for main menu.");
					enter = in.nextLine();
					
					if (enter.equals("/")) {
						tof = false;
						break;
					}// end of if
					}
				} while(tof);
				tof = true;
				break;

			case 5:
				tof = true;
				
				do {
					cls();
					title("Report Menu");
					System.out.println("1) List of Questions");
					System.out.println("2) Report Card");
					System.out.println("3) Return to Main Menu");
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
					case 1: 
						tof = true;
						do {
							cls();
							title("List of Questions");
							if (cnt < 1) {
								System.out.println("No questions have been entered yet.");
							}// end of if
							else {
								for (i=1; i<=cnt; i=i+1) {
									System.out.println("Question #"+i+" - "+q[i][1]);
									System.out.println("Correct Answer "+i+" - "+q[i][2]);
									System.out.println("1st Wrong Answer "+i+" - "+q[i][3]);
									System.out.println("2nd Wrong Answer "+i+" - "+q[i][4]);
									System.out.println("3rd Wrong Answer "+i+" - "+q[i][5]);
									System.out.println();
								}// end of for
							}// end of else
							
							System.out.println("Press Enter to return to the menu");
							enter = in.nextLine();
							tof = false;
							break;
						} while (tof);
						tof = true;
						break;
						
					case 2:
						tof = true;
						tot = ca + wa;
						per = ca/tot;
						do {
							cls();
							title("Report Card");
							System.out.printf("%15s", "Correct");
							System.out.printf("%15s", "Wrong");
							System.out.printf("%15s", "Total");
							System.out.printf("%15s\n", "Percent");
							System.out.printf("%15.0f", ca);
							System.out.printf("%15.0f", wa);
							System.out.printf("%15.0f", tot);
							if (tot == 0) {
								System.out.printf("%15s\n", "N/A");
							}// end of if
							else {
							System.out.printf("%15.1f\n", per);
							}// end of else
							System.out.println();
							System.out.println("Press Enter to go back to Report Menu");
							enter = in.nextLine();
							tof = false;
							break;
						} while (tof);
						tof = true;
						break;
						
					case 3:
						tof = false;
						break;
						
					default:
						System.out.println("Enter a Value Between 1 & 3");
						System.out.println("Press Enter to Continue");
						enter = in.nextLine();
						break;
					}// end of switch
				// if t==0     print N\A 
				// else        prnt _____
				
				} while (tof);
				tof = true;
				break;
				
			case 6:
				cls();
				title("Save Option");
				System.out.println("Carefully Saving Files...");
				PrintWriter questsout = new PrintWriter("questions.txt");
				questsout.println(cnt);
				for (i=1; i<=cnt; i=i+1) {
					for (j=1; j<=5; j=j+1) {
						questsout.println(q[i][j]);
					}// end of for
				}// end of for
				questsout.close();
				System.out.println("All Finished");
				System.out.println("Enter Anything to Continue");
				enter = in.nextLine();
				break;
				
				// if user enters 7
			case 7:
				cls();
				title("Load Option");
				System.out.println("Carefully Loading Files...");
				File fin = new File("questions.txt");
				Scanner filein = new Scanner(fin);
				q[0][0] = filein.nextLine();
				cnt = Integer.parseInt(q[0][0]);
				for (i=1; i<=cnt; i=i+1) {
					for (j=1; j<=5; j=j+1) {
						q[i][j] = filein.nextLine();
					}// end of for
				}// end of for
				filein.close();
				System.out.println("All Finished");
				System.out.println("Enter Anything to Continue");
				enter = in.nextLine();
				break;
				
			case 8: 
				cls();
				System.out.println("Thanks for using my program");
				tof = false;
				break;
				
			default:		
				System.out.println("Enter a Value Between 1 & 8");
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
		System.out.println("Study Guide Program");
		System.out.println(sub);
		System.out.println("By: Brennen Yingling");
		System.out.println();
	} // end of title and credits

}// end of class
