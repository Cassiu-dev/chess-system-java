package boardgame;

public class Board {
	
	private int rows;
	private int collumns;
	
	protected Piece[][] pieces;

	public Board(int rows, int collumns) {
		
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
	
	
	public Piece piece (int rows , int collumns) {
		return pieces[rows][collumns];
	}
	
	public Piece piece (Position position) {
		return pieces[position.getRow()][position.getColumn()];
		
	}
	
	public void placePiece(Piece piece, Position position) {
		pieces[position.getRow()][position.getRow()] = piece;
		piece.position = position;
		
	}
	
	
	

}
