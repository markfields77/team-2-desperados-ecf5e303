package com.levelup.forestsandmonsters.classes;

import java.awt.Point;

public class Position {

    Point coordinates;
    
    public Position() {
        coordinates = new Point();
        coordinates.x=0;
        coordinates.y=0;
    }


    public Position(int XCoordinates, int YCoordinates) {
        coordinates.x = XCoordinates;
        coordinates.y = YCoordinates;
    }

    public Point getPosition() {
        return coordinates;
    }
    
}
