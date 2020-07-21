package com.twschool.practice.marsrover;

import java.util.Arrays;

public class MarsRover{

    private MarsRoverPosition marsRoverPosition;
    public MarsRover(MarsRoverPosition marsRoverPosition) {
        this.marsRoverPosition = marsRoverPosition;
    }

    public MarsRoverPosition receive(String commands){
        DealCommand dealCommand = new DealCommand(marsRoverPosition);
        marsRoverPosition = dealCommand.receive(commands);
        return marsRoverPosition;
    }

}
