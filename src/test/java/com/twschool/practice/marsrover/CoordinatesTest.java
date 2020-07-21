package com.twschool.practice.marsrover;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CoordinatesTest {

    @Test
    public void should_add_coordinatesY_by_1_when_move_give_direction_N() {
        Coordinates coordinates = new Coordinates(0, 0);

        if ("N".equals(Direction.NORTH.getShortName())) {
            coordinates.coordinatesY++;
        } else if ("N".equals(Direction.EAST.getShortName())) {
            coordinates.coordinatesX++;
        } else if ("N".equals(Direction.WEST.getShortName())) {
            coordinates.coordinatesX--;
        } else if ("N".equals(Direction.SOUTH.getShortName())) {
            coordinates.coordinatesY--;
        }

        assertThat(coordinates.getCoordinatesY(), is(1));
    }

    @Test
    public void should_add_coordinatesX_by_1_when_move_give_direction_E() {
        Coordinates coordinates = new Coordinates(0, 0);

        if ("E".equals(Direction.NORTH.getShortName())) {
            coordinates.coordinatesY++;
        } else if ("E".equals(Direction.EAST.getShortName())) {
            coordinates.coordinatesX++;
        } else if ("E".equals(Direction.WEST.getShortName())) {
            coordinates.coordinatesX--;
        } else if ("E".equals(Direction.SOUTH.getShortName())) {
            coordinates.coordinatesY--;
        }

        assertThat(coordinates.getCoordinatesX(), is(1));
    }

    @Test
    public void should_minus_coordinatesX_by_1_when_move_give_direction_W() {
        Coordinates coordinates = new Coordinates(0, 0);

        if ("W".equals(Direction.NORTH.getShortName())) {
            coordinates.coordinatesY++;
        } else if ("W".equals(Direction.EAST.getShortName())) {
            coordinates.coordinatesX++;
        } else if ("W".equals(Direction.WEST.getShortName())) {
            coordinates.coordinatesX--;
        } else if ("W".equals(Direction.SOUTH.getShortName())) {
            coordinates.coordinatesY--;
        }

        assertThat(coordinates.getCoordinatesX(), is(-1));
    }

    @Test
    public void should_minus_coordinatesY_by_1_when_move_give_direction_S() {
        Coordinates coordinates = new Coordinates(0, 0);

        if ("S".equals(Direction.NORTH.getShortName())) {
            coordinates.coordinatesY++;
        } else if ("S".equals(Direction.EAST.getShortName())) {
            coordinates.coordinatesX++;
        } else if ("S".equals(Direction.WEST.getShortName())) {
            coordinates.coordinatesX--;
        } else if ("S".equals(Direction.SOUTH.getShortName())) {
            coordinates.coordinatesY--;
        }

        assertThat(coordinates.getCoordinatesY(), is(-1));
    }
}