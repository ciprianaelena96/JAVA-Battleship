package stefan.ciprianaelena;

import java.util.ArrayList;

public class Player {

	private String nameP;
	private ArrayList<Coordinate> listOfCoordShip;
	private ArrayList<Coordinate> CoordHits;
	private ArrayList<Coordinate> CoordMissed;
	private ArrayList<Ship> Ships;

	public Player(String nameP) {
		this.nameP = nameP;
		listOfCoordShip = new ArrayList<>();
		CoordHits = new ArrayList<>();
		CoordMissed = new ArrayList<>();
		Ships = new ArrayList<>();
	}

	public String getNamePlayer() {
		return nameP;
	}

	public void setNamePlayer(String nameP) {
		this.nameP = nameP;
	}

	public ArrayList<Coordinate> getListOfCoordShip() {
		return listOfCoordShip;
	}

	public ArrayList<Coordinate> getCoordHits() {
		return CoordHits;
	}

	public ArrayList<Coordinate> getCoordMissed() {
		return CoordMissed;
	}

	public ArrayList<Ship> getShips() {
		return Ships;
	}

	public void addShipCoord(Ship s) {
		for (Coordinate coord : s.getCoordShips()) {
			listOfCoordShip.add(coord);
		}
	}

	public char showO(char x, int y) {
		char car = '-';
		for (Coordinate coo : this.listOfCoordShip) {
			if (x == coo.getColumn() && y == coo.getLigne()) {
				car = 'o';
			}
		}
		return car;
	}

	public String showMyGrid() {

		String result = "";

		result += "   ";
		for (char c = 'A'; c <= 'J'; c++) {
			result += "  " + c + "  ";
		}
		result += "\n";
		for (int i = 0; i < 10; i++) {
			if (i == 10) {
				result += i + " ";
			} else {
				result += i + "  ";
			}

			result += "  " + showO('A', i) + "  ";
			result += "  " + showO('B', i) + "  ";
			result += "  " + showO('C', i) + "  ";
			result += "  " + showO('D', i) + "  ";
			result += "  " + showO('E', i) + "  ";
			result += "  " + showO('F', i) + "  ";
			result += "  " + showO('G', i) + "  ";
			result += "  " + showO('H', i) + "  ";
			result += "  " + showO('I', i) + "  ";
			result += "  " + showO('J', i) + "  ";
			result += "\n";

		}
		return result;
	}
	
	

}
