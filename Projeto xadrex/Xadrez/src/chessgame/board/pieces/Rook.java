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
      
        posiblePositions = someoneInMyWay(piece, posiblePositions, piecesList);

    return posiblePositions;
    }

    public List<Position> someoneInMyWay(Piece piece, List<Position> posiblePositions, List<Piece> piecesList){

        List<Position> remover = new ArrayList<>();

        for(int i =0; i < piecesList.size(); i++){
            for(int j = 0; j < posiblePositions.size(); j++) {
                if(piecesList.get(i).getColor() == piece.getColor()) {
                if(piecesList.get(i).getPosition().getRow() == posiblePositions.get(j).getRow() && piecesList.get(i).getPosition().getColumn() == posiblePositions.get(j).getColumn()) {
                    if(piecesList.get(i).getPosition().getRow() > piece.getPosition().getRow() && piecesList.get(i).getPosition().getColumn() == piece.getPosition().getColumn()) {
                        for(int k = 0; k < 8 - piecesList.get(i).getPosition().getRow(); k++) {
                        remover.add(new Position(piecesList.get(i).getPosition().getRow() + k, piecesList.get(i).getPosition().getColumn()));
                        }
                    }  if(piecesList.get(i).getPosition().getRow() < piece.getPosition().getRow() && piecesList.get(i).getPosition().getColumn() == piece.getPosition().getColumn()) {
                        for(int k = 1; k <= piecesList.get(i).getPosition().getRow(); k++) {
                        remover.add(new Position(piecesList.get(i).getPosition().getRow() - k, piecesList.get(i).getPosition().getColumn()));
                        }
                    }  if(piecesList.get(i).getPosition().getRow() == piece.getPosition().getRow() && piecesList.get(i).getPosition().getColumn() > piece.getPosition().getColumn()) {
                        for(int k = 1; k < 8 - piecesList.get(i).getPosition().getColumn(); k++) {
                        remover.add(new Position(piecesList.get(i).getPosition().getRow(),  piecesList.get(i).getPosition().getColumn() + k));
                        }
                    } if(piecesList.get(i).getPosition().getRow() == piece.getPosition().getRow() && piecesList.get(i).getPosition().getColumn() < piece.getPosition().getColumn()) {
                        for(int k = 1; k <= 7 ; k++) {
                        remover.add(new Position(piecesList.get(i).getPosition().getRow(), piecesList.get(i).getPosition().getColumn() - k));
                        }
                    }
    
                    posiblePositions.remove(j);
                }
                } else {
                    if(piecesList.get(i).getPosition().getRow() == posiblePositions.get(j).getRow() && piecesList.get(i).getPosition().getColumn() == posiblePositions.get(j).getColumn()) {
                        if(piecesList.get(i).getPosition().getRow() > piece.getPosition().getRow() && piecesList.get(i).getPosition().getColumn() == piece.getPosition().getColumn()) {
                            for(int k = 0; k < 8 - piecesList.get(i).getPosition().getRow(); k++) {
                            remover.add(new Position(piecesList.get(i).getPosition().getRow() + k, piecesList.get(i).getPosition().getColumn()));
                            }
                        }  if(piecesList.get(i).getPosition().getRow() < piece.getPosition().getRow() && piecesList.get(i).getPosition().getColumn() == piece.getPosition().getColumn()) {
                            for(int k = 1; k <= piecesList.get(i).getPosition().getRow(); k++) {
                            remover.add(new Position(piecesList.get(i).getPosition().getRow() - k, piecesList.get(i).getPosition().getColumn()));
                            }
                        }  if(piecesList.get(i).getPosition().getRow() == piece.getPosition().getRow() && piecesList.get(i).getPosition().getColumn() > piece.getPosition().getColumn()) {
                            for(int k = 1; k < 8 - piecesList.get(i).getPosition().getColumn(); k++) {
                            remover.add(new Position(piecesList.get(i).getPosition().getRow(),  piecesList.get(i).getPosition().getColumn() + k));
                            }
                        } if(piecesList.get(i).getPosition().getRow() == piece.getPosition().getRow() && piecesList.get(i).getPosition().getColumn() < piece.getPosition().getColumn()) {
                            for(int k = 1; k <= 7 ; k++) {
                            remover.add(new Position(piecesList.get(i).getPosition().getRow(), piecesList.get(i).getPosition().getColumn() - k));
                            }
                        }
                    }    
                }
       
            }   
    }

    for(int l = 0; l < remover.size(); l++){
        for(int j = 0; j < posiblePositions.size(); j++){
        if(posiblePositions.get(j).getRow() == remover.get(l).getRow() && posiblePositions.get(j).getColumn() == remover.get(l).getColumn()) {
            posiblePositions.remove(j);
        }
        }
    }  
    return posiblePositions;
}

}

