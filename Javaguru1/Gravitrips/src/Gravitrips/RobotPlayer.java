package Gravitrips;

import java.util.Random;

public class RobotPlayer extends Player {

    @Override
    public int selectColumn() {
        Random r = new Random();
        return r.nextInt(7);
    }
}
