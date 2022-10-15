package application;
import chessgame.ChessRuler;
import chessgame.board.ChessBoard;
import chessgame.board.pieces.Piece;
import chessgame.board.pieces.Position;
import chessgame.board.pieces.enums.Color;

public class Program {
    public static void main(String[] args) throws Exception {
        
    ChessRuler chessRuler = new ChessRuler(new ChessBoard(new Position(8, 8)));

    chessRuler.addPieces();
    System.out.print(chessRuler.borderComander());


    }
    }
