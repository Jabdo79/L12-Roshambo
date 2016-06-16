
public class AiRandom extends Player {

	public AiRandom(String name) {
		super(name);
	}

	Roshambo generateRoshambo(char choice) {
		int roll = (int)(Math.random()*3)+1;
		switch(roll){
		case 1:
			return Roshambo.Rock;
		case 2:
			return Roshambo.Paper;
		case 3:
			return Roshambo.Scissors;
		default:
			return null;
		}
	}
}