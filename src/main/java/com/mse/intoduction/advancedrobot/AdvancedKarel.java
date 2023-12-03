package com.mse.intoduction.advancedrobot;

import kareltherobot.Directions;
import kareltherobot.Robot;

import java.awt.*;

/**
 * This is a robot that extends the base Robot class with additional functionality.
 */
public class AdvancedKarel extends Robot {

    private final Point point;

    /**
     * Creates a new robot.
     *
     * @param x - x coordinate
     * @param y - y coordinate
     * @param direction the direction which the robot is facing initially
     */
    public AdvancedKarel(int x, int y, Directions.Direction direction) {
        super(y, x, direction, 0);
        point = new Point(x, y);
    }

    /**
     * Creates a new robot.
     *
     * @param x - x coordinate
     * @param y - y coordinate
     * @param direction the direction the robot is facing
     * @param beepers the number of beepers
     */
    public AdvancedKarel(int x, int y, Directions.Direction direction, int beepers) {
        super(y, x, direction, beepers);
        point = new Point(x, y);
    }

    @Override
    public void move() {
        if (!frontIsClear()) {
            throw new HitAWallException("Cannot move");
        }
        if (facingEast()) {
            point.x = point.x + 1;
        } else if (facingWest()) {
            point.x = point.x - 1;
        } else if (facingNorth()) {
            point.y = point.y + 1;
        } else if (facingSouth()) {
            point.y = point.y - 1;
        }
        super.move();
    }

    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }

    public Point getPoint() {
        return point;
    }

    public Directions.Direction getDirection() {
        if (this.facingNorth()) {
            return Directions.North;
        } else if (this.facingEast()) {
            return Directions.East;
        } else if (this.facingWest()) {
            return Directions.West;
        } else if (this.facingSouth()) {
            return Directions.South;
        }
        throw new IllegalStateException("Unknown direction");
    }

    public void turnTo(Directions.Direction direction) {
        while (this.getDirection() != direction) {
            turnLeft();
        }
    }

    public void moveTo(int x, int y) {
        Direction initialDirection = this.getDirection();
        if (this.point.x < x) {
            this.turnTo(Directions.East);
            while (point.x < x) {
                move();
            }
        }
        if (this.point.x > x) {
            this.turnTo(Directions.West);
            while (point.x > x) {
                move();
            }
        }
        if (this.point.y > y) {
            this.turnTo(Directions.South);
            while (point.y > y) {
                move();
            }
        }
        if (this.point.y < y) {
            this.turnTo(Directions.North);
            while (point.y < y) {
                move();
            }
        }
        turnTo(initialDirection);
    }
}
