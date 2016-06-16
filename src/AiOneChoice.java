public class AiOneChoice extends Player {

	public AiOneChoice(String name) {
		super(name);
	}
	
	Roshambo generateRoshambo(char choice) {
		return Roshambo.Rock;
	}
}