package com.mse.drawer;

import com.mse.advancedrobot.AdvancedKarel;
import com.mse.drawer.shapes.Rectangle;
import com.mse.drawer.shapes.Square;
import kareltherobot.Directions;

public class DrawerUtility {


   /**
    * Draws a rectangle using the AdvancedKarel robot.
    *
    * @param rectangle The rectangle to be drawn.
    * @param robot The AdvancedKarel robot to use for drawing.
    */
   protected static void drawRectangle(Rectangle rectangle, AdvancedKarel robot) {
       // TODO: implement me
   }

   /**
    * Draws a square using the AdvancedKarel robot.
    *
    * @param square The square to be drawn.
    * @param robot The AdvancedKarel robot to use for drawing.
    */
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