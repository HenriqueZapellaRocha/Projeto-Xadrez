package chessgame.board;
import java.util.Arrays;

import chessgame.board.pieces.Piece;
import chessgame.board.pieces.Position;

public class ChessBoard {

    private Position positions;
    private Piece pieces;


    public ChessBoard() {
    }

    
    public ChessBoard(Position positions, Piece pieces) {
        this.positions = positions;
        this.pieces = pieces;
    }


    public Position getPositions() {
        return positions;
    }


    public String boarderPrinter() {
        String boardprinted = "";
        Integer[][] chessboard = new Integer[positions.getRow()][positions.getRow()];
        chessboard [pieces.getPosition().getRow()] [pieces.getPosition().getColumn()] = 1;

          for (int i = 0; i < positions.getColumn(); i++) {
           boardprinted += i + 1 + " ";
            for(int j = 0; j < positions.getRow(); j++) {
            if (chessboard[i][j] == null) {
            boardprinted += "- ";
            } else {
            boardprinted += "p ";
            }
            } 
            boardprinted += "\n";
        }
        boardprinted += "  1 2 3 4 5 6 7 8";
        return boardprinted;
    }

    }

    
    

