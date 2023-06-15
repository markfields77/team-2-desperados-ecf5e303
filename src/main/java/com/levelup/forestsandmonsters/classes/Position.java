package com.levelup.forestsandmonsters.classes;

import java.awt.Point;

public class Position {

    Point coordinates;
    
    public Position() {
        coordinates = new Point();
        coordinates.x=0;
        coordinates.y=0;
    }


    public Position(Point point) {
        coordinates.x = point.x;
        coordinates.y = point.y;
    }

    public Point getPosition() {
        return coordinates;
    }

    public void setPosition(Point point) {
        coordinates.x = point.x;
        coordinates.y = point.y;
    }
    
}
