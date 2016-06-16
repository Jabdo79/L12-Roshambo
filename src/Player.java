
public abstract class Player {
	private String name;
	private Roshambo rps;
	private int wins = 0, draws = 0, losses = 0;
	
	public Player(String name){
		this.name = name;
	}
	
	abstract Roshambo generateRoshambo();

	public String getName() {
		return name;
	}

	public Roshambo getRps() {
		return rps;
	}
	
	public void setRps(Roshambo choice){
		this.rps = choice;
	}
	
	public void win(){
		wins++;
	}
	
	public void draw(){
		draws++;
	}

	public void loss(){
		losses++;
	}
	
	public void stats(){
		System.out.println("Wins: "+wins+" Draws: "+draws+" Losses: "+losses);
	}
}
