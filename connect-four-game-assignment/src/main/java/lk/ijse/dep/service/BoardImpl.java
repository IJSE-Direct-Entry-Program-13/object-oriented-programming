package lk.ijse.dep.service;

public class BoardImpl implements Board{

    private final Piece[][] pieces;
    private final BoardUI boardUI;

    public BoardImpl(BoardUI boardUI) {
        this.boardUI = boardUI;
        this.pieces = new Piece[NUM_OF_COLS][NUM_OF_ROWS];

        for (int j = 0; j < NUM_OF_COLS; j++) {
            for (int i = 0; i < NUM_OF_ROWS; i++) {
                pieces[j][i] = Piece.EMPTY;
            }
        }
    }

    @Override
    public BoardUI getBoardUI() {
        return this.boardUI;
    }

    @Override
    public int findNextAvailableSpot(int col) {
        for (int i = 0; i < NUM_OF_ROWS; i++) {
            if (pieces[col][i] == Piece.EMPTY) return i;
        }
        return -1;
    }

    @Override
    public boolean isLegalMove(int col) {
        return findNextAvailableSpot(col) != -1;
    }

    @Override
    public boolean existLegalMoves() {
        for (int i = 0; i < NUM_OF_COLS; i++) {
            if (isLegalMove(i)) return true;
        }
        return false;
    }

    @Override
    public void updateMove(int col, Piece move) {
        pieces[col][findNextAvailableSpot(col)] = move;
    }

    @Override
    public Winner findWinner() {

        // Check vertically
        for (int k = 0; k < NUM_OF_COLS ; k++) {
            for (int i = 0; i < 2; i++) {
                int count = 1;
                for (int j = i + 1; j < NUM_OF_ROWS; j++) {
                    if (pieces[k][i] != Piece.EMPTY && pieces[k][i] == pieces[k][j]) {
                        count++;
                        if (count == 4) return new Winner(pieces[k][i], k, i, k, j);
                    } else break;
                }
            }
        }

        // Check horizontally
        for (int k = 0; k < NUM_OF_ROWS; k++) {
            for (int i = 0; i < 3; i++) {
                int count = 1;
                for (int j = i + 1; j < NUM_OF_COLS; j++) {
                    if (pieces[i][k] != Piece.EMPTY && pieces[i][k] == pieces[j][k]){
                        count++;
                        if (count == 4) return new Winner(pieces[i][k], i, k, j, k);
                    }else break;
                }
            }
        }

        return new Winner(Piece.EMPTY);
    }
}
