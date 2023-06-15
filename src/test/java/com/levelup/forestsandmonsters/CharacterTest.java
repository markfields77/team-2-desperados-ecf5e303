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
   
    public void testCharacterName() {

        String testName = "Pedro";
        Character character = new Character(testName);
        assertEquals(testName, character.name);
    }

}
