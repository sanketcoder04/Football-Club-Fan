package league;

public class ClubMain {
	public static void main(String[] args) {
		ProcessingFanClub pfc = new ProcessingFanClub();
		
		Fan fan = pfc.fanData();
		Club club = pfc.getClub(fan);
		
		if(club == null) {
			System.out.println("Sorry, This Club is not in the Records");
		}
		else {
			club.overview();
		}
	}
}
