package chessgame.board.pieces;
import chessgame.board.pieces.enums.Color;
import java.util.ArrayList;
import java.util.List;




public class Pawn extends Piece {

    private int firstTry;

    public Pawn(String name, Position position, Color color) {
        super(name, position, color);
    }

    public Pawn() {
    }


    public int getFirstTry() {
        return firstTry;
    }

    public void setFirstTry(int firstTry) {
        this.firstTry = firstTry;
    }

    @Override
    public List<Position> mover(Piece piece, List<Piece> piecesList) {
        List<Position> positions = new ArrayList<>();

        if(firstTry != 2) {
            if(piece.getColor().toString().equals("WHITE")){
               
               positions.add(new Position(piece.getPosition().getRow() - 2, piece.getPosition().getColumn()));
                
                } else{
                  
                        positions.add(new Position(piece.getPosition().getRow() + 2, piece.getPosition().getColumn()));
        
                     
                    }
                    
                    if(piece.getColor().toString().equals("WHITE")){
                       
                       positions.add(new Position(piece.getPosition().getRow() - 1, piece.getPosition().getColumn()));
                       
                            
                        } else{
                           
                                positions.add(new Position(piece.getPosition().getRow() + 1, piece.getPosition().getColumn()));
                
                             
                            }

                    firstTry++;
        } else {
            if(piece.getColor().toString().equals("WHITE")){
            if(piece.getPosition().getRow() - 1 >= 0) {
           positions.add(new Position(piece.getPosition().getRow() - 1, piece.getPosition().getColumn()));
           
                }
            } else{
              
                    positions.add(new Position(piece.getPosition().getRow() + 1, piece.getPosition().getColumn()));
    
                 
                }
            }
        positions = someoneInMyWay(piece, positions, piecesList);

        return positions;
    }



    public List<Position> someoneInMyWay(Piece piece, List<Position> posiblePositions, List<Piece> piecesList){
        
        boolean first = true;

        List<Position> enPassant = new ArrayList<>();

        for(int i = 0; i < piecesList.size(); i++){
            for(int j = 0; j < posiblePositions.size(); j++) {
                if(piecesList.get(i).getPosition().getRow() == posiblePositions.get(j).getRow() && piecesList.get(i).getPosition().getColumn() == posiblePositions.get(j).getColumn()) {
                    posiblePositions.remove(j);
                    if(first == true) { // en passant
                        for(int k = 0; k < piecesList.size() ; k++) { 
                            if(piecesList.get(k).getPosition().getRow()  == piece.getPosition().getRow() + 1 && piecesList.get(k).getPosition().getColumn() ==  piece.getPosition().getColumn() + 1) {
                               enPassant.add(new Position(piece.getPosition().getRow() + 1, piece.getPosition().getColumn() + 1));
                               
                            }
                        }
                        first = false;
                    }
            }
            }   
        }
        
  // add en passant possible moviemnts 
  if(first == false) {      
  for(int i = 0; i < enPassant.size(); i++) {
    posiblePositions.add(new Position(enPassant.get(i).getRow(), enPassant.get(i).getColumn()));
  }
}     

        return posiblePositions;
    }


}


