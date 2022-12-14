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
    public List<Position> mover(Piece piece, List<Piece> piecesList) {

    List<Position> posiblePositions = new ArrayList<>();

        
            for(int i = 1 ; i <= 7; i++) {
                if (piece.getPosition().getRow() + i <= 7 && piece.getPosition().getColumn() + i <= 7) {
                posiblePositions.add(new Position(piece.getPosition().getRow() + i, piece.getPosition().getColumn() + i));
                }
            }
            for(int i = 1 ; i <= 7; i++) {
                if (piece.getPosition().getRow() - i >= 0 && piece.getPosition().getColumn() + i <= 7) {
                posiblePositions.add(new Position(piece.getPosition().getRow() - i, piece.getPosition().getColumn() + i));
                }
            }
            for(int i = 8; i >= 1; i--) {
                if(piece.getPosition().getRow() - i >= 0 && piece.getPosition().getColumn() -i >= 0)  {
                posiblePositions.add(new Position(piece.getPosition().getRow() - i, piece.getPosition().getColumn() - i));
                }
            }
            for(int i = 8; i >= 1; i--) {
                if(piece.getPosition().getRow() + i <= 7 && piece.getPosition().getColumn() - i >= 0)  {
                posiblePositions.add(new Position(piece.getPosition().getRow() + i, piece.getPosition().getColumn() - i));
                }
            }



        posiblePositions = someoneInMyWay(piece, posiblePositions, piecesList);
      
     
        return posiblePositions;
    }

    public List<Position> someoneInMyWay(Piece piece, List<Position> posiblePositions, List<Piece> piecesList){

    List<Position> equals = new ArrayList<>();
 

    for(int i = 0; i < piecesList.size(); i++){
        for(int j = 0; j < posiblePositions.size(); j++) {
          if(piecesList.get(i).getColor() == piece.getColor()) {
            if(piecesList.get(i).getPosition().getRow() == posiblePositions.get(j).getRow() && piecesList.get(i).getPosition().getColumn() == posiblePositions.get(j).getColumn()) {
            if(piece.getPosition().getRow() < piecesList.get(i).getPosition().getRow() && piece.getPosition().getColumn() > piecesList.get(i).getPosition().getColumn()) {
                for(int k = 1; k <= 7 - piecesList.get(i).getPosition().getRow(); k++){
                    equals.add(new Position(piecesList.get(i).getPosition().getRow() + k, piecesList.get(i).getPosition().getColumn() - k));
                } 
            } if(piece.getPosition().getRow() > piecesList.get(i).getPosition().getRow() && piece.getPosition().getColumn() > piecesList.get(i).getPosition().getColumn()) {
                for(int k = 1; k <= piecesList.get(i).getPosition().getRow(); k++){
                    equals.add(new Position(piecesList.get(i).getPosition().getRow() - k, piecesList.get(i).getPosition().getColumn() - k));
                }        
            }  if(piece.getPosition().getRow() < piecesList.get(i).getPosition().getRow() && piece.getPosition().getColumn() < piecesList.get(i).getPosition().getColumn()) {
                for(int k = 1; k <= 7 - piecesList.get(i).getPosition().getRow(); k++){
                    equals.add(new Position(piecesList.get(i).getPosition().getRow() + k, piecesList.get(i).getPosition().getColumn() + k));
                }
            } if(piece.getPosition().getRow() > piecesList.get(i).getPosition().getRow() && piece.getPosition().getColumn() < piecesList.get(i).getPosition().getColumn()) {
                for(int k = 1; k <= piecesList.get(i).getPosition().getRow(); k++){
                    equals.add(new Position(piecesList.get(i).getPosition().getRow() - k, piecesList.get(i).getPosition().getColumn() + k));
                }
            }
            posiblePositions.remove(j);
           }
        } else {
            if(piecesList.get(i).getPosition().getRow() == posiblePositions.get(j).getRow() && piecesList.get(i).getPosition().getColumn() == posiblePositions.get(j).getColumn()) {
                if(piece.getPosition().getRow() < piecesList.get(i).getPosition().getRow() && piece.getPosition().getColumn() > piecesList.get(i).getPosition().getColumn()) {
                    for(int k = 1; k <= 7 - piecesList.get(i).getPosition().getRow(); k++){
                        equals.add(new Position(piecesList.get(i).getPosition().getRow() + k, piecesList.get(i).getPosition().getColumn() - k));
                    } 
                } if(piece.getPosition().getRow() > piecesList.get(i).getPosition().getRow() && piece.getPosition().getColumn() > piecesList.get(i).getPosition().getColumn()) {
                    for(int k = 1; k <=  piecesList.get(i).getPosition().getRow(); k++){
                        equals.add(new Position(piecesList.get(i).getPosition().getRow() - k, piecesList.get(i).getPosition().getColumn() - k));
                    }        
                }  if(piece.getPosition().getRow() < piecesList.get(i).getPosition().getRow() && piece.getPosition().getColumn() < piecesList.get(i).getPosition().getColumn()) {
                    for(int k = 1; k <= 7 - piecesList.get(i).getPosition().getRow(); k++){
                        equals.add(new Position(piecesList.get(i).getPosition().getRow() + k, piecesList.get(i).getPosition().getColumn() + k));
                    }
                } if(piece.getPosition().getRow() > piecesList.get(i).getPosition().getRow() && piece.getPosition().getColumn() < piecesList.get(i).getPosition().getColumn()) {
                    for(int k = 1; k <= piecesList.get(i).getPosition().getRow(); k++){
                        equals.add(new Position(piecesList.get(i).getPosition().getRow() - k, piecesList.get(i).getPosition().getColumn() + k));
                    }
                }
               }
        }
    }
}

for(int l = 0; l < equals.size(); l++){
    for(int j = 0; j < posiblePositions.size(); j++){
    if(posiblePositions.get(j).getRow() == equals.get(l).getRow() && posiblePositions.get(j).getColumn() == equals.get(l).getColumn()) {
        posiblePositions.remove(j);
    }
    }
}  
return posiblePositions;        
}

}

