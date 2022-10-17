package chessgame.board.pieces;
import java.util.List;

import chessgame.board.pieces.enums.Color;

public class King extends Piece {

    public King(String name, Position position, Color color) {
        super(name, position, color);
    }

    public King() {
    }

    @Override
    public String possibleMoivments(Piece piece) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Position> mover(Piece piece) {
        // TODO Auto-generated method stub
        return null;
    }
    
    

}
