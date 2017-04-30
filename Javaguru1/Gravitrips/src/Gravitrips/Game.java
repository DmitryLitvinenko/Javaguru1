package Gravitrips;

public class Game {

    private static final int PLAYER_VS_COMPUTER = 1;
    private static final int COMPUTER_VS_COMPUTER = 2;
    private static final int PLAYER_VS_PLAYER = 3;
    private static int inputRange = 4;
    static Input input = new Input(inputRange);
    static GameRound gameRound;

    public static void main(String[] args) {

        welcomeMessage();
        gameMode();
        gameRound.welcomePlayers();
        gameRound.startGameRound();
    }


    public static void welcomeMessage() {
        System.out.println(" Welcome to Gravitrips game!");
        System.out.println("To start game player vs computer press 1");
        System.out.println("To start game computer vs computer press 2");
        System.out.println("To start game player vs player press 3");
    }

    public static void gameMode() {
        switch (input.input()) {
            case PLAYER_VS_COMPUTER:
                System.out.println("GAME MODE: Player vs Computer");
                gameRound = new GameRound(new HumanPlayer(), new RobotPlayer());
                break;
            case COMPUTER_VS_COMPUTER:
                System.out.println("GAME MODE: Computer vs Computer");
                gameRound = new GameRound(new RobotPlayer(), new RobotPlayer());
                break;
            case PLAYER_VS_PLAYER:
                System.out.println("GAME MODE: Player vs Player");
                gameRound = new GameRound(new HumanPlayer(), new HumanPlayer());
                break;
        }

    }
}




