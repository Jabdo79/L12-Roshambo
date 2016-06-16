
public class AiScissors extends Player {

	public AiScissors(String name) {
		super(name);
	}

	Roshambo generateRoshambo() {
		return Roshambo.SCISSORS;
	}

}
