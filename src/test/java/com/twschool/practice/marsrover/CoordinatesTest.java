package com.twschool.practice.marsrover;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CoordinatesTest {

    @Test
    public void should_add_coordinatesY_by_1_when_move_give_direction_N() {
        Coordinates coordinates = new Coordinates(0, 0);

        coordinates.moveToward("N");

        assertThat(coordinates.getCoordinatesY(), is(1));
    }

    @Test
    public void should_add_coordinatesX_by_1_when_move_give_direction_E() {
        Coordinates coordinates = new Coordinates(0, 0);

        coordinates.moveToward("E");

        assertThat(coordinates.getCoordinatesX(), is(1));
    }

    @Test
    public void should_minus_coordinatesX_by_1_when_move_give_direction_W() {
        Coordinates coordinates = new Coordinates(0, 0);

        coordinates.moveToward("W");

        assertThat(coordinates.getCoordinatesX(), is(-1));
    }

    @Test
    public void should_minus_coordinatesY_by_1_when_move_give_direction_S() {
        Coordinates coordinates = new Coordinates(0, 0);

        coordinates.moveToward("S");

        assertThat(coordinates.getCoordinatesY(), is(-1));
    }
}