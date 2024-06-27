package league;

import java.util.Scanner;

public class ProcessingFanClub {
	Scanner sc = new Scanner(System.in);
	Scanner scint = new Scanner(System.in);
	
	public Fan fanData() {
		System.out.println("Enter Name");
		String name = sc.nextLine();
		System.out.println("Enter age");
		int age = scint.nextInt();
		System.out.println("Enter email");
		String email = sc.nextLine();
		return new Fan(name, age, email);
	}
	
	public Club getClub(Fan fan) {
		System.out.println("Enter Your Favourite Club");
		String club = sc.nextLine();
		if(club.equalsIgnoreCase("Barcelona")) {
			return new Barcelona(fan);
		}
		else if(club.equalsIgnoreCase("Real Madrid")) {
			return new RealMadrid(fan);
		}
		else {
			return null;
		}
	}
}
