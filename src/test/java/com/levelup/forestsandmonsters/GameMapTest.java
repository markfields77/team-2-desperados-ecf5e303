package com.levelup.forestsandmonsters;

import com.levelup.forestsandmonsters.classes.GameMap;
import com.levelup.forestsandmonsters.classes.Position;
import com.levelup.forestsandmonsters.classes.DIRECTION;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import java.awt.Point;

public class GameMapTest {

    @Test
    public void initializationGameMap() {
        GameMap testObj = new GameMap();
        assertNotNull(testObj.getTotalPositions());
    }
    
    @Test
    public void testNumPositionsGameMap() {
        GameMap testObj = new GameMap();
        assertEquals(100, testObj.getTotalPositions());
    }   
    
    @Test
    public void testIsPositionValidGameMap() {
        GameMap testObj = new GameMap();
        Point point = new Point(1,5);
        assertTrue(testObj.getIsPostionValid(point));
        point = new Point(10,50);
        assertFalse(testObj.getIsPostionValid(point));
        point = new Point(-1,0);
        assertFalse(testObj.getIsPostionValid(point));
    }   

    @Test
    public void testCalculatePositionGameMap() {
        Point point = new Point(1,5);
        Position position = new Position(point);
        GameMap testObj = new GameMap();
        Position newPosition = new Position(new Point(1,4));
        Position calculatedPosition = testObj.calculatePosition(position, DIRECTION.N);
        assertEquals(newPosition.getPosition().x, calculatedPosition.getPosition().x);
        assertEquals(newPosition.getPosition().y, calculatedPosition.getPosition().y);
    }  
}
