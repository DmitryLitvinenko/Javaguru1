package Gravitrips;

public class Board {

    private static final int COLUMNS = 7;
    private static final int ROWS = 6;

    public Board() {
        for (int j = 0; j < ROWS; j++) {
            for (int i = 0; i < COLUMNS; i++) {
                gameField[i][j] = Mark.UNFILLED;
            }
        }

    }

    private Mark[][] gameField = new Mark[COLUMNS][ROWS];

    public Mark getGameField(int column, int row) {
        return gameField[column][row];
    }

    public int getColumn() {
        return COLUMNS;
    }

    public int getRow() {
        return ROWS;
    }

    public void printField() {
        System.out.println(1 + "\t" + 2 + "\t" + 3 + "\t" + 4 + "\t" + 5 + "\t" + 6 + "\t" + 7);
        for (int j = 0; j < ROWS; j++) {
            for (int i = 0; i < COLUMNS; i++) {
                System.out.print(gameField[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public int getFirstFreeField(int move) {
        int i = 5;
        while ((i >= 0) && (gameField[move][i] != (Mark.UNFILLED))) {
            i--;
        }
        return i;


    }

    public void markField(int move, int freeSlot, Mark mark) {

        gameField[move][freeSlot] = mark;
    }

    public boolean isColumnFull(int slot) {

        if (slot == -1) {
            System.out.println("Column full");
        }

        return (slot != -1);
    }

    public boolean anyFieldsFree() {
        boolean check = false;
        int i = 0;
        while (!check && i < COLUMNS) {
            if (gameField[i][0].equals(Mark.UNFILLED)) {
                check = true;
            }
            i++;
        }
        if (!check) {
            System.out.println("Tie");
        }
        return check;
    }
}
