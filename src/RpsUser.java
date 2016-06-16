
public class RpsUser extends Player {

	public RpsUser(String name) {
		super(name);
	}

	Roshambo generateRoshambo(char choice) {
		switch(choice){
		case 'R':
			return Roshambo.ROCK;
		case 'P':
			return Roshambo.PAPER;
		case 'S':
			return Roshambo.SCISSORS;
		default:
			return null;
		}
	}

}
