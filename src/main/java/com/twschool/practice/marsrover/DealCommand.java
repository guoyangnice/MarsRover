package com.twschool.practice.marsrover;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DealCommand implements CommandInterface {

    private MarsRoverPosition marsRoverPosition;
    private boolean backStatus = false;
    private List<String> backList = new ArrayList<>(1);
    private List<String> spaceList = new ArrayList<>(1);
    private boolean forwardStatus = true;
    private boolean spaceStatus = false;

    public DealCommand(MarsRoverPosition marsRoverPosition){
        this.marsRoverPosition = marsRoverPosition;
    }

    @Override
    public void receiveSingleCommand(String command) {

        if(command.equals(Command.BACK.getShortName()) && backList.size() == 0){
            backStatus = true;
            forwardStatus = false;
            backList.add(command);
        }else if(command.equals(Command.BACK.getShortName()) && backList.size() > 0){
            backStatus = false;
            forwardStatus = true;
            backList.clear();
        }

        if(backStatus && Command.MOVE.getShortName().equals(command)) {
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

        if (forwardStatus && Command.MOVE.getShortName().equals(command)) {
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

        if(Command.SPACE.getShortName().equals(command) && spaceList.size() == 0 ){
            spaceStatus = true;
            spaceList.add(command);
        }else if(Command.SPACE.getShortName().equals(command) && spaceList.size() > 0){
            spaceStatus = false;
            spaceList.clear();
        }

        if(forwardStatus && spaceStatus && Command.MOVE.getShortName().equals(command)){
            String directionShortName = marsRoverPosition.direction.getShortName();
            if (directionShortName.equals(Direction.NORTH.getShortName())) {
                marsRoverPosition.coordinatesY+=2;
            } else if (directionShortName.equals(Direction.EAST.getShortName())) {
                marsRoverPosition.coordinatesX+=2;
            } else if (directionShortName.equals(Direction.WEST.getShortName())) {
                marsRoverPosition.coordinatesX-=2;
            } else if (directionShortName.equals(Direction.SOUTH.getShortName())) {
                marsRoverPosition.coordinatesY-=2;
            }
        }

        if(backStatus && spaceStatus && Command.MOVE.getShortName().equals(command)){
            String directionShortName = marsRoverPosition.direction.getShortName();
            if (directionShortName.equals(Direction.NORTH.getShortName())) {
                marsRoverPosition.coordinatesY-=2;
            } else if (directionShortName.equals(Direction.EAST.getShortName())) {
                marsRoverPosition.coordinatesX-=2;
            } else if (directionShortName.equals(Direction.WEST.getShortName())) {
                marsRoverPosition.coordinatesX+=2;
            } else if (directionShortName.equals(Direction.SOUTH.getShortName())) {
                marsRoverPosition.coordinatesY+=2;
            }
        }

        if(spaceStatus && Command.MOVE.getShortName().equals(command)){

        }

        if (Command.TURN_LEFT.getShortName().equals(command)) {
            marsRoverPosition.direction = marsRoverPosition.direction.leftDirection();
        }
        if (Command.TURN_RIGHT.getShortName().equals(command)) {
            marsRoverPosition.direction = marsRoverPosition.direction.rightDirection();
        }
    }

    @Override
    public MarsRoverPosition receive(String commands) {
        Arrays.asList(commands.split("")).forEach(this::receiveSingleCommand);
        return marsRoverPosition;
    }
}
