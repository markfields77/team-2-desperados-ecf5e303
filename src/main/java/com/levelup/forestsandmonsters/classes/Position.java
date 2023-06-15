package com.levelup.forestsandmonsters.classes;

import java.awt.Point;

public class Position {

    Point coordinates;
    
    public Position() {
        coordinates = new Point();
        coordinates.x=5;
        coordinates.y=5;
    }


    public Position(Point point) {
        this.coordinates = point;
    }

    public Point getPosition() {
        return coordinates;
    }

    public void setPosition(Point point) {
        coordinates.x = point.x;
        coordinates.y = point.y;
    }
    
}
