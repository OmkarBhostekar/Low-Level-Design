package P2_tictactoe_lld.piece;

public class PieceFactory {

    static Piece getPiece(PieceType type){
        return switch (type){
            case X -> new PieceX();
            // add other piece types
            default -> new PieceO();
        };
    }

}
