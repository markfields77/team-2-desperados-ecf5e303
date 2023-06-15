package com.levelup.forestsandmonsters.classes;

import java.awt.Point;

public class Character {

    public static String DEFAULT_NAME;
    public String name = " ";
    Position position;

    public Character() {
     position = new Position();
    };

    public Character(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    };
    
    public Point getPosition() {
        return position.getPosition();
    }   

    public void move() {
        
    } 
}
