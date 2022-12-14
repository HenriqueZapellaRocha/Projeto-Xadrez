package chessgame.board.pieces;
import java.util.ArrayList;
import java.util.List;
import chessgame.board.pieces.enums.Color;


public class King extends Piece {

    public King(String name, Position position, Color color) {
        super(name, position, color);
    }

    public King() {
    }


    @Override
    public List<Position> mover(Piece piece, List<Piece> piecesList) {

    List<Position> possiblePositions = new ArrayList<>();
    
    // upper moviment and down moviment
    if(piece.getPosition().getRow() + 1 != 8){
    possiblePositions.add(new Position(piece.getPosition().getRow() + 1, piece.getPosition().getColumn()));
    }
    if(piece.getPosition().getRow() -1 != -1){
    possiblePositions.add(new Position(piece.getPosition().getRow() - 1, piece.getPosition().getColumn()));
    }

    // right and left moviment  
    if(piece.getPosition().getColumn() + 1 != 8) {
    possiblePositions.add(new Position(piece.getPosition().getRow(), piece.getPosition().getColumn() + 1));    
    }
    if(piece.getPosition().getColumn() - 1 != -1) {
    possiblePositions.add(new Position(piece.getPosition().getRow(), piece.getPosition().getColumn() - 1));    
    }

    // diagonal moviment

    if(piece.getPosition().getRow() + 1 != 8 && piece.getPosition().getColumn() + 1 != 8 ) {
    possiblePositions.add(new Position(piece.getPosition().getRow() + 1, piece.getPosition().getColumn() + 1));
    }
    if(piece.getPosition().getRow() - 1 != -1 && piece.getPosition().getColumn() + 1 != 8 ) {
    possiblePositions.add(new Position(piece.getPosition().getRow() - 1, piece.getPosition().getColumn() + 1));
    }
    if(piece.getPosition().getRow() - 1 != -1 && piece.getPosition().getColumn() + 1 != 8 ) {
        possiblePositions.add(new Position(piece.getPosition().getRow() - 1, piece.getPosition().getColumn() - 1));
        }
    if(piece.getPosition().getRow() + 1 != 8 && piece.getPosition().getColumn() - 1 != -1 ) {
    possiblePositions.add(new Position(piece.getPosition().getRow() + 1, piece.getPosition().getColumn() - 1));
    }

    
    possiblePositions = someoneInMyWay(piece, possiblePositions, piecesList);
 

        return possiblePositions;
    }
    
    public List<Position> someoneInMyWay(Piece piece, List<Position> posiblePositions, List<Piece> piecesList){

        for(int i =0; i < piecesList.size(); i++){
            for(int j = 0; j < posiblePositions.size(); j++) {
                if(piecesList.get(i).getColor() == piece.getColor()) {
                if(piecesList.get(i).getPosition().getRow() == posiblePositions.get(j).getRow() && piecesList.get(i).getPosition().getColumn() == posiblePositions.get(j).getColumn()) {
                posiblePositions.remove(j);
                }
                }
            }
            }   
        
        return posiblePositions;
    }
    

}
