package com.levelup.forestsandmonsters;
import com.levelup.forestsandmonsters.classes.Position;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class PositionTest {
    
    @Test
    public void initializationSetPosition() {
        Position testObj = new Position();
        assertNotNull(testObj.getPosition());
    }

}
