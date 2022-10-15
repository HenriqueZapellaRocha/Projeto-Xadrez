package application;

import chessgame.board.ChessBoard;
import chessgame.board.pieces.Piece;
import chessgame.board.pieces.Position;
import chessgame.board.pieces.enums.Color;

public class Program {
    public static void main(String[] args) throws Exception {
        
    ChessBoard chessBoard = new ChessBoard(new Position(8, 8), new Piece(new Position(2, 2), Color.valueOf("WHITE")));

        System.out.println(chessBoard.boarderPrinter());
    }
    }
