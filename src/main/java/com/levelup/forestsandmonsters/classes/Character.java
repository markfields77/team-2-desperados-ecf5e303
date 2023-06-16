package com.levelup.forestsandmonsters.classes;

import java.awt.Point;
import com.levelup.forestsandmonsters.classes.DIRECTION;
import com.levelup.forestsandmonsters.classes.GameMap;

public class Character {

    public static String DEFAULT_NAME;
    public String name = " ";
    Position position;
    GameMap gameMap;
    Boolean validPos = true;

    public Character() {
     position = new Position();
     gameMap = new GameMap();
    };

    public Character(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    };
    
    public Position getPosition() {
        Point point =  position.getPosition();
        Position newPosition = new Position();
        newPosition.coordinates.x=point.x;
        newPosition.coordinates.y=point.y;
        return newPosition;
    }   

    public void setPosition(Position newPosition) {
        position.coordinates.x = newPosition.coordinates.x;
        position.coordinates.y = newPosition.coordinates.y;
        System.out.println("Pos x "+ position.coordinates.x);
        System.out.println("Pos y "+ position.coordinates.y);
    }

    public void move(DIRECTION direction) {
        Position movedPosition = gameMap.calculatePosition(this.getPosition(), direction);
        validPos = gameMap.getIsPostionValid(movedPosition.coordinates);
        System.out.println("Valid Position : "+validPos);
        if(validPos) {
        this.setPosition(movedPosition);  
        } else {
            this.setPosition(getPosition()); 
        }
    } 

    public void enterMap(GameMap map) {
        this.setMap(map);
        this.getPosition();
    }

    public void setMap(GameMap map) {
        gameMap = map;
    }
}
