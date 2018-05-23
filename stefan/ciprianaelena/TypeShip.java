package stefan.ciprianaelena;

public enum TypeShip {
	Carrier("Carrier", 5), 
	Battleship("Battleship", 4), 
	Cruiser("Cruiser", 3), 
	Submarine("Submarine",3), 
	Destroyer("Destroyer", 2);
	
	private String name = "";
	private int shipSize;
	
	TypeShip(String name, int shipSize){
		this.name = name;
		this.shipSize = shipSize;
	}
	
	public int getShipSize() {
		return shipSize;
	}
	
	public String getNameShip() {
		return name;
	}
	public String toString() {
		return "Type of Ship{" + "Name = " + name + '\'' + ", size of ship = " + shipSize + '}';
	}
}
