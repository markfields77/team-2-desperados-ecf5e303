package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.awt.Point;

import com.levelup.forestsandmonsters.classes.Character;
import com.levelup.forestsandmonsters.classes.TestablePosition;
import com.levelup.forestsandmonsters.classes.Position;
 
public class CharacterTest {

    Point testCoordinates;

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
    public void testGetPosition2() {
        Character character = new Character();
        Position position = new Position();

        assertEquals(character.getPosition(), position.getPosition());
    }

    @Test
    public void testCharacterMove() {
        Character testObj = new Character();
        testObj.move();
    }

}
