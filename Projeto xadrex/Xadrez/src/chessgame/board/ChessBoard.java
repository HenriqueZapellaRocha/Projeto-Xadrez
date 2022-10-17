package chessgame.board;
import chessgame.board.pieces.Position;

public class ChessBoard {

    private Position positions;



    public ChessBoard() {
    }

    
    public ChessBoard(Position positions) {
        this.positions = positions;
        
    }


    public Position getPositions() {
        return positions;
    }


    public String boarderPrinter(Integer[][] chessboard) {
        String boardprinted = "";
       

          for (int i = 0; i < positions.getColumn(); i++) {
           boardprinted += i + "  ";
            for(int j = 0; j < positions.getRow(); j++) {
            if (chessboard[i][j] == null) {
            boardprinted += "- ";
            } else if (chessboard[i][j] == 1) {
            boardprinted += "P ";
            } else if (chessboard[i][j] == 2) {
            boardprinted += "K ";
            } else if (chessboard[i][j] == 3) {
            boardprinted += "Q ";
            }else if (chessboard[i][j] == 4) {
            boardprinted += "R ";
            } else if (chessboard[i][j] == 5) {
            boardprinted += "N ";
            } else if (chessboard[i][j] == 6) {
                boardprinted += "B ";
            }
            } 
            boardprinted += "\n";
        }
        boardprinted +=("   ---------------");
        boardprinted += "\n   0 1 2 3 4 5 6 7";
        return boardprinted;
    }

    }

    
    

