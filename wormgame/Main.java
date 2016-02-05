package wormgame;

import javax.swing.SwingUtilities;
import wormgame.domain.Piece;
import wormgame.domain.Worm;
import wormgame.gui.UserInterface;
import wormgame.game.WormGame;

public class Main {

    public static void main(String[] args) {
        // write test code here
        Worm m = new Worm(3, 3, Direction.RIGHT);
        m.move();
        System.out.println(m.getPieces());
        m.setDirection(Direction.DOWN);
        m.grow();
        System.out.println(m.getPieces());
        m.move();
        System.out.println(m.getPieces());
        System.out.println(m.runsIntoItself());

    }
}
