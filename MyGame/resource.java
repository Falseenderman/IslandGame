import java.util.concurrent.ThreadLocalRandom;

public class resource
{
	public static void Gather()
	{
		int rand;
		int randMin = 5 * (menu.mode + 1) / 3;
		int randMax = 10 * menu.mode;

		System.out.println();

		// health
		rand = ThreadLocalRandom.current().nextInt(randMin, randMax + 1);
		game.health -= rand;
		System.out.println(" -" + rand + " health");
		if(rand >= 100){
			System.out.println(" Well...  you didn't even have a chance");
		}

		//food
		rand = ThreadLocalRandom.current().nextInt(0, 10 + 1);
		game.food += rand;
		System.out.println(" +" + rand + " food");

		// stone
		rand = ThreadLocalRandom.current().nextInt(0, 10 + 1);
		game.stone += rand;
		System.out.println(" +" + rand + " stone");

		//wood
		rand = ThreadLocalRandom.current().nextInt(0, 10 + 1);
		game.wood += rand;
		System.out.println(" +" + rand + " wood");

		//skill
		game.skill++;
		System.out.println(" +1 skill");
	}
}