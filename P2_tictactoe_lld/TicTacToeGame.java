package P2_tictactoe_lld;

import P2_tictactoe_lld.piece.PieceType;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class TicTacToeGame {
    // using deque for removing players and move to back of queue
    public Deque<Player> players;
    public Board board;

    public TicTacToeGame(){
        initializeGame();
    }

    void initializeGame(){
        this.players = new ArrayDeque<>();
        this.players.add(new Player("Omkar", PieceType.X));
        this.players.add(new Player("Sachin",PieceType.O));
        this.board = new Board(3);
    }

    public String startGame(){
        boolean inProgress = true;
        while(inProgress){
            Player nextPlayer = players.removeFirst();
            board.printBoard();
            int freeSpaces = board.getFreeSpacesCount();
            if(freeSpaces == 0){
                inProgress = false;continue;
            }

            // player input
            System.out.print("Player "+nextPlayer.name+ " Enter row,column: ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            String[] values = input.split(",");
            int row = Integer.parseInt(values[0]);
            int column = Integer.parseInt(values[1]);

            // place the piece
            boolean isPiecePlaced = board.addPiece(row,column,nextPlayer.playerPiece);
            if(!isPiecePlaced){
                System.out.println("Incorrect position chosen!! Please try again!");
                players.addFirst(nextPlayer);
                continue;
            }
            players.addLast(nextPlayer);

            // check result
            boolean isWinner = board.checkWinner(nextPlayer.playerPiece.pieceType);
            if(isWinner){
                board.printBoard();
                return nextPlayer.name;
            }
        }
        board.printBoard();
        return "tie";
    }
}
