import java.util.Scanner;

public class RoshamboApp {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Welcome to Rock Paper Scissors!");
		boolean cont = true;
		while (cont) {
			// get user name
			System.out.print("\nEnter your name: ");
			String name = sc.nextLine();

			// create players, 1 user, 2 ai
			RpsUser user = new RpsUser(name);
			AiOneChoice fred = new AiOneChoice("Fred");
			AiRandom rand = new AiRandom("Spock");

			// ask user to choose opponent
			int aiChoice = InputCheck.getInt(sc, "\nOpponents\n1.Fred\n2.Spock\nWho would you like to play against? ",
					1, 2);

			// play against the ai chosen
			switch (aiChoice) {
			case 1:
				Roshambo.playRound(sc, user, fred);
				break;
			case 2:
				Roshambo.playRound(sc, user, rand);
				break;
			}

			// show wins, draws and losses vs most recent opponent
			user.stats();

			cont = InputCheck.cont(sc, "\nStart over? (y/n): ");
		}

		sc.close();
	}
}
