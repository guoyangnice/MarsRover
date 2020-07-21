package com.twschool.practice.marsrover;

import java.util.Arrays;

public enum Direction {
    NORTH("N") {
        @Override
        public Direction leftDirection() {
            return WEST;
        }

        @Override
        public Direction rightDirection() {
            return EAST;
        }
    }, WEST("W") {
        @Override
        public Direction leftDirection() {
            return SOUTH;
        }

        @Override
        public Direction rightDirection() {
            return NORTH;
        }
    }, SOUTH("S") {
        @Override
        public Direction leftDirection() {
            return EAST;
        }

        @Override
        public Direction rightDirection() {
            return WEST;
        }
    }, EAST("E") {
        @Override
        public Direction leftDirection() {
            return NORTH;
        }

        @Override
        public Direction rightDirection() {
            return SOUTH;
        }
    };

    private String shortName;

    Direction(String shortName) {

        this.shortName = shortName;
    }

    public static Direction fromShortName(String shortName) {
        return Arrays.stream(Direction.values())
                .filter(direction -> direction.getShortName().equals(shortName))
                .findFirst()
                .orElseThrow(RuntimeException::new);
    }

    public String getShortName() {
        return shortName;
    }

    public abstract Direction leftDirection();
    
    public abstract Direction rightDirection();
}
