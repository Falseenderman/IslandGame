public class construction
{
	public static void Build()
	{
		if(game.skill >= 100){
			System.out.println("Build a raft?");

		}
		else{
			System.out.println("Incomplete section of game.");
		}

		game.Games();
	}
}