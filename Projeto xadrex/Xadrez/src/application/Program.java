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

   // clear terminal
   try {
    new ProcessBuilder("clear").inheritIO().start().waitFor();	// Para linux (acho que para mac também)
  } catch(Exception e) {
    e.printStackTrace();
  }


    while(true){
   // Chosse the piece
    System.out.println(chessRuler.borderComander());
    System.out.println("Choose the piece you want to move ");
    System.out.print("  Piece row: ");
    int row = sc.nextInt() ;
    System.out.print("  Piece Collumn: ");
    int  column = sc.nextInt() ;
    // clear terminal
    try {
        new ProcessBuilder("clear").inheritIO().start().waitFor();	// Para linux (acho que para mac também)
      } catch(Exception e) {
        e.printStackTrace();
      }
    // chosse the possibilites e new position of hte piece
    System.out.println(chessRuler.borderComander());
    System.out.println("Possible moviments: "  +  chessRuler.possibleMoviment(new Position(row, column)));
    System.out.println("Chosse the new position");
    System.out.print("new position row: ");
    int rowNew = sc.nextInt() ;
    System.out.print("new position collumn: ");
    int columnNew = sc.nextInt() ;
   chessRuler.mover(new Position(row, column), new Position(rowNew, columnNew));
   // clear terminal
   try {
    new ProcessBuilder("clear").inheritIO().start().waitFor();	// Para linux (acho que para mac também)
  } catch(Exception e) {
    e.printStackTrace();
  }
  
}

        }

    } 
