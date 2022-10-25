package chessgame;
import chessgame.board.ChessBoard;
import chessgame.board.pieces.Bishop;
import chessgame.board.pieces.King;
import chessgame.board.pieces.Knight;
import chessgame.board.pieces.Pawn;
import chessgame.board.pieces.Piece;
import chessgame.board.pieces.Position;
import chessgame.board.pieces.Queen;
import chessgame.board.pieces.Rook;
import chessgame.board.pieces.enums.Color;
import java.util.List;



import java.util.ArrayList;


public class ChessRuler {
    
    private ChessBoard chessBoard;

    List<Piece> piecesList = new ArrayList<>();

    

    public ChessRuler(ChessBoard chessBoard) {
        this.chessBoard = chessBoard;
    }


    public ChessBoard getChessBoard() {
        return chessBoard;
    }


    public List<Piece> getPiecesList() {
        return piecesList;
    }


    // add all pices in a list 
   public void addPieces() {

    // add pawn white pieces
    piecesList.add(new Pawn("PAWN", new Position(6, 0), Color.valueOf("WHITE")));
    piecesList.add(new Pawn("PAWN", new Position(6, 1), Color.valueOf("WHITE")));
    piecesList.add(new Pawn("PAWN", new Position(6, 2), Color.valueOf("WHITE")));
    piecesList.add(new Pawn("PAWN", new Position(6, 3), Color.valueOf("WHITE")));
    piecesList.add(new Pawn("PAWN", new Position(6, 4), Color.valueOf("WHITE")));
    piecesList.add(new Pawn("PAWN", new Position(6, 5), Color.valueOf("WHITE")));
    piecesList.add(new Pawn("PAWN", new Position(6, 6), Color.valueOf("WHITE")));
    piecesList.add(new Pawn("PAWN", new Position(6, 7), Color.valueOf("WHITE")));

    // add pawn black pieces 
    piecesList.add(new Pawn("PAWN", new Position(1, 0), Color.valueOf("BLACK")));
    piecesList.add(new Pawn("PAWN", new Position(1, 1), Color.valueOf("BLACK")));
    piecesList.add(new Pawn("PAWN", new Position(1, 2), Color.valueOf("BLACK")));
    piecesList.add(new Pawn("PAWN", new Position(1, 3), Color.valueOf("BLACK")));
    piecesList.add(new Pawn("PAWN", new Position(1, 4), Color.valueOf("BLACK")));
    piecesList.add(new Pawn("PAWN", new Position(1, 5), Color.valueOf("BLACK")));
    piecesList.add(new Pawn("PAWN", new Position(1, 6), Color.valueOf("BLACK")));
    piecesList.add(new Pawn("PAWN", new Position(1, 7), Color.valueOf("BLACK")));

    // add white king
    piecesList.add(new King("KING", new Position(7, 4), Color.valueOf("WHITE")));

    // add black king
    piecesList.add(new King("KING", new Position(0, 4), Color.valueOf("BLACK")));

    // add white queen
    piecesList.add(new Queen("QUEEN", new Position(7, 3), Color.valueOf("WHITE")));

    // add black queen
    piecesList.add(new Queen("QUEEN", new Position(0, 3), Color.valueOf("BLACK")));

    // add white rook 
    piecesList.add(new Rook("ROOK", new Position(7, 0), Color.valueOf("WHITE")));
    piecesList.add(new Rook("ROOK", new Position(7, 7), Color.valueOf("WHITE")));

    // add black rook
    piecesList.add(new Rook("ROOK", new Position(0, 0), Color.valueOf("BLACK")));
    piecesList.add(new Rook("ROOK", new Position(0, 7), Color.valueOf("BLACK")));

    // add white kngiht 
    piecesList.add(new Knight("KNIGHT", new Position(7, 1), Color.valueOf("WHITE")));
    piecesList.add(new Knight("KNIGHT", new Position(7, 6), Color.valueOf("WHITE")));

    // add black knight
    piecesList.add(new Knight("KNIGHT", new Position(0, 1), Color.valueOf("BLACK")));
    piecesList.add(new Knight("KNIGHT", new Position(0, 6), Color.valueOf("BLACK")));

    // add white bishop
    piecesList.add(new Bishop("BISHOP", new Position(7, 2), Color.valueOf("WHITE")));
    piecesList.add(new Bishop("BISHOP", new Position(7, 5), Color.valueOf("WHITE")));

    // add black bishop
    piecesList.add(new Bishop("BISHOP", new Position(0, 2), Color.valueOf("BLACK")));
    piecesList.add(new Bishop("BISHOP", new Position(0, 5), Color.valueOf("BLACK")));

    
   }

   public String borderComander() {
    // create a array
    Integer[][] chessboard = new Integer[chessBoard.getPositions().getRow()][chessBoard.getPositions().getRow()];

    // add the pieces in the board
    for(Piece list : piecesList) {
        if (list.getName().equals("PAWN")) {
            chessboard [list.getPosition().getRow()] [list.getPosition().getColumn()] = 1;
        } else if (list.getName().equals("KING")) {
            chessboard [list.getPosition().getRow()] [list.getPosition().getColumn()] = 2;
        } else if (list.getName().equals("QUEEN")) {
            chessboard [list.getPosition().getRow()] [list.getPosition().getColumn()] = 3;
        } else if (list.getName().equals("ROOK")) {
            chessboard [list.getPosition().getRow()] [list.getPosition().getColumn()] = 4;
        } else if (list.getName().equals("KNIGHT")){
            chessboard [list.getPosition().getRow()] [list.getPosition().getColumn()] = 5;
        } else if (list.getName().equals("BISHOP")){
            chessboard [list.getPosition().getRow()] [list.getPosition().getColumn()] = 6;
        }
        }

        // call ther boarderprinter method and return the result of it
        return chessBoard.boarderPrinter(chessboard);
    }
    
    public String possibleMoviment(Position position) {
        List<Position> possiblePositions = new ArrayList<>();
        String returner = "";
        for(Piece list : piecesList) {
            if(list.getPosition().getRow() == position.getRow() && list.getPosition().getColumn() == position.getColumn()) {
            possiblePositions = list.mover(list, piecesList);
            }
        }

        for(Position c : possiblePositions) {
            returner += "Row: " + c.getRow() + " ";
            returner += "Column: " + c.getColumn() + " ";
            
        }
      
        return returner;

    }



    public void mover(Position position, Position positionNew) {
        List<Position> posiblePositions = new ArrayList<>();
        for(Piece list : piecesList) {
            if(list.getPosition().getRow() == position.getRow() && list.getPosition().getColumn() == position.getColumn()) {
        posiblePositions = list.mover(list, piecesList);
    }
        }

        for(Position c : posiblePositions) {
            if(c.getRow() == positionNew.getRow() && c.getColumn() == positionNew.getColumn()) {
                for(Piece piecelistt : piecesList) {
                    if (piecelistt.getPosition().getRow() == position.getRow() && piecelistt.getPosition().getColumn() == position.getColumn()) {
                    piecelistt.setPosition(new Position(positionNew.getRow(), positionNew.getColumn()));
                    }
                }
            }
        }
    
    
    }
  
   }


