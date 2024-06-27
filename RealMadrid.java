package league;

import java.util.Scanner;

public class RealMadrid extends Club{
	
	private String players[] = {
			"Thibaut Courtois",
			"Andriy Lunin",
			"Kepa",
			"Dani Carvajal",
			"Eder Militão",
			"Ferland Mendy",
			"Nacho",
			"Antonio Rüdiger",
			"Jude Bellingham",
			"Eduardo Camavinga",
			"Brahim Díaz",
			"Arda Güler",
			"Toni Kroos",
			"Luka Modrić",
			"Aurélien Tchouaméni",
			"Federico Valverde",
			"Joselu",
			"Rodrygo",
			"Vinícius Junior",
		};
	
	public RealMadrid(Fan f) {
		System.out.println("----------------------------------------------------------");
		System.out.println("Congratulations to " + f.name + " you are a Madridista");
		System.out.println("Hala Madrid");
		f.fanDetails();
		System.out.println("----------------------------------------------------------");
	}
	
	@Override
	public void clubName() {
		System.out.println("----------------------------------------------------------");
		System.out.println("Real Madrid CF");
		System.out.println("----------------------------------------------------------");
	}
	@Override
	public void stadium() {
		System.out.println("----------------------------------------------------------");
		System.out.println("Santiago Bernabéu");
		System.out.println("----------------------------------------------------------");
	}
	@Override
	public void manager() {
		System.out.println("----------------------------------------------------------");
		System.out.println("Carlo Ancelotti");
		System.out.println("----------------------------------------------------------");
	}
	@Override
	public void netWorth() {
		System.out.println("----------------------------------------------------------");
		System.out.println("$6.07 billion USD");
		System.out.println("----------------------------------------------------------");
	}
	@Override
	public void captain() {
		System.out.println("----------------------------------------------------------");
		System.out.println("Nacho");
		System.out.println("----------------------------------------------------------");
	}
	@Override
	public void leagueTitles() {
		System.out.println("----------------------------------------------------------");
		System.out.println("36 Laliga Titles");
		System.out.println("----------------------------------------------------------");
	}
	@Override
	public void clubDetails() {
		System.out.println("----------------------------------------------------------");
		System.out.println("Origin : Spain");
		System.out.println("Founded in the Year 1902");
		System.out.println("Club Legends - Zidane, Beckham, Ronaldo Nazario, Cristiano Ronaldo, Benzema, Ramos, Kroos, Modric etc.");
		System.out.println("14 Champions League Titles");
		System.out.println("5 Club World Cup Titles");
		System.out.println("----------------------------------------------------------");
	}
	@Override
	public void players() {
		System.out.println("----------------------------------------------------------");
		for(int i=0;i < players.length;i++) {
			System.out.println(players[i]);
		}
		System.out.println("----------------------------------------------------------");
	}
	Scanner sc = new Scanner(System.in);
	@Override
	public void overview() {
		while(true) {
			System.out.println("Select Operations :- ");
			System.out.println("1. club , 2. details , 3. players , 4. manager , 5. captain , 6. stadium , 7. newWorth , 8. titles , 9. exit");
			String operation = sc.nextLine();
			if(operation.equalsIgnoreCase("club")) {
				clubName();
			}
			else if(operation.equalsIgnoreCase("details")) {
				clubDetails();
			}
			else if(operation.equalsIgnoreCase("players")) {
				players();
			}
			else if(operation.equalsIgnoreCase("manager")) {
				manager();
			}
			else if(operation.equalsIgnoreCase("captain")) {
				captain();
			}
			else if(operation.equalsIgnoreCase("stadium")) {
				stadium();
			}
			else if(operation.equalsIgnoreCase("netWorth")) {
				netWorth();
			}
			else if(operation.equalsIgnoreCase("titles")) {
				leagueTitles();
			}
			else if(operation.equalsIgnoreCase("exit")) {
				break;
			}
			else {
				System.out.println("Select Proper operation");
			}
		}
	}
}

