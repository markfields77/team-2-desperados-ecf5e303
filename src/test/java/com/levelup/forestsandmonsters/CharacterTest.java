package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.awt.Point;

import com.levelup.forestsandmonsters.classes.Character;
import com.levelup.forestsandmonsters.classes.DIRECTION;
import com.levelup.forestsandmonsters.classes.GameMap;
import com.levelup.forestsandmonsters.classes.TestablePosition;
import com.levelup.forestsandmonsters.classes.Position;
 
public class CharacterTest {

    Point testCoordinates;
    Position position;

    @Test
    public void initializationCharacter() {
        Character testObj = new Character();
        assertNotNull(testObj.name);
    }
   
    @Test
    public void testCharacterName() {
        String testName = "Pedro";
        Character character = new Character(testName);
        assertEquals(testName, character.name);
    }

    @Test
    public void testGetName() {
        String testName = "Pedro";
        Character character = new Character(testName);
        String retrieveName = character.getName();
        assertEquals(testName, retrieveName);
    }

    @Test 
    public void testGetPosition() {
        TestablePosition testPosition = new TestablePosition();

        testCoordinates = new Point();
        testCoordinates.x=8;
        testCoordinates.y=8;

        Point point = testPosition.getPosition();

        assertEquals(point, testCoordinates);
    }

    @Test
    public void testCharacterMove() {
        Character testObj = new Character();
        position = new Position();       

        testObj.move(DIRECTION.N);

        Position testPostion = testObj.getPosition();
        System.out.print(testPostion.getPosition().x);
        System.out.print(testPostion.getPosition().y);
        assertNotNull(null, testPostion);
        assertEquals(5, testPostion.getPosition().x);
        assertEquals(4, testPostion.getPosition().y);
    }

    @Test
    public void testEnterMap() {
        Character testObj = new Character();
        GameMap gameMap = new GameMap();
        testObj.enterMap(gameMap);
        Position currentPosition = testObj.getPosition();
        assertEquals(5, currentPosition.getPosition().x);
        assertEquals(5, currentPosition.getPosition().y);
    }

}
