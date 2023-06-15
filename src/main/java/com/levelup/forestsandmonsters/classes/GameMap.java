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

    public int getNumPositions() {
        return numPositions;
    }


    
}
