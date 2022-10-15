package chessgame.board.pieces;
import chessgame.board.pieces.enums.Color;


public class Piece {

    private Position position;
    private Color color;

    public Piece() {
    }

    public Piece(Position position, Color color) {
        this.position = position;
        this.color = color;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Color getColor() {
        return color;
    }    

    public String possibleMoviment(Position position) {
        return null;
    
    }

    public static int setColumn(int column) {
        return 0;
    }

    public static int setRow(int row) {
        return 0;
    }
    
}
