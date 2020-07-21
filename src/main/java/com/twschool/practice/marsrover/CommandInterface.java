package com.twschool.practice.marsrover;

public interface CommandInterface {

    void receiveSingleCommand(String commands);

    MarsRoverPosition receive(String commands);
}
