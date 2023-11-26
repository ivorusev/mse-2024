package com.mse.intoduction.drawer;

import com.mse.intoduction.advancedrobot.AdvancedKarel;
import com.mse.intoduction.drawer.shapes.Rectangle;
import com.mse.intoduction.drawer.shapes.Shape;
import com.mse.intoduction.drawer.shapes.Square;
import kareltherobot.Directions;

public class DrawerRobot {

    private final AdvancedKarel robot;

    public DrawerRobot(int x, int y) {
        this.robot = new AdvancedKarel(x, y, Directions.North, Integer.MAX_VALUE);
    }

    public void draw(Shape shape) {
        if (shape instanceof Square square) {
            DrawerUtility.drawSquare(square, this.robot);
        }
        if (shape instanceof Rectangle rectangle) {
            DrawerUtility.drawRectangle(rectangle, this.robot);
        }
    }




}
