package Gravitrips;


public class HumanPlayer extends Player {

    private static int inputRange = 8;
    Input input = new Input(inputRange);

    @Override
    public int selectColumn() {
        System.out.println(getPlayerName() + " turn, with mark " + getMark());
        System.out.println("Enter number from 1 to 7");
        return input.input() - 1;
    }
}

