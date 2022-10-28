package chessgame.board.pieces;
import java.util.ArrayList;
import java.util.List;

import chessgame.board.pieces.enums.Color;

public class Knight extends Piece {

    public Knight(String name, Position position, Color color) {
        super(name, position, color);
    }

    public Knight() {
    }


    @Override
    public List<Position> mover(Piece piece, List<Piece> piecesList) {
        List<Position> possiblePositions = new ArrayList<>();

        if(piece.getPosition().getColumn() + 1 <= 7 && piece.getPosition().getRow() + 2 <= 7) {
        possiblePositions.add(new Position(piece.getPosition().getRow() + 2, piece.getPosition().getColumn() + 1));
        }
        if(piece.getPosition().getColumn() - 1 >= 0 && piece.getPosition().getRow() + 2 <= 7) {
        possiblePositions.add(new Position(piece.getPosition().getRow() + 2, piece.getPosition().getColumn() - 1));
        }
        if(piece.getPosition().getColumn() + 1 <= 7 && piece.getPosition().getRow() + 2 <= 7) {
         possiblePositions.add(new Position(piece.getPosition().getRow() + 2, piece.getPosition().getColumn() + 1));
         }    
        if(piece.getPosition().getColumn() - 1 >= 0 && piece.getPosition().getRow() - 2 >= 0) {
            possiblePositions.add(new Position(piece.getPosition().getRow() - 2, piece.getPosition().getColumn() - 1));
        }
        if(piece.getPosition().getColumn() + 1 <= 7 && piece.getPosition().getRow() - 2 >= 0) {
            possiblePositions.add(new Position(piece.getPosition().getRow() - 2, piece.getPosition().getColumn() + 1));
        }
        


        return possiblePositions;
    }
    
    

}
