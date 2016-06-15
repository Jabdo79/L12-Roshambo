
public enum Roshambo {
	Rock, Paper, Scissors;
	
	public String toString(Roshambo e){
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
	}
}
