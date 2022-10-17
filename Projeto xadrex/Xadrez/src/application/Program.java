package application;
import chessgame.ChessRuler;
import chessgame.board.ChessBoard;
import chessgame.board.pieces.Position;
import java.util.Scanner;

public class Program {
    public static void main(String[] args)  {
        
    Scanner sc = new Scanner(System.in);

    ChessRuler chessRuler = new ChessRuler(new ChessBoard(new Position(8, 8)));

    chessRuler.addPieces();
    
    System.out.println(chessRuler.borderComander());
    System.out.println(chessRuler.searchAndPossibility());

   



    }
    }
