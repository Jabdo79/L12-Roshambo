public class AiRock extends Player {

	public AiRock(String name) {
		super(name);
	}
	
	Roshambo generateRoshambo() {
		return Roshambo.ROCK;
	}
}