package com.twschool.practice.marsrover;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class DirectionTest {

    @Test
    public void should_return_the_WEST_when_get_left_direction_given_direction_NORTH() {
        assertThat(Direction.NORTH.leftDirection(), is(Direction.WEST));
    }

    @Test
    public void should_return_the_EAST_when_get_right_direction_given_direction_NORTH() {
        assertThat(Direction.NORTH.rightDirection(), is(Direction.EAST));
    }

    @Test
    public void should_return_the_SOUTH_when_get_left_direction_given_direction_WEST() {
        assertThat(Direction.WEST.leftDirection(), is(Direction.SOUTH));
    }
    
    @Test
    public void should_return_the_NORTH_when_get_right_direction_given_direction_WEST() {
        assertThat(Direction.WEST.rightDirection(), is(Direction.NORTH));
    }
    
    @Test
    public void should_return_the_EAST_when_get_left_direction_given_direction_SOUTH() {
        assertThat(Direction.SOUTH.leftDirection(), is(Direction.EAST));
    }

    @Test
    public void should_return_the_WEST_when_get_right_direction_given_direction_SOUTH() {
        assertThat(Direction.SOUTH.rightDirection(), is(Direction.WEST));
    }

    @Test
    public void should_return_the_NORTH_when_get_left_direction_given_direction_EAST() {
        assertThat(Direction.EAST.leftDirection(), is(Direction.NORTH));
    }

    @Test
    public void should_return_the_SOUTH_when_get_right_direction_given_direction_EAST() {
        assertThat(Direction.EAST.rightDirection(), is(Direction.SOUTH));
    }

    @Test
    public void should_get_from_short_name() {
        assertThat(Direction.fromShortName("N"), is(Direction.NORTH));
        assertThat(Direction.fromShortName("S"), is(Direction.SOUTH));
        assertThat(Direction.fromShortName("E"), is(Direction.EAST));
        assertThat(Direction.fromShortName("W"), is(Direction.WEST));
    }
}