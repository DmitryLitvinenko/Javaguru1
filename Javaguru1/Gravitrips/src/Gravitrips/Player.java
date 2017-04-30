package Gravitrips;


import java.util.Scanner;

public abstract class Player {

    static int playerCounter = 1;

    public Player() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter player " + playerCounter++ + " name.");
        setPlayerName(scanner.nextLine());
    }

    private String playerName;
    private Mark mark;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Mark getMark() {
        return mark;
    }

    public void setMark(Mark mark) {
        this.mark = mark;
    }

    public abstract int selectColumn();


}
