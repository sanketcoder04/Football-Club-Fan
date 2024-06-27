package league;

import java.util.Scanner;

public class Barcelona extends Club{
	
	private String players[] = {
			"Marc-André ter Stegen",
			"Ronald Araújo",
			"Jules Koundé",
			"Andreas Christensen",
			"Alejandro Balde",
			"Marcos Alonso",
			"Sergi Roberto",
			"Eric García",
			"Inigo Martinez",
			"Frenkie de Jong",
			"Pedri",
			"Gavi",
			"Franck Kessié",
			"Sergi Roberto",
			"Ilkay Gündogan",
			"Robert Lewandowski",
			"Ferran Torres",
			"Raphinha",
			"Lamine Yamal"
		};
	
	public Barcelona(Fan f) {
		System.out.println("----------------------------------------------------------");
		System.out.println("Congratulations to " + f.name + " you are a Culer");
		System.out.println("Visca el Barca, Visca el Catalunya");
		f.fanDetails();
		System.out.println("----------------------------------------------------------");
	}
	
	@Override
	public void clubName() {
		System.out.println("----------------------------------------------------------");
		System.out.println("FC Barcelona");
		System.out.println("----------------------------------------------------------");
	}
	@Override
	public void stadium() {
		System.out.println("----------------------------------------------------------");
		System.out.println("Camp Nou");
		System.out.println("----------------------------------------------------------");
	}
	@Override
	public void manager() {
		System.out.println("----------------------------------------------------------");
		System.out.println("Xavi Hernández");
		System.out.println("----------------------------------------------------------");
	}
	@Override
	public void netWorth() {
		System.out.println("----------------------------------------------------------");
		System.out.println("$4.6 billion USD");
		System.out.println("----------------------------------------------------------");
	}
	@Override
	public void captain() {
		System.out.println("----------------------------------------------------------");
		System.out.println("Marc-André ter Stegen");
		System.out.println("Sergi Roberto");
		System.out.println("Ronald Araújo");
		System.out.println("Frenkie de Jong");
		System.out.println("----------------------------------------------------------");
	}
	@Override
	public void leagueTitles() {
		System.out.println("----------------------------------------------------------");
		System.out.println("27 Laliga Titles");
		System.out.println("----------------------------------------------------------");
	}
	@Override
	public void clubDetails() {
		System.out.println("----------------------------------------------------------");
		System.out.println("Origin : Spain");
		System.out.println("Founded in the Year 1899");
		System.out.println("Club Legends - Ronaldinho, Cruyff, Puyol, Messi, Suarez, Iniesta, Busquests, Xavi etc.");
		System.out.println("5 Champions League Titles");
		System.out.println("3 Club World Cup Titles");
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

