package chessgame.board.pieces;
import java.util.ArrayList;
import chessgame.board.pieces.enums.Color;
import java.util.List;


public abstract class Piece {

    private String name;
    private Position position;
    private Color color;
    
    List<Position> possibleMoviments = new ArrayList<>();

    public Piece() {
    }

    
    public Piece(String name, Position position, Color color) {
        this.name = name;
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

   
    public static int setColumn(int column) {
        return 0;
    }

    public static int setRow(int row) {
        return 0;
    }


    public String getName() {
        return name;
    }

    
    
    public abstract String possibleMoivments(Piece piece);

    public abstract List<Position> mover(Piece piece);
        
    


   


}
