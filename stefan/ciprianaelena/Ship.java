package stefan.ciprianaelena;

import java.util.ArrayList;

public class Ship {

	/*
	 * NameofShip SizeOfShip : Carrier 5 Battleship 4 Cruiser 3 Submarine 3
	 * Destroyer 2
	 */

	private Coordinate startCoord;
	private Coordinate endCoord;

	protected ArrayList<Coordinate> coordShips;
	private ArrayList<Coordinate> hitCases;
	private int nbTouchees; // de cate ori a fost atinsa

	private TypeShip type; // type of the ship

	public Coordinate getStartCoord() {
		return startCoord;
	}

	public void setStartCoord(Coordinate startCoord) {
		this.startCoord = startCoord;
	}

	public Coordinate getEndCoord() {
		return endCoord;
	}

	public void setEndCoord(Coordinate endCoord) {
		this.endCoord = endCoord;
	}

	public ArrayList<Coordinate> getHitCases() {
		return hitCases;
	}

	public void setHitCases(ArrayList<Coordinate> hitCases) {
		this.hitCases = hitCases;
	}
	
	public ArrayList<Coordinate> getCoordShips() {
		return coordShips;
	}

	public void setCoordShips(ArrayList<Coordinate> coordShips) {
		this.coordShips = coordShips;
	}

	public int getNbTouchees() {
		return nbTouchees;
	}

	public void setNbTouchees(int nbTouchees) {
		this.nbTouchees = nbTouchees;
	}

	public TypeShip getType() {
		return type;
	}

	public void setType(TypeShip type) {
		this.type = type;
	}

	/*
	 * constructor with the endCoord calculated in fonction of the type of the ship
	 * and if it is vertical or not
	 */

	public Ship(Coordinate startCoord, int shipSize, int isVertical) {
		this.startCoord = startCoord;
		
		coordShips = new ArrayList<Coordinate>();
		
			if (isVertical == 1) {
				this.endCoord = new Coordinate(this.startCoord.getColumn(), this.startCoord.getLigne() + shipSize - 1);
				//System.out.println(endCoord);
				int i= shipSize;
				while(i!=0) {
					i--;
					this.endCoord = new Coordinate(this.startCoord.getColumn(), this.startCoord.getLigne()+ i);
					coordShips.add(endCoord);
				}
				System.out.println(coordShips);
			} else if (isVertical == 2) {
				this.endCoord = new Coordinate(this.startCoord.getColumn() + shipSize - 1, this.startCoord.getLigne());
				int i= shipSize;
				while(i!=0) {
					i--;
					this.endCoord = new Coordinate(this.startCoord.getColumn() + i, this.startCoord.getLigne());
					coordShips.add(endCoord);
				}	
				System.out.println(coordShips);
				
			}

		hitCases = new ArrayList<Coordinate>();
		nbTouchees = 0; // de cate ori a fost atinsa
	}
	
	public String showListCoordShips() {
		String result ="";
		for (int i = 0; i < coordShips.size(); i++) {
			Coordinate c = coordShips.get(i);
			result+="\nColoana " + c.getColumn() + "  ,   Ligne " + c.getLigne()+ "\n";
		}
		return result;

	}
	

	@Override
	public String toString() {
		return "Ship [startCoord=" + startCoord + ", endCoord=" + endCoord + ", type=" + type + "]";
	}

}
