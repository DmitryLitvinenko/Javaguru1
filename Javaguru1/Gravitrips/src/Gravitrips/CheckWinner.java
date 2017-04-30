package Gravitrips;


public class CheckWinner {

    private static final int FIELDS_TO_WIN = 4;

    public boolean checkVertical(Board board, Mark mark) {
        int count = 0;
        for (int j = 0; j < board.getColumn(); j++) {
            for (int i = 0; i < board.getRow(); i++) {
                if (board.getGameField(j, i).equals(mark)) {
                    count++;
                } else {
                    count = 0;
                }
                if (count == FIELDS_TO_WIN) {
                    return true;
                }

            }
        }
        return false;
    }

    public boolean checkHorizontal(Board board, Mark mark) {
        int count = 0;
        for (int j = 0; j < board.getRow(); j++) {
            for (int i = 0; i < board.getColumn(); i++) {
                if (board.getGameField(i, j).equals(mark)) {
                    count++;
                } else {
                    count = 0;
                }

                if (count == FIELDS_TO_WIN) {
                    return true;
                }

            }
        }
        return false;
    }

    public boolean checkDiagonalUp(Board board, Mark mark) {
        int count = 0;
        for (int i = 0; i < board.getRow(); i++) {
            for (int j = 0; j <= i; j++) {
                int k = i - j;
                if ((j < board.getColumn()) && (k < board.getRow()) && (board.getGameField(k, j).equals(mark))) {
                    count++;
                } else {
                    count = 0;
                }
                if (count == FIELDS_TO_WIN) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean checkDiagonalDown(Board board, Mark mark) {
        int count = 0;
        for (int j = 0; j < board.getRow(); j++) {
            for (int i = 0; j <= i; j++) {
                int k = i - j;
                if ((j < board.getColumn()) && (k < board.getRow()) && (board.getGameField(j, k).equals(mark))) {
                    count++;
                } else {
                    count = 0;
                }
                if (count == FIELDS_TO_WIN) {
                    return true;
                }
            }
        }
        return false;
    }

}
