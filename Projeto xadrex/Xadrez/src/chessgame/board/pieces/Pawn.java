package chessgame.board.pieces;
import chessgame.board.ChessBoard;
import chessgame.board.pieces.enums.Color;

import java.util.List;

import chessgame.ChessRuler;


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
    public String possibleMoivments(Piece piece) {
        String possibleMoviment = "";
        if(piece.getColor().toString().equals("WHITE")){
            if(piece.getPosition().getRow() != 0) {
            possibleMoviment += piece.getPosition().getRow() + 1;
            possibleMoviment += piece.getPosition().getColumn();
                }
            } else{
                if(piece.getPosition().getRow() != 7) {
                possibleMoviment += piece.getPosition().getRow() - 1;
                possibleMoviment += piece.getPosition().getColumn();
                    }
                }
        
        return possibleMoviment;
    }


    
    
    
}
