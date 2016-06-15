public class AiOneChoice extends Player {

	public AiOneChoice(String name) {
		super(name);
	}
	
	void generateRoshambo(char choice) {
		setRps(Roshambo.Rock);
	}
}