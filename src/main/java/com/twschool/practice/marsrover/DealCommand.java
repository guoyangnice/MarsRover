package com.twschool.practice.marsrover;

import java.util.Arrays;

public class DealCommand implements CommandInterface {

    private MarsRoverPosition marsRoverPosition;

    public DealCommand(MarsRoverPosition marsRoverPosition){
        this.marsRoverPosition = marsRoverPosition;
    }

    @Override
    public void receiveSingleCommand(String command) {
        if (Command.MOVE.getShortName().equals(command)) {
            String directionShortName = marsRoverPosition.direction.getShortName();
            if (directionShortName.equals(Direction.NORTH.getShortName())) {
                marsRoverPosition.coordinatesY++;
            } else if (directionShortName.equals(Direction.EAST.getShortName())) {
                marsRoverPosition.coordinatesX++;
            } else if (directionShortName.equals(Direction.WEST.getShortName())) {
                marsRoverPosition.coordinatesX--;
            } else if (directionShortName.equals(Direction.SOUTH.getShortName())) {
                marsRoverPosition.coordinatesY--;
            }
        }
        if (Command.TURN_LEFT.getShortName().equals(command)) {
            marsRoverPosition.direction = marsRoverPosition.direction.leftDirection();
        }
        if (Command.TURN_RIGHT.getShortName().equals(command)) {
            marsRoverPosition.direction = marsRoverPosition.direction.rightDirection();
        }
        if(Command.BACK.getShortName().equals(command)){
            if(Command.MOVE.getShortName().equals(command)){
                String directionShortName = marsRoverPosition.direction.getShortName();
                if (directionShortName.equals(Direction.NORTH.getShortName())) {
                    marsRoverPosition.coordinatesY--;
                } else if (directionShortName.equals(Direction.EAST.getShortName())) {
                    marsRoverPosition.coordinatesX--;
                } else if (directionShortName.equals(Direction.WEST.getShortName())) {
                    marsRoverPosition.coordinatesX++;
                } else if (directionShortName.equals(Direction.SOUTH.getShortName())) {
                    marsRoverPosition.coordinatesY++;
                }
            }
        }
    }

    @Override
    public MarsRoverPosition receive(String commands) {
        Arrays.asList(commands.split("")).forEach(this::receiveSingleCommand);
        return marsRoverPosition;
    }
}
