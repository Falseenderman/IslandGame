import java.util.Scanner;

public class nightTime
{
	public static void Night()
	{
		//add enemies{combat}/weather(unavoidable damage)
		Scanner scan = new Scanner(System.in);

		game.food -= 2;
		if (game.health > 0 & game.food >= 0){
			//survive
			System.out.println("");
			System.out.println("You ate 2 food today.");
			game.day += 1;
			game.Games();
			}
			else{
				//died
				System.out.println("");
				System.out.print("You died");
				if (game.health <= 0){
					//health depleted
					System.out.print("");
				}
				else{
					//food depleted
					System.out.print(" of starvation");
				}
				System.out.println(", well done.");
				System.out.println("You survived " + game.day + " days.");
				System.out.println("");
				System.out.println("Play again?");
				System.out.println("Yes");
				menu.response = scan.nextLine();

				if (menu.response.equalsIgnoreCase("yes")){
					game.health = 100;
					game.food = 10;
					game.stone = 0;
					game.wood = 0;
					game.skill = 0;
					game.day = 1;
					game.stamina = 10;

					System.out.println("Please pick a difficulty.");
					System.out.println("Sugestions: 3-(normal)");
					System.out.println("	    5-(hard)");
					System.out.println("	    10-(painful)");
					System.out.println("	    20-(I wouldn't)");

					menu.mode = scan.nextInt();

					System.out.println("");
					System.out.println("You crashed on and island.");
					game.Games();
				}
				else{
					System.out.println("Good bye");
					System.out.println("");
				}
			}
	}
}