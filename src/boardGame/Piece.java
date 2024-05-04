package boardGame;

public class Piece {
    protected Position position;
    private Board board;

    public Piece(Board bord) {
        this.board = bord;
        position = null;
    }

    protected Board getBord() {
        return board;
    }

}
