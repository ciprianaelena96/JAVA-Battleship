package stefan.ciprianaelena;

import java.util.Scanner;

public class Battleship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tur = 5;

		System.out.println("BATTLESHIP GAME!");
		System.out.println("Player name is ...\t");
		Scanner s = new Scanner(System.in);
		Player p = new Player(s.nextLine());
		Coordinate coordonata;

		while (tur > 0) {
			System.out.println("Welcome " + p.getNamePlayer());
			for (TypeShip ship : TypeShip.values()) {
				System.out.println("---------------------------------------------------------");
				System.out.println("Now you can place your ships. ");
				System.out.println("Be careful, the coordinate must be like 'A1' 'B2' etc. " );
				System.out.println("---------------------------------------------------------");
				System.out.println(p.showMyGrid());
				System.out.println("---------------------------------------------------------");

				System.out.println("First ship is : " + ship.getNameShip() + " with the size of "+ ship.getShipSize());
				String str = s.nextLine();
				coordonata = new Coordinate(str);
				int size = ship.getShipSize();
				System.out.println("Position of the ship:\t1 for vertical\t2 for horizontal: ");
				int poz = Integer.parseInt(s.nextLine());
				Ship ss = new Ship(coordonata, size, poz);
				//System.out.println(ss.showListCoordShips());
				System.out.println(p.showMyGrid());
				tur--;
			}
			System.out.println("End of your round!");
		}
		System.out.println("Next player name is ...\t");
		Player p2 = new Player(s.nextLine());
		Coordinate coord;
		while (tur > 0) {
			System.out.println("Welcome " + p.getNamePlayer());
			for (TypeShip ship : TypeShip.values()) {
				System.out.println("---------------------------------------------------------");
				System.out.println("Now you can place your ships. ");
				System.out.println("Be careful, the coordinate must be like 'A1' 'B2' etc. " );
				System.out.println("---------------------------------------------------------");
				System.out.println(p2.showMyGrid());
				System.out.println("---------------------------------------------------------");

				System.out.println("First ship is : " + ship.getNameShip() + " with the size of "+ ship.getShipSize());
				String str = s.nextLine();
				coord = new Coordinate(str);
				int size = ship.getShipSize();
				System.out.println("Position of the ship:\t1 for vertical\t2 for horizontal: ");
				int poz = Integer.parseInt(s.nextLine());
				Ship ss2 = new Ship(coord, size, poz);
				//System.out.println(ss2.showListCoordShips());
				System.out.println(p2.showMyGrid());
				tur--;
			}
			System.out.println("End of your round!");
		}
		System.out.println(p2.showMyGrid());

	}
	
}
