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
				playRound(user, fred);
				break;
			case 2:
				playRound(user, rand);
				break;
			}

			// show wins, draws and losses vs most recent opponent
			user.stats();

			cont = InputCheck.cont(sc, "\nStart over? (y/n): ");
		}

		sc.close();
	}

	public static void playRound(RpsUser user, Player ai) {

		// store user and ai RPS choice
		user.generateRoshambo(getChoice());
		ai.generateRoshambo(' ');

		// prints player names and their RPS choices
		System.out.println("\n" + user.getName() + ": " + user.getRps());
		System.out.println(ai.getName() + ": " + ai.getRps());

		// call method to determine winner, loser or draw
		result(user, ai);

		if (InputCheck.cont(sc, "\nAnother round? (y/n): ", ""))
			playRound(user, ai);
	}

	public static void result(RpsUser user, Player ai) {
		//print the result that coincides with the user and ai choices, keep track of win draw loss for user
		switch (user.getRps()) {
		case Rock:
			if (ai.getRps() == Roshambo.Rock) {
				user.draw();
				System.out.println("Draw!");
			} else if (ai.getRps() == Roshambo.Paper) {
				user.loss();
				System.out.println(ai.getName() + " wins!");
			} else if (ai.getRps() == Roshambo.Scissors) {
				user.win();
				System.out.println(user.getName() + " wins!");
			}
			break;
		case Paper:
			if (ai.getRps() == Roshambo.Rock) {
				user.win();
				System.out.println(user.getName() + " wins!");
			} else if (ai.getRps() == Roshambo.Paper) {
				user.draw();
				System.out.println("Draw!");
			} else if (ai.getRps() == Roshambo.Scissors) {
				user.loss();
				System.out.println(ai.getName() + " wins!");
			}
			break;
		case Scissors:
			if (ai.getRps() == Roshambo.Rock) {
				user.loss();
				System.out.println(ai.getName() + " wins!");
			} else if (ai.getRps() == Roshambo.Paper) {
				user.win();
				System.out.println(user.getName() + " wins!");
			} else if (ai.getRps() == Roshambo.Scissors) {
				user.draw();
				System.out.println("Draw!");
			}
			break;
		}
	}

	public static char getChoice() {
		// loop to get correct RPS choice from user
		char rpsChoice = ' ';
		boolean validChoice = false;
		while (!validChoice) {
			System.out.print("\nRock, paper or scissors? (R/P/S): ");
			rpsChoice = sc.next().toUpperCase().charAt(0);
			sc.nextLine(); // garbage
			if (rpsChoice == 'R' || rpsChoice == 'P' || rpsChoice == 'S')
				validChoice = true;
			else
				System.out.println("Invalid choice.");
		}
		return rpsChoice;
	}
}
