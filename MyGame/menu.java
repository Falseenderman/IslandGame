/**
 * menu.java  9/6/2018
 *
 * @author - Jacob Davis
 */
import java.util.Scanner;
public class menu
{
	public static int mode = 1;
	public static String response;

	public static void main(String[] args){

		//createGUI.gui();

		Scanner input = new Scanner(System.in);

		System.out.println("Would you like to play a game?");
		System.out.println("Yes");
		response = input.nextLine();
		if (response.equalsIgnoreCase("yes")){
			System.out.println("Please pick a difficulty.");
			System.out.println("Suggestions: 3-(Normal)");
			System.out.println("	     5-(Hard)");
			System.out.println("	     10-(Painful)");
			System.out.println("	     20-(I wouldn't)");

			mode = input.nextInt();

			while (mode <= 0) {
				System.out.println("Difficulty must be positive.");
				System.out.println("No free health for you!");
				System.out.println("");
				System.out.println("Please pick a difficulty.");
				System.out.println("Suggestions: 3-(Normal)");
				System.out.println("	     5-(Hard)");
				System.out.println("	     10-(Painful)");
				System.out.println("	     20-(I wouldn't)");

				mode = input.nextInt();

			}

			System.out.println("");
			System.out.println("You crashed on an island.");
			game.Games();
		}
		else{
			System.out.println("Maybe later then.");
		}
	}
}