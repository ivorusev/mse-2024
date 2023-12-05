package com.mse.drawer;

import com.mse.advancedrobot.AdvancedKarel;
import com.mse.drawer.shapes.Rectangle;
import com.mse.drawer.shapes.Shape;
import com.mse.drawer.shapes.Square;
import kareltherobot.Directions;

/**
* A class representing a robot that can draw shapes.
*/
public class DrawerRobot {

   /**
    * The Karel robot that this drawer robot is using.
    */
   private final AdvancedKarel robot;

   /**
    * Creates a new drawer robot at the specified location and facing the specified direction.
    *
    * @param x the x-coordinate of the robot's initial position
    * @param y the y-coordinate of the robot's initial position
    */
   public DrawerRobot(int x, int y) {
       this.robot = new AdvancedKarel(x, y, Directions.North, Integer.MAX_VALUE);
   }

   /**
    * Draws the specified shape.
    *
    * @param shape the shape to draw
    */
   public void draw(Shape shape) {
       if (shape instanceof Square square) {
           DrawerUtility.drawSquare(square, this.robot);
       } else if (shape instanceof Rectangle rectangle) {
           DrawerUtility.drawRectangle(rectangle, this.robot);
       }
   }
}