package com.mse.intoduction.drawer;
import com.mse.advancedrobot.AdvancedKarel;
import com.mse.drawer.DrawerRobot;
import com.mse.drawer.shapes.Square;
import kareltherobot.World;
import org.junit.Test;

import java.awt.*;
import java.lang.reflect.Field;

import static org.junit.Assert.assertEquals;

public class DrawerRobotTest {

    @Test
    public void testDrawRectangle() throws IllegalAccessException, NoSuchFieldException {
        World.setSize(20, 20);
        World.setDelay(0);
        DrawerRobot drawer = new DrawerRobot(1, 1);
        Square square = new Square(new Point(3, 3), 5);
        drawer.draw(square);
        Field privateField = DrawerRobot.class.getDeclaredField("robot");

        // Set the accessibility as true
        privateField.setAccessible(true);

        // Store the value of private field in variable
        AdvancedKarel karel = (AdvancedKarel) privateField.get(drawer);
        assertEquals(karel.getPoint().x, 3);
        assertEquals(karel.getPoint().y, 3);
    }
}
