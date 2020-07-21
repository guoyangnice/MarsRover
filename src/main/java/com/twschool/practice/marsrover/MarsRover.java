package com.twschool.practice.marsrover;

import java.util.Arrays;

public class MarsRover {

    private MarsRoverPosition marsRoverPosition;
    public MarsRover(MarsRoverPosition marsRoverPosition) {
        this.marsRoverPosition = marsRoverPosition;
    }

    public MarsRoverPosition getMarsRoverPosition() {
        return marsRoverPosition;
    }

    public MarsRoverPosition receive(String commands) {
        Arrays.asList(commands.split("")).forEach(this::receiveSingleCommand);
        return getMarsRoverPosition();
    }

    private void receiveSingleCommand(String command) {
        if (Command.MOVE.getShortName().equals(command)) {
            marsRoverPosition.move();
        }
        if (Command.TURN_LEFT.getShortName().equals(command)) {
            marsRoverPosition.turnLeft();
        }
        if (Command.TURN_RIGHT.getShortName().equals(command)) {
            marsRoverPosition.turnRight();
        }

    }
}
