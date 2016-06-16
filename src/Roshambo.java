import java.util.Scanner;

public enum Roshambo {
	ROCK, PAPER, SCISSORS;
	
	public static void playRound(Scanner sc, RpsUser user, Player ai) {

		// store user and ai RPS choice
		user.setRps(user.generateRoshambo(getChoice(sc)));
		ai.setRps(ai.generateRoshambo(' '));

		// prints player names and their RPS choices
		System.out.println("\n" + user.getName() + ": " + user.getRps());
		System.out.println(ai.getName() + ": " + ai.getRps());

		// call method to determine winner, loser or draw
		Roshambo.result(user, ai);

		if (InputCheck.cont(sc, "\nAnother round? (y/n): ", ""))
			playRound(sc, user, ai);
	}
	
	private static void result(RpsUser user, Player ai) {
		//print the result that coincides with the user and ai choices, keep track of win draw loss for user
		switch (user.getRps()) {
		case ROCK:
			if (ai.getRps() == ROCK) {
				user.draw();
				System.out.println("Draw!");
			} else if (ai.getRps() == PAPER) {
				user.loss();
				System.out.println(ai.getName() + " wins!");
			} else if (ai.getRps() == SCISSORS) {
				user.win();
				System.out.println(user.getName() + " wins!");
			}
			break;
		case PAPER:
			if (ai.getRps() == ROCK) {
				user.win();
				System.out.println(user.getName() + " wins!");
			} else if (ai.getRps() == PAPER) {
				user.draw();
				System.out.println("Draw!");
			} else if (ai.getRps() == SCISSORS) {
				user.loss();
				System.out.println(ai.getName() + " wins!");
			}
			break;
		case SCISSORS:
			if (ai.getRps() == ROCK) {
				user.loss();
				System.out.println(ai.getName() + " wins!");
			} else if (ai.getRps() == PAPER) {
				user.win();
				System.out.println(user.getName() + " wins!");
			} else if (ai.getRps() == SCISSORS) {
				user.draw();
				System.out.println("Draw!");
			}
			break;
		}
	}

	private static char getChoice(Scanner sc) {
		// loop to get correct RPS choice from user
		char rpsChoice = ' ';
		boolean validChoice = false;
		while (!validChoice) {
			System.out.print("Rock, paper or scissors? (R/P/S): ");
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
