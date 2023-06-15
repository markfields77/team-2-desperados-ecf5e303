package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.levelup.forestsandmonsters.classes.Character;
 
public class CharacterTest {

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

    


}
