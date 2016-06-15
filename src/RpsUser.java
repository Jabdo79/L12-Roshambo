
public class RpsUser extends Player {

	public RpsUser(String name) {
		super(name);
	}

	void generateRoshambo(char choice) {
		switch(choice){
		case 'R':
			setRps(Roshambo.Rock);
			break;
		case 'P':
			setRps(Roshambo.Paper);
			break;
		case 'S':
			setRps(Roshambo.Scissors);
			break;
		}
	}

}
