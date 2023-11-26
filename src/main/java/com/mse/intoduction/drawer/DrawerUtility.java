package com.mse.intoduction.drawer;

import com.mse.intoduction.advancedrobot.AdvancedKarel;
import com.mse.intoduction.drawer.shapes.Rectangle;
import com.mse.intoduction.drawer.shapes.Square;
import kareltherobot.Directions;

public class DrawerUtility {


    protected static void drawRectangle(Rectangle rectangle, AdvancedKarel robot) {
        // TODO: implement me
    }
    protected static void drawSquare(Square square, AdvancedKarel robot) {
        robot.moveTo(square.getPoint().x, square.getPoint().y);
        robot.turnTo(Directions.North);
        for (int i = 0; i < square.getSide() - 1; i++) {
            robot.putBeeper();
            robot.move();
        }
        robot.turnTo(Directions.East);
        for (int i = 0; i < square.getSide() - 1; i++) {
            robot.putBeeper();
            robot.move();
        }
        robot.turnTo(Directions.South);
        for (int i = 0; i < square.getSide() - 1; i++) {
            robot.putBeeper();
            robot.move();
        }
        robot.turnTo(Directions.West);
        for (int i = 0; i < square.getSide() - 1; i++) {
            robot.putBeeper();
            robot.move();
        }
    }
}
