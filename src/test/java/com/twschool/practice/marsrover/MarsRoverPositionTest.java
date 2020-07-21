package com.twschool.practice.marsrover;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MarsRoverPositionTest {
    @Test
    public void should_return_toward_W_when_turn_left_give_init_toward_N() {
        MarsRoverPosition marsRoverPosition = new MarsRoverPosition(0, 0, "N");
        
        marsRoverPosition.turnLeft();

        assertThat(marsRoverPosition.getDirectionShortName(), is("W"));
    }

    @Test
    public void should_return_toward_S_when_turn_left_give_init_toward_W() {
        MarsRoverPosition marsRoverPosition = new MarsRoverPosition(0, 0, "W");

        marsRoverPosition.turnLeft();

        assertThat(marsRoverPosition.getDirectionShortName(), is("S"));
    }

    @Test
    public void should_return_toward_E_when_turn_left_give_init_toward_S() {
        MarsRoverPosition marsRoverPosition = new MarsRoverPosition(0, 0, "S");

        marsRoverPosition.turnLeft();

        assertThat(marsRoverPosition.getDirectionShortName(), is("E"));
    }

    @Test
    public void should_return_toward_N_when_turn_left_give_init_toward_E() {
        MarsRoverPosition marsRoverPosition = new MarsRoverPosition(0, 0, "E");

        marsRoverPosition.turnLeft();

        assertThat(marsRoverPosition.getDirectionShortName(), is("N"));
    }

    @Test
    public void should_add_coordinatesY_by_1_when_move_give_direction_N() {
        MarsRoverPosition marsRoverPosition = new MarsRoverPosition(0, 0, "N");

        marsRoverPosition.move();

        assertThat(marsRoverPosition.getCoordinatesY(), is(1));
    }

    @Test
    public void should_add_coordinatesX_by_1_when_move_give_direction_E() {
        MarsRoverPosition marsRoverPosition = new MarsRoverPosition(0, 0, "E");

        marsRoverPosition.move();

        assertThat(marsRoverPosition.getCoordinatesX(), is(1));
    }

    @Test
    public void should_minus_coordinatesX_by_1_when_move_give_direction_W() {
        MarsRoverPosition marsRoverPosition = new MarsRoverPosition(0, 0, "W");

        marsRoverPosition.move();

        assertThat(marsRoverPosition.getCoordinatesX(), is(-1));
    }

    @Test
    public void should_minus_coordinatesY_by_1_when_move_give_direction_S() {
        MarsRoverPosition marsRoverPosition = new MarsRoverPosition(0, 0, "S");

        marsRoverPosition.move();

        assertThat(marsRoverPosition.getCoordinatesY(), is(-1));
    }
}