package com.mse.intoduction.advancedrobot;

import kareltherobot.Directions;
import kareltherobot.World;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AdvancedKarelTest {

    @Before
    public void init() {
        World.setSize(3,3);
        World.setDelay(0);
    }

    @Test
    public void testTurnRight() {
        AdvancedKarel robot = new AdvancedKarel(2, 2, Directions.East);
        robot.turnRight();
        assertTrue(robot.facingSouth());
    }

    @Test
    public void testMoveWithCoordinatesMoveEast() {
        AdvancedKarel robot = new AdvancedKarel(2, 2, Directions.East);
        robot.move();
        assertEquals(robot.getPoint().x, 3);
    }

    @Test
    public void testMoveWithCoordinatesMoveWest() {
        AdvancedKarel robot = new AdvancedKarel(2, 2, Directions.West);
        robot.move();
        assertEquals(robot.getPoint().x, 1);
    }

    @Test
    public void testMoveWithCoordinatesMoveSouth() {
        AdvancedKarel robot = new AdvancedKarel(2, 2, Directions.South);
        robot.move();
        assertEquals(robot.getPoint().y, 1);
    }

    @Test
    public void testMoveWithCoordinatesMoveNorth() {
        AdvancedKarel robot = new AdvancedKarel(2, 2, Directions.North);
        robot.move();
        assertEquals(robot.getPoint().y, 3);
    }

    @Test
    public void testTurnTo() {
        AdvancedKarel robot = new AdvancedKarel(2, 2, Directions.North);
        robot.turnTo(Directions.East);
        assertTrue(robot.facingEast());
    }

    @Test
    public void testMoveTo() {
        AdvancedKarel robot = new AdvancedKarel(1, 1, Directions.East);
        robot.moveTo(3, 3);
        assertEquals(robot.getPoint().x, 3);
        assertEquals(robot.getPoint().y, 3);
        assertTrue(robot.facingEast());
    }

    @Test
    public void testMoveThroughAWall() {
        AdvancedKarel robot = new AdvancedKarel(1, 1, Directions.West);
        HitAWallException hitAWallException = assertThrows(HitAWallException.class, robot::move);
        String actualMessage = hitAWallException.getMessage();
        assertEquals("Cannot move", actualMessage);
    }
}
