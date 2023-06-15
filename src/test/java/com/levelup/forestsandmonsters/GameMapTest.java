package com.levelup.forestsandmonsters;

import com.levelup.forestsandmonsters.classes.GameMap;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GameMapTest {

    @Test
    public void initializationGameMap() {
        GameMap testObj = new GameMap();
        assertNotNull(testObj.getNumPositions());
    }
    
    @Test
    public void testNumPositionsGameMap() {
        GameMap testObj = new GameMap();
        assertEquals(100, testObj.getNumPositions());
    }   
    
}
