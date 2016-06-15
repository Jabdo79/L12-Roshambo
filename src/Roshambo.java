
public enum Roshambo {
	Rock (1, 'R'), Paper (2, 'P'), Scissors (3, 'S');
	
	private final int rpsValue;
	private final char rpsChar;
	
	Roshambo(int rpsValue, char rpsChar){
		this.rpsValue = rpsValue;
		this.rpsChar = rpsChar;
	}
	
	public static void result(RpsUser user, Player ai) {
		//print the result that coincides with the user and ai choices, keep track of win draw loss for user
		switch (user.getRps()) {
		case Rock:
			if (ai.getRps() == Rock) {
				user.draw();
				System.out.println("Draw!");
			} else if (ai.getRps() == Paper) {
				user.loss();
				System.out.println(ai.getName() + " wins!");
			} else if (ai.getRps() == Scissors) {
				user.win();
				System.out.println(user.getName() + " wins!");
			}
			break;
		case Paper:
			if (ai.getRps() == Rock) {
				user.win();
				System.out.println(user.getName() + " wins!");
			} else if (ai.getRps() == Paper) {
				user.draw();
				System.out.println("Draw!");
			} else if (ai.getRps() == Scissors) {
				user.loss();
				System.out.println(ai.getName() + " wins!");
			}
			break;
		case Scissors:
			if (ai.getRps() == Rock) {
				user.loss();
				System.out.println(ai.getName() + " wins!");
			} else if (ai.getRps() == Paper) {
				user.win();
				System.out.println(user.getName() + " wins!");
			} else if (ai.getRps() == Scissors) {
				user.draw();
				System.out.println("Draw!");
			}
			break;
		}
	}
	
	/*public String toString(Roshambo e){
		switch(e){
		case Rock:
			return "Rock";
		case Paper:
			return "Paper";
		case Scissors:
			return "Scissors";
		default:
			return "Invalid choice";
		}
	}*/
}
