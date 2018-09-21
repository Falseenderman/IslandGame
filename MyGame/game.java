import java.util.Scanner;
import java.io.IOException;

public class game
{
	public static int health = 100;
	public static int food = 10;
	public static int stone = 0;
	public static int wood = 0;
	public static int skill = 0;
	public static int day = 1;
	public static int stamina = 10;

	public static void Games(){



		String response;
		Scanner input = new Scanner(System.in);

		//ask user
		System.out.println("");
		System.out.println("Day " + day + ".");
		System.out.println("What do you want to do?");
		System.out.println("Search for food/resources.");
		System.out.println("Rest.");
		System.out.println("Build something.");
		System.out.println("Display stats.");
		System.out.println("Quit.");
		System.out.println("");

		response = input.nextLine();
		System.out.println("");

		//action
		// finish 3

		if (response.equalsIgnoreCase("search")){
			clear.cls();
			resource.Gather();
			nightTime.Night();
		}
		else if (response.equalsIgnoreCase("rest")){
			clear.cls();
			if (health <= 90){
				System.out.println("You gained 10 health.");
			}
			else{
				System.out.println("You gained " + ((100 - health) % 10) + " health.");
			}

			health += 10;

			if (health > 100){
				health = 100;
			}
			nightTime.Night();
		}
		else if (response.equalsIgnoreCase("build")){
			clear.cls();
			construction.Build();
			nightTime.Night();
		}
		else if (response.equalsIgnoreCase("display")){
			clear.cls();
			System.out.println("Health: " + health);
			System.out.println("Food: " + food);
			System.out.println("Stone: " + stone);
			System.out.println("Wood: " + wood);
			System.out.println("Skill: " + skill);
			game.Games();
		}
		else if (response.equalsIgnoreCase("quit")){
			System.out.println("Good bye");
		}
		else{
			clear.cls();
			game.Games();
		}
	}
}