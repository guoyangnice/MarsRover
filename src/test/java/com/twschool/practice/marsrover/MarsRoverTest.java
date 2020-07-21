package com.twschool.practice.marsrover;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MarsRoverTest {

    @Test
    public void should_return_x_0_y_1_and_N_when_receive_M_command_give_mars_rover_with_init_place_x_0_y_0_N() {
        MarsRover marsRover = new MarsRover(new MarsRoverPosition(0 ,0 , "N"));

        MarsRoverPosition marsRoverPosition = marsRover.receive("M");

        assertThat(marsRoverPosition.getCoordinatesX(), is(0));
        assertThat(marsRoverPosition.getCoordinatesY(), is(1));
        assertThat(marsRoverPosition.getDirectionShortName(), is("N"));
    }

    @Test
    public void should_return_x_f1_y_0_and_W_when_receive_M_command_give_mars_rover_with_init_place_x_0_y_0_W() {
        MarsRover marsRover = new MarsRover(new MarsRoverPosition(0 ,0 , "W"));

        MarsRoverPosition marsRoverPosition = marsRover.receive("M");

        assertThat(marsRoverPosition.getCoordinatesX(), is(-1));
        assertThat(marsRoverPosition.getCoordinatesY(), is(0));
        assertThat(marsRoverPosition.getDirectionShortName(), is("W"));
    }

    @Test
    public void should_return_x_0_y_f1_and_S_when_receive_M_command_give_mars_rover_with_init_place_x_0_y_0_S() {
        MarsRover marsRover = new MarsRover(new MarsRoverPosition(0 ,0 , "S"));

        MarsRoverPosition marsRoverPosition = marsRover.receive("M");

        assertThat(marsRoverPosition.getCoordinatesX(), is(0));
        assertThat(marsRoverPosition.getCoordinatesY(), is(-1));
        assertThat(marsRoverPosition.getDirectionShortName(), is("S"));
    }

    @Test
    public void should_return_E_when_receive_L_command_give_mars_rover_with_init_place_x_0_y_0_S() {
        MarsRover marsRover = new MarsRover(new MarsRoverPosition(0 ,0 , "S"));

        MarsRoverPosition marsRoverPosition = marsRover.receive("L");

        assertThat(marsRoverPosition.getDirectionShortName(), is("E"));
    }

    @Test
    public void should_return_W_when_receive_R_command_give_mars_rover_with_init_place_x_0_y_0_S() {
        MarsRover marsRover = new MarsRover(new MarsRoverPosition(0 ,0 , "S"));

        MarsRoverPosition marsRoverPosition = marsRover.receive("R");

        assertThat(marsRoverPosition.getDirectionShortName(), is("W"));
    }

    @Test
    public void should_return_S_when_receive_L_command_give_mars_rover_with_init_place_x_0_y_0_E() {
        MarsRover marsRover = new MarsRover(new MarsRoverPosition(0 ,0 , "E"));

        MarsRoverPosition marsRoverPosition = marsRover.receive("L");

        assertThat(marsRoverPosition.getDirectionShortName(), is("N"));
    }

    @Test
    public void should_return_E_when_receive_R_command_give_mars_rover_with_init_place_x_0_y_0_N() {
        MarsRover marsRover = new MarsRover(new MarsRoverPosition(0 ,0 , "N"));

        MarsRoverPosition marsRoverPosition = marsRover.receive("R");

        assertThat(marsRoverPosition.getDirectionShortName(), is("E"));
    }

    @Test
    public void should_return_W_when_receive_L_command_give_mars_rover_with_init_place_x_0_y_0_N() {
        MarsRover marsRover = new MarsRover(new MarsRoverPosition(0 ,0 , "N"));

        MarsRoverPosition marsRoverPosition = marsRover.receive("L");

        assertThat(marsRoverPosition.getDirectionShortName(), is("W"));
    }

    @Test
    public void should_return_S_when_receive_RL_command_give_mars_rover_with_init_place_x_0_y_0_W() {
        MarsRover marsRover = new MarsRover(new MarsRoverPosition(0 ,0 , "W"));

        MarsRoverPosition marsRoverPosition = marsRover.receive("L");

        assertThat(marsRoverPosition.getDirectionShortName(), is("S"));
    }

    @Test
    public void should_return_N_when_receive_L_command_give_mars_rover_with_init_place_x_0_y_0_W() {
        MarsRover marsRover = new MarsRover(new MarsRoverPosition(0 ,0 , "W"));

        MarsRoverPosition marsRoverPosition = marsRover.receive("R");

        assertThat(marsRoverPosition.getDirectionShortName(), is("N"));
    }

    @Test
    public void should_return_S_when_receive_R_command_give_mars_rover_with_init_place_x_0_y_0_E() {
        MarsRover marsRover = new MarsRover(new MarsRoverPosition(0 ,0 , "E"));

        MarsRoverPosition marsRoverPosition = marsRover.receive("R");

        assertThat(marsRoverPosition.getDirectionShortName(), is("S"));
    }

    //whenB
    @Test
    public void should_return_N_when_receive_B_command_give_mars_rover_with_init_place_x_0_y_0_N() {
        MarsRover marsRover = new MarsRover(new MarsRoverPosition(0 ,0 , "N"));

        MarsRoverPosition marsRoverPosition = marsRover.receive("B");

        assertThat(marsRoverPosition.getDirectionShortName(), is("N"));
    }

    @Test
    public void should_return_x_0_y_f1_N_when_receive_BM_command_give_mars_rover_with_init_place_x_0_y_0_N() {
        MarsRover marsRover = new MarsRover(new MarsRoverPosition(0 ,0 , "N"));

        MarsRoverPosition marsRoverPosition = marsRover.receive("BM");

        assertThat(marsRoverPosition.getCoordinatesX(), is(0));
        assertThat(marsRoverPosition.getCoordinatesY(), is(-1));
        assertThat(marsRoverPosition.getDirectionShortName(), is("N"));
    }

    @Test
    public void should_return_x_0_y_0_N_when_receive_BM_command_give_mars_rover_with_init_place_x_0_y_0_N() {
        MarsRover marsRover = new MarsRover(new MarsRoverPosition(0 ,0 , "N"));

        MarsRoverPosition marsRoverPosition = marsRover.receive("BMBM");

        assertThat(marsRoverPosition.getCoordinatesX(), is(0));
        assertThat(marsRoverPosition.getCoordinatesY(), is(0));
        assertThat(marsRoverPosition.getDirectionShortName(), is("N"));
    }

    @Test
    public void should_return_x_1_y_0_and_E_when_receive_M_command_give_mars_rover_with_init_place_x_0_y_0_E() {
        MarsRover marsRover = new MarsRover(new MarsRoverPosition(0 ,0 , "E"));

        MarsRoverPosition marsRoverPosition = marsRover.receive("M");

        assertThat(marsRoverPosition.getCoordinatesX(), is(1));
        assertThat(marsRoverPosition.getCoordinatesY(), is(0));
        assertThat(marsRoverPosition.getDirectionShortName(), is("E"));
    }

    @Test
    public void should_return_x_0_y_2_and_N_when_receive_MM_command_give_mars_rover_with_init_place_x_0_y_0_N() {
        MarsRover marsRover = new MarsRover(new MarsRoverPosition(0 ,0 , "N"));

        MarsRoverPosition marsRoverPosition = marsRover.receive("MM");

        assertThat(marsRoverPosition.getCoordinatesX(), is(0));
        assertThat(marsRoverPosition.getCoordinatesY(), is(2));
        assertThat(marsRoverPosition.getDirectionShortName(), is("N"));
    }

    @Test
    public void should_return_x_0_y_0_and_W_when_receive_MLLMR_command_give_mars_rover_with_init_place_x_0_y_0_N() {
        MarsRover marsRover = new MarsRover(new MarsRoverPosition(0 ,0 , "N"));

        MarsRoverPosition marsRoverPosition = marsRover.receive("MLLMR");

        assertThat(marsRoverPosition.getCoordinatesX(), is(0));
        assertThat(marsRoverPosition.getCoordinatesY(), is(0) );
        assertThat(marsRoverPosition.getDirectionShortName(), is("W"));
    }

    @Test
    public void should_return_x_3_y_1_and_W_when_receive_MLLMR_command_give_mars_rover_with_init_place_x_2_y_1_E() {
        MarsRover marsRover = new MarsRover(new MarsRoverPosition(2,1, "E"));

        MarsRoverPosition marsRoverPosition = marsRover.receive("MLLR");

        assertThat(marsRoverPosition.getCoordinatesX(), is(3));
        assertThat(marsRoverPosition.getCoordinatesY(), is(1) );
        assertThat(marsRoverPosition.getDirectionShortName(), is("N"));
    }

}
