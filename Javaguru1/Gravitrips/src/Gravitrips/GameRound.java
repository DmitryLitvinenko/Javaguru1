package Gravitrips;

public class GameRound {

    private Board board;
    private Player player1;
    private Player player2;
    private Player currentPlayer;

    public GameRound(Player inputPlayer1, Player inputPlayer2) {
        player1 = inputPlayer1;
        player1.setMark(Mark.X);
        player2 = inputPlayer2;
        player2.setMark(Mark.O);
        board = new Board();
    }

    public void welcomePlayers() {
        System.out.println("Welcome " + player1.getPlayerName());
        System.out.println("Welcome " + player2.getPlayerName());
        System.out.println("Let the game begin!");
        board.printField();
    }

    public void startGameRound() {
        switchPlayer();
        while (Winner() &&  board.anyFieldsFree()) {
            switchPlayer();
            int selectColumn = 0;
            int firstFreeField = 0;
            boolean checkMove = false;
            while (!checkMove) {
                selectColumn = currentPlayer.selectColumn();
                firstFreeField = board.getFirstFreeField(selectColumn);
                checkMove = board.isColumnFull(firstFreeField);
            }
            board.markField(selectColumn, firstFreeField, currentPlayer.getMark());
            board.printField();
        }
    }

    public void switchPlayer() {
        if (currentPlayer == player2) {
            currentPlayer = player1;
        } else {
            currentPlayer = player2;
        }

    }

    public boolean Winner() {
        CheckWinner checkWinner = new CheckWinner();
        if (checkWinner.checkDiagonalDown(board, currentPlayer.getMark()) ||checkWinner.checkVertical(board, currentPlayer.getMark()) || checkWinner.checkHorizontal(board, currentPlayer.getMark()) || checkWinner.checkDiagonalUp(board, currentPlayer.getMark())) {
            System.out.println("\n Winner is - " + currentPlayer.getPlayerName());
            return false;
        }
        return true;
    }
}
