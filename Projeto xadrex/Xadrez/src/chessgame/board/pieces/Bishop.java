package chessgame.board.pieces;
import java.util.ArrayList;
import java.util.List;
import chessgame.board.pieces.enums.Color;

public class Bishop extends Piece {

    public Bishop() {
    }

    public Bishop(String name, Position position, Color color) {
        super(name, position, color);
    }


    @Override
    public List<Position> mover(Piece piece) {

    List<Position> posiblePositions = new ArrayList<>();

        
            for(int i = 0 ; i <= 7; i++) {
            if (piece.getPosition().getRow() + i <= 7 && piece.getPosition().getColumn() + i <= 7) {
            posiblePositions.add(new Position(piece.getPosition().getRow() + i, piece.getPosition().getColumn() + i));
            }
            }
            for(int i = 7; i >= 0; i--) {
            if(piece.getPosition().getRow() - i >= 0 && piece.getPosition().getColumn() -i >= 0)  {
                posiblePositions.add(new Position(piece.getPosition().getRow() - i, piece.getPosition().getColumn() - i));
            }
        }
      
     
        return posiblePositions;
    }

    

    
    
}
