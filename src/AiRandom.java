
public class AiRandom extends Player {

	public AiRandom(String name) {
		super(name);
	}

	void generateRoshambo(char choice) {
		int roll = (int)(Math.random()*3)+1;
		switch(roll){
		case 1:
			setRps(Roshambo.Rock);
			break;
		case 2:
			setRps(Roshambo.Paper);
			break;
		case 3:
			setRps(Roshambo.Scissors);
			break;
		}
	}
}