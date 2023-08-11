package P2_tictactoe_lld;

import P2_tictactoe_lld.piece.Piece;
import P2_tictactoe_lld.piece.PieceFactory;
import P2_tictactoe_lld.piece.PieceType;

public class Player {
    public String name;
    public Piece playerPiece;

    public Player(String name, PieceType pieceType){
        this.name = name;
        this.playerPiece = PieceFactory.getPiece(pieceType);
    }

}
