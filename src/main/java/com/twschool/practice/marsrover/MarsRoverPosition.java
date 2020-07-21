package com.twschool.practice.marsrover;


public class MarsRoverPosition {
    public Direction direction;

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

}
