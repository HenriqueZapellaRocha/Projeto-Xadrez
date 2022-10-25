package chessgame.board.pieces;
import java.util.ArrayList;
import java.util.List;

import chessgame.board.pieces.enums.Color;

public class Rook extends Piece {

    public Rook(String name, Position position, Color color) {
        super(name, position, color);
    }

    public Rook() {
    }

    @Override
    public List<Position> mover(Piece piece, List<Piece> piecesList) {
        List<Position> posiblePositions = new ArrayList<>();

        for(int i = piece.getPosition().getRow(); i < 7; i++) {
        posiblePositions.add(new Position(i + 1, piece.getPosition().getColumn()));
            
        }
        for(int i = piece.getPosition().getRow(); i > 0; i--) {
        posiblePositions.add(new Position(i - 1, piece.getPosition().getColumn()));
      
    }
        for(int i = piece.getPosition().getColumn(); i < 7; i++){
                posiblePositions.add(new Position(piece.getPosition().getRow(), i + 1 )); 
        
        }
       
        for(int i = piece.getPosition().getColumn(); i > 0 ; i--) {
                posiblePositions.add(new Position(piece.getPosition().getRow(), i -1 ));
        
        }
      
    return posiblePositions;
    }

}

