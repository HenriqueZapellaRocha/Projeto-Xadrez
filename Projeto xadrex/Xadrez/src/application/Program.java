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


    while(true){
    System.out.println(chessRuler.borderComander());
    int row = sc.nextInt() ;
    int  column = sc.nextInt() ;
    System.out.print("Possibilites: ");
    System.out.println(chessRuler.possibleMoviment(new Position(row, column)));
    int rowNew = sc.nextInt() ;
    int columnNew = sc.nextInt() ;
   chessRuler.mover(new Position(row, column), new Position(rowNew, columnNew));

   
}



        }
    
    } 
