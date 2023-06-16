package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.levelup.forestsandmonsters.classes.Position;

public class GameControllerTest {
    @Test
    public void initializationCreatesResults() {
        GameController testObj = new GameController();
        assertNotNull(testObj.status);
    }

    @Test
    public void testStartGame() {
        GameController testObj = new GameController();
        testObj.startGame();
        Position currentPosition = testObj.character.getPosition();
        assertEquals(5, currentPosition.getPosition().x);
        assertEquals(5, currentPosition.getPosition().y);
    }

}
