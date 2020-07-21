package com.twschool.practice.marsrover;


public class MarsRoverPosition {
    private Direction direction;

    public int coordinatesX;
    public int coordinatesY;

    public int getCoordinatesX() {
        return coordinatesX;
    }

    public int getCoordinatesY() {
        return coordinatesY;
    }

    public MarsRoverPosition(int coordinatesX, int coordinatesY, String direction) {
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
        this.direction = Direction.fromShortName(direction);
    }

    public String getDirectionShortName() {
        return direction.getShortName();
    }

    public void move() {
        String directionShortName = direction.getShortName();
        if (directionShortName.equals(Direction.NORTH.getShortName())) {
            this.coordinatesY++;
        } else if (directionShortName.equals(Direction.EAST.getShortName())) {
            this.coordinatesX++;
        } else if (directionShortName.equals(Direction.WEST.getShortName())) {
            this.coordinatesX--;
        } else if (directionShortName.equals(Direction.SOUTH.getShortName())) {
            this.coordinatesY--;
        }
    }

    public void turnLeft() {
        direction = direction.leftDirection();
    }

    public void turnRight() {
        direction = direction.rightDirection();
    }

}
