package com.levelup.forestsandmonsters;
import com.levelup.forestsandmonsters.classes.Position;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import java.awt.Point;

public class PositionTest {

    @Test
    public void initializationPosition() {
        Position testObj = new Position();
        assertNotNull(testObj.getPosition());
    }

    @Test
    public void testSetPosition() {
        Position testObj = new Position();
        Point point = new Point();
        point.x = 9;
        point.y = 5;
        testObj.setPosition(point);
        assertNotNull(testObj.getPosition());
        assertEquals(testObj.getPosition().x, 9);
        assertEquals(testObj.getPosition().y, 5);
    }

}
