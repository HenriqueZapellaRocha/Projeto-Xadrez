package chessgame.board.pieces;
import java.util.ArrayList;
import java.util.List;
import chessgame.board.pieces.enums.Color;

public class Queen extends Piece {

    public Queen(String name, Position position, Color color) {
        super(name, position, color);
    }

    public Queen() {
    }


    @Override
    public List<Position> mover(Piece piece, List<Piece> piecesList) {

            List<Position> posiblePositions = new ArrayList<>();
        
           // Rook moviment
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

        // bishop moviment

        for(int i = 0 ; i <= 7; i++) {
            if (piece.getPosition().getRow() + i <= 7 && piece.getPosition().getColumn() + i <= 7) {
            posiblePositions.add(new Position(piece.getPosition().getRow() + i, piece.getPosition().getColumn() + i));
            }
        }
        for(int i = 0 ; i <= 7; i++) {
            if (piece.getPosition().getRow() - i >= 0 && piece.getPosition().getColumn() + i <= 7) {
            posiblePositions.add(new Position(piece.getPosition().getRow() - i, piece.getPosition().getColumn() + i));
            }
        }
        for(int i = 7; i >= 0; i--) {
            if(piece.getPosition().getRow() - i >= 0 && piece.getPosition().getColumn() -i >= 0)  {
            posiblePositions.add(new Position(piece.getPosition().getRow() - i, piece.getPosition().getColumn() - i));
            }
        }
        for(int i = 7; i >= 0; i--) {
            if(piece.getPosition().getRow() + i <= 7 && piece.getPosition().getColumn() - i >= 0)  {
            posiblePositions.add(new Position(piece.getPosition().getRow() + i, piece.getPosition().getColumn() - i));
            }
        }

        return posiblePositions;
    }
    
    

}
