public class User extends Player {

	public User(String name) {
		super(name);
	}
	
	Roshambo generateRoshambo() {
		return this.getRps();
	}
}