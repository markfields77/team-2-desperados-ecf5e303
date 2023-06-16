package com.levelup.forestsandmonsters.classes;
import java.awt.Point;

public class GameMap {
    
   // Position[][] positions;
    Position startingPosition;
    int numPositions=100;
   
    public GameMap () {
        startingPosition = new Position();
    }

    public GameMap (Point point) {
        numPositions=100;
        startingPosition.coordinates = point;
    }

    public int getTotalPositions() {
        return numPositions;
    }

    public boolean getIsPostionValid(Point point) {
        if((point.x >= 0 && point.y >=0) && (point.x <= 9 && point.y <=9)) {
            return true;
        } else {
        return false;
        }
    }

    public Position calculatePosition(Position startingPosition, DIRECTION direction) {
       
        Position newPosition = startingPosition;
        String directionName = direction.name();
        if( directionName.equalsIgnoreCase("N")) {
            startingPosition.coordinates.y = startingPosition.coordinates.y - 1;
            newPosition.coordinates.y = startingPosition.coordinates.y;
        }
        if(directionName.equalsIgnoreCase("W")) {
            startingPosition.coordinates.x = startingPosition.coordinates.x - 1;
            newPosition.coordinates.x = startingPosition.coordinates.x;
        }
        if(direction.name().equalsIgnoreCase("S")) {
            startingPosition.coordinates.y = startingPosition.coordinates.y + 1;
            newPosition.coordinates.y = startingPosition.coordinates.y;
        }
        if(direction.name().equalsIgnoreCase("E")) {
            startingPosition.coordinates.x = startingPosition.coordinates.x + 1;
            newPosition.coordinates.x = startingPosition.coordinates.x;
        }
        return newPosition;
    }

    
}
