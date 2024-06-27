package league;

public abstract class Club {
	public abstract void clubName();
	public abstract void stadium();
	public abstract void manager();
	public abstract void netWorth();
	public abstract void captain();
	public abstract void players();
	public final void league() {
		System.out.println("La Liga");
	}
	public abstract void leagueTitles();
	public abstract void clubDetails();
	public abstract void overview();
}

