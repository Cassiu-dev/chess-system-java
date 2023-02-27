package boardgame;

public class Board {
	
	private int rows;
	private int collumns;
	
	protected Piece[][] pieces;

	public Board(int row, int collumns) {
		
		this.rows = rows;
		this.collumns = collumns;
		pieces = new Piece[rows][collumns];
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getCollumns() {
		return collumns;
	}

	public void setCollumns(int collumns) {
		this.collumns = collumns;
	}
	
	
	
	

}
