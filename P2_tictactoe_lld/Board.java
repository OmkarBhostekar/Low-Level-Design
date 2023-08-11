package P2_tictactoe_lld;

import P2_tictactoe_lld.piece.Piece;
import P2_tictactoe_lld.piece.PieceType;

public class Board {
    public int size;
    public Piece[][] board;

    public Board(int size){
        this.size = size;
        board = new Piece[size][size];
    }

    public void printBoard(){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(board[i][j] == null){
                    System.out.print("  | ");
                }else{
                    System.out.print(" "+board[i][j].pieceType+"| ");
                }
            }
            System.out.print("\n");
        }
    }

    public int getFreeSpacesCount(){
        int cnt = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(board[i][j] == null) cnt++;
            }
        }
        return cnt;
    }

    public boolean addPiece(int row, int column, Piece playerPiece) {
        if(row<0 || row>=size || column<0 || column>=size || board[row][column] != null) return false;
        board[row][column] = playerPiece;
        return true;
    }

    public boolean checkWinner(PieceType pieceType) {
        // check horizontally
        for (int i = 0; i < size; i++) {
            boolean flag = true;
            for (int j = 0; j < size; j++) {
                if(board[i][j] == null || board[i][j].pieceType != pieceType) {
                    flag = false;
                    break;
                }
            }
            if(flag) return true;
        }

        // check vertically
        for (int j = 0; j < size; j++) {
            boolean flag = true;
            for (int i = 0; i < size; i++) {
                if(board[i][j] == null || board[i][j].pieceType != pieceType) {
                    flag = false;
                    break;
                }
            }
            if(flag) return true;
        }

        // L-R diagonal
        boolean flag = true;
        for (int i = 0; i < size; i++) {
            if(board[i][i] == null || board[i][i].pieceType != pieceType){
                flag = false;
                break;
            }
        }
        if(flag) return true;

        // R-L diagonal
        flag = true;
        for (int i = 0; i < size; i++) {
            if(board[i][size-i-1] == null || board[i][size-i-1].pieceType != pieceType){
                flag = false;
                break;
            }
        }
        return flag;
    }
}
