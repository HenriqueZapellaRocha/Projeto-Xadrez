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
        if(piece.getColor().toString().equals("WHITE")){
            if(piece.getPosition().getRow() != 0) {
           positions.add(new Position(piece.getPosition().getRow() - 1, piece.getPosition().getColumn()));
           
                }
            } else{
                if(piece.getPosition().getRow() != 7) {
                    positions.add(new Position(piece.getPosition().getRow() + 1, piece.getPosition().getColumn()));
    
                 }
                }
        
        positions = someoneInMyWay(piece, positions, piecesList);
        return positions;
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


