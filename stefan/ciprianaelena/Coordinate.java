package stefan.ciprianaelena;

public class Coordinate {
	// we have firstly the column and after the line in a coordinate!!!!
	private int ligne, column;
	private static final char caracterInitial = 'A';
	// it cannot be changed
	// ASCII code for A = 65

	public int getLigne() {
		return ligne;
	}

	public void setLigne(int ligne) {
		this.ligne = ligne;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public Coordinate(int column, int ligne) {
		this.column = column;
		this.ligne = ligne;
	}

	public Coordinate(String coordinates) {
		// A coordinate is like 'A1', 'D2' etc.
		// chatAt(0) takes the first letter of a coordinate 'A0" -> A this is the column
		//System.out.println("coordinatessss - "+coordinates);
		this.column = coordinates.toUpperCase().charAt(0) - caracterInitial;
		this.ligne = Integer.parseInt(coordinates.substring(1, 2));
		//System.out.println(this.column + " " + this.ligne);
	}
	
	public Coordinate(Coordinate startCoord, Coordinate endCoord) {
		startCoord = new Coordinate(startCoord.getColumn(), startCoord.getLigne());
		endCoord =  new Coordinate(endCoord.getColumn(), endCoord.getLigne());
	}

	public int isOK() {
		 int i = 0;
		if(this.column >= 0 && this.column < 10 && this.ligne >= 0 && this.ligne < 10) {
			return i = 1;
		}else
			return i = 0;
	}

	public boolean isInGrid(String coord) {
		int column;
		int ligne;
		try {
			column = coord.toUpperCase().charAt(0) - caracterInitial;
			ligne = Integer.parseInt(coord.substring(1));
			return column >= 0 && column < 10 && ligne >= 0 && ligne < 10;

		} catch (Exception e) {
			System.out.println("WRONG Coordinates! Try again!");
		}
		return false;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;

		Coordinate other = (Coordinate) obj;
		if (column != other.column || ligne != other.ligne)
			return false;
		return true;
	}

	@Override
	public String toString() {
		String coordinates = new String();
		coordinates = coordinates + (char) (column + caracterInitial) + ligne;
		return coordinates;
	}

}
