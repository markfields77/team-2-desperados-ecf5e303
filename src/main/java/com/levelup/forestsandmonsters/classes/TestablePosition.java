package com.levelup.forestsandmonsters.classes;

import java.awt.Point;

public class TestablePosition extends Position {

    public TestablePosition() {
        coordinates.x = 8;
        coordinates.y = 8;
    }

    @Override
    public Point getPosition() {
        return coordinates;
    }
}