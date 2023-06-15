Feature: Move in a direction 
    
    I want to move my character. If they attempt to 
    move past a boundary, the move results in no change in position but does increment move count.

    Scenario Outline: Move in a direction
        Given the character starts at position with XCoordinates <startingPositionX> 
        And starts at YCoordinates <startingPositionY>
        And the player choses to move in <direction>
        And the current move count is <startingMoveCount>
        When the character moves
        Then the character is now at position with XCoordinates <endingPositionX>
        And YCoordinates <endingPositionY>
        And the new move count is <endingMoveCount>
        Examples:
            | startingPositionX | startingPositionY | direction | startingMoveCount | endingPositionX | endingPositionY | endingMoveCount |
            | 5 | 5 | N | 0 | 5 | 4 | 1 |
            | 5 | 0 | N | 5 | 5 | 0 | 6 |
            | 9 | 9 | W | 3 | 8 | 9 | 4 |
            | 6 | 5 | S | 2 | 6 | 6 | 3 |
            | 8 | 4 | E | 7 | 8 | 5 | 8 |
            | 5 | 0 | S | 5 | 6 | 0 | 6 |
            | 5 | 0 | W | 3 | 4 | 0 | 4 |
            | 5 | 0 | E | 4 | 5 | 1 | 5 |
            | 0 | 0 | N | 205 | 0 | 0 | 206 |
            | 0 | 0 | S | 143 | 0 | 1 | 144 |
            | 0 | 0 | W | 62 | 0 | 0 | 63 |
            | 0 | 0 | E | 14 | 1 | 0 | 15 |