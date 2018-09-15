/**
 * menu.java  9/6/2018
 *
 * @author - Jacob Davis
 */
import java.util.Scanner;
public class menu
{
	public static int mode = 1;
	public static int response;

	public static void main(String[] args){


		Scanner input = new Scanner(System.in);

		System.out.println("Would you like to play a game?");
		System.out.println("1. Yes");
		response = input.nextInt();
		if (response == 1){
			System.out.println("Please pick a difficulty.");
			System.out.println("Suggestions: 3-(Normal)");
			System.out.println("	     5-(Hard)");
			System.out.println("	     10-(Painful)");
			System.out.println("	     20-(I wouldn't)");

			mode = input.nextInt();

			System.out.println("");
			System.out.println("You crashed on an island.");
			game.Games();
		}
		else{
			System.out.println("Maybe later then.");
		}
	}
}