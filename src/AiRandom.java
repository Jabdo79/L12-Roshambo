
public class AiRandom extends Player {

	public AiRandom(String name) {
		super(name);
	}

	Roshambo generateRoshambo() {
		int roll = (int)(Math.random()*3)+1;
		switch(roll){
		case 1:
			return Roshambo.ROCK;
		case 2:
			return Roshambo.PAPER;
		case 3:
			return Roshambo.SCISSORS;
		default:
			return null;
		}
	}
}