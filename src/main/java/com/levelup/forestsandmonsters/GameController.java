package com.levelup.forestsandmonsters;
import com.levelup.forestsandmonsters.classes.GameMap;
import com.levelup.forestsandmonsters.classes.Character;
import com.levelup.forestsandmonsters.classes.DIRECTION;

import java.awt.Point;

public class GameController {

    static final String DEFAULT_CHARACTER_NAME = "Character";
    GameMap gameMap;
    Character character;

    public class GameStatus {
        // TODO: Add other status data
        public String characterName = DEFAULT_CHARACTER_NAME;
        public Point currentPosition = new Point(5, 5);
        // TODO: Write a failing unit test that will force you to set this to the right number
        public int moveCount = 0;
    }

    GameStatus status;

    public GameController() {
        status = new GameStatus();
        character = new Character();
        gameMap = new GameMap();
    }

    // TODO: Ensure this AND CLI commands match domain model
    // public static enum DIRECTION {
    //     NORTH, SOUTH, EAST, WEST
    // }

    // Pre-implemented to demonstrate ATDD
    // TODO: Update this if it does not match your design
    public void createCharacter(String name) {
        if (name != null && !name.equals("")) {
            status.characterName = name;
        } else {
            status.characterName = DEFAULT_CHARACTER_NAME;
        }
    }

    public void startGame() {
        // TODO: Implement startGame - Should probably create tiles and put the character
        // on them?
        // TODO: Should also update the game results?
        character.enterMap(gameMap);
        GameStatus gameStatus = this.getStatus();
        this.printStatus(gameStatus);
    }

    public GameStatus getStatus() {
        return this.status;
    }

    public void printStatus(GameStatus gameStatus)
    {
        System.out.println("");
        System.out.print(gameStatus.characterName+" is currently at ");
        System.out.print(gameStatus.currentPosition + " and you have taken ");
        System.out.print(gameStatus.moveCount+ " moves " );
        System.out.println("");
    }

    public void move(DIRECTION directionToMove) {
        // TODO: Implement move - should call something on another class
        // TODO: Should probably also update the game results
        character.move(directionToMove);
        GameStatus gameStatus = this.getStatus();
        gameStatus.moveCount++;
        gameStatus.currentPosition = character.getPosition().getPosition();
        printStatus(gameStatus);
    }

    public void setCharacterPosition(Point coordinates) {
        // TODO: IMPLEMENT THIS TO SET CHARACTERS CURRENT POSITION -- exists to be testable
    }

    public void setCurrentMoveCount(int moveCount) {
        // TODO: IMPLEMENT THIS TO SET CURRENT MOVE COUNT -- exists to be testable
    }

    public int getTotalPositions() {
        // TODO: IMPLEMENT THIS TO GET THE TOTAL POSITIONS FROM THE MAP -- exists to be
        // testable
        return -10;
    }

}
