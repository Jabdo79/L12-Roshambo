
public class RpsUser extends Player {

	public RpsUser(String name) {
		super(name);
	}

	Roshambo generateRoshambo(char choice) {
		switch(choice){
		case 'R':
			return Roshambo.Rock;
		case 'P':
			return Roshambo.Paper;
		case 'S':
			return Roshambo.Scissors;
		default:
			return null;
		}
	}

}
